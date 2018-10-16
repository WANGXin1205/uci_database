package com.growlithe.uci.utils;


import com.growlithe.uci.common.bean.CandyResult;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.*;

/**
 * excel导入导出
 *
 * @author wangk
 * @date 2015年9月21日 上午9:49:00
 * @Description:
 * @project claim_web
 */
public final class ExcelsUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExcelsUtil.class);
    /**
     *  12号字体
     */
    private static final short FONT_HEIGHT_IN_POINTS = 12;
    /**
     * Excel 2003文件后缀
     */
    private final static String XLS = "xls";
    /**
     * Excel 2007文件后缀
     */
    private final static String XLSX = "xlsx";
    /**
     * 分隔符
     */
    public final static String SEPARATOR = "##";
    /**
     * int最大值
     */
    public final static BigDecimal MAX_INT = new BigDecimal(Integer.MAX_VALUE);
    /**
     * int最小值
     */
    public final static BigDecimal MIN_INT = new BigDecimal(Integer.MIN_VALUE);
    /**
     * double格式化
     **/
    public final static NumberFormat DF = NumberFormat.getNumberInstance();

    static {
        DF.setMaximumFractionDigits(2);
    }

    /**
     * 私有构造
     */
    private ExcelsUtil() {

    }

    /**
     * 拼装excel
     *
     * @param columnNames      列中文名
     * @param columnFieldNames 列名
     * @param list
     * @return
     */
    public static HSSFWorkbook createWorkbook(String[] columnNames, String[] columnFieldNames, List<?> list) {
        HSSFWorkbook workbook = new HSSFWorkbook();
        try {
            HSSFSheet sheet = workbook.createSheet("sheet1");
            HSSFRow row = sheet.createRow(0); // 创建第1行，也就是输出列头
            HSSFCell cell;
            CellStyle styleHead = getHeadStyle(workbook);// 列头样式
            // 创建列头
            for (int i = 0; i < columnNames.length; i++) {
                cell = row.createCell(i);
                cell.setCellStyle(styleHead);// 设置样式
                cell.setCellType(CellType.STRING);
                cell.setCellValue(new HSSFRichTextString(columnNames[i]));
                sheet.setColumnWidth(i, 22 * 256);// 设置默认列宽
            }
            // 各行数据
            Object exp = null;
            CellStyle styleNormal = getNormalStyle(workbook);
            if (list != null && list.size() > 0) {
                for (int i = 0; i < list.size(); i++) {
                    exp = list.get(i);
                    row = sheet.createRow(i + 1);// 创建第i+1行
                    for (int j = 0; j < columnFieldNames.length; j++) {
                        cell = row.createCell(j);// 创建列
                        // 通过方法名来取得对应方法返回的结果对象
                        Object obj = ObjectUtil.getValue(columnFieldNames[j], exp);
                        cell.setCellStyle(styleNormal);// 设置样式
                        cell.setCellType(CellType.STRING);

                        if (obj != null) {
                            String str = obj.toString();
                            if (Date.class.isInstance(obj)) {
                                str = DateFormatUtils.format((Date) obj, "yyyy-MM");
                            }
                            if (isDouble(str)) {
                                cell.setCellValue(new Double(str));
                            } else if (isInteger(str)) {
                                cell.setCellValue(new Integer(str));
                            } else {
                                cell.setCellValue(str);
                            }
                        } else {
                            cell.setCellValue("");
                        }
                    }
                }
            }
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            return workbook;
        }
        return workbook;
    }


    /**
     * 拼装excel
     *
     * @param workbook
     * @param list
     * @param columnFieldNames
     * @return
     */
    public static HSSFWorkbook createWorkbook(HSSFWorkbook workbook, List<?> list, String... columnFieldNames) {
        try {
            HSSFSheet sheet = workbook.getSheetAt(0);
            // 各行数据
            Object exp = null;
            HSSFRow row = null;
            HSSFCell cell;
            if (list.size() != 0) {
                for (int i = 0; i < list.size(); i++) {
                    exp = list.get(i);
                    row = sheet.createRow(i + 1);// 创建第i+1行
                    for (int j = 0; j < columnFieldNames.length; j++) {
                        cell = row.createCell(j);// 创建列
                        // 通过方法名来取得对应方法返回的结果对象
                        Object obj = ObjectUtil.getValue(columnFieldNames[j], exp);
                        cell.setCellType(CellType.STRING);
                        if (obj != null) {
                            String str = obj.toString();
                            if (Date.class.isInstance(obj)) {
                                str = DateFormatUtils.format((java.util.Date) obj, "yyyy-MM-dd HH:mm:ss");
                            }
                            if (isDouble(str)) {
                                cell.setCellValue(new Double(str));
                            } else if (isInteger(str)) {
                                cell.setCellValue(new Integer(str));
                            } else {
                                cell.setCellValue(str);
                            }
                        } else {
                            cell.setCellValue("");
                        }
                    }
                }
            }
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            return workbook;
        }
        return workbook;
    }


    /**
     * 拼装excel
     *
     * @param filePath
     * @param list
     * @param columnFieldNames
     * @return
     */
    public static XSSFWorkbook createWorkbook(String filePath, List<?> list, String... columnFieldNames) {
        //StopWatch stopWatch = new StopWatch("utils");
        XSSFWorkbook workbook = createXSSFWorkbook(filePath);
        try {
            XSSFSheet sheet = workbook.getSheetAt(0);
            // 各行数据
            Object exp;
            XSSFRow row;
            XSSFCell cell;
            XSSFDataFormat df = workbook.createDataFormat();
            Map<String, CellStyle> cellStyleMap = new HashMap<>();
            if (list.size() != 0) {
                for (int i = 0; i < list.size(); i++) {
                    //stopWatch.start("第" + i + "行数据");
                    exp = list.get(i);
                    if(exp != null) LOGGER.info(ParamUtils.serializable(exp));
                    row = sheet.createRow(i + 1);// 创建第i+1行
                    for (int j = 0; j < columnFieldNames.length; j++) {
                        cell = row.createCell(j);// 创建列
                        // 通过方法名来取得对应方法返回的结果对象
                        Object obj = ObjectUtil.getValue(columnFieldNames[j], exp);
                        CellStyle cellStyle = cellStyleMap.get(columnFieldNames[j]);
                        if(cellStyle == null){
                            cellStyle = workbook.createCellStyle();
                            if(obj instanceof BigDecimal){
                                cell.setCellType(CellType.NUMERIC);
                                cellStyle.setDataFormat(df.getFormat("#,##0.00"));
                            }else{
                                cell.setCellType(CellType.STRING);
                                cellStyle.setDataFormat(df.getFormat("Text"));
                            }
                            cellStyle.setAlignment(HorizontalAlignment.CENTER);
                            cellStyleMap.put(columnFieldNames[j], cellStyle);
                        }

                        cell.setCellStyle(cellStyle);
                        if (obj != null) {
                            String str = obj.toString();
                            if (Date.class.isInstance(obj)) {
                                str = DateFormatUtils.format((java.util.Date) obj, "yyyy-MM-dd HH:mm:ss");
                            }
                            if (isDouble(str)) {
                                cell.setCellValue(new Double(str));
                            } else if (isInteger(str)) {
                                BigDecimal intValue = new BigDecimal(str);
                                // 如果数字大于或者小于
                                if(intValue.compareTo(MAX_INT) > 0 || intValue.compareTo(MIN_INT) < 0) {
                                    cell.setCellValue(str);
                                } else {
                                    cell.setCellValue(new Integer(str));
                                }
                            } else {
                                cell.setCellValue(str);
                            }
                        } else {
                            cell.setCellValue("");
                        }
                    }
                    //stopWatch.stop();
                }
            }
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            return workbook;
        }
        //LOGGER.info("下载数据,createWorkbook执行时间：{}ms", stopWatch.prettyPrint());
        return workbook;
    }


    /**
     * 列头样式
     *
     * @param workbook
     * @return
     */
    private static CellStyle getHeadStyle(HSSFWorkbook workbook) {
        CellStyle style = workbook.createCellStyle();
        HSSFFont font = workbook.createFont();
        // 字体
        font.setFontName("宋体");
        font.setFontHeightInPoints(FONT_HEIGHT_IN_POINTS);// 字号12号
        style.setFillPattern(FillPatternType.NO_FILL);// 上下居中
        style.setAlignment(HorizontalAlignment.CENTER);// 左右居中
        style.setFillForegroundColor(HSSFColor.HSSFColorPredefined.WHITE.getIndex());// 设置背景颜色
        style.setLeftBorderColor(HSSFColor.HSSFColorPredefined.GREY_25_PERCENT.getIndex());
        style.setBorderLeft(BorderStyle.THIN);
        style.setRightBorderColor(HSSFColor.HSSFColorPredefined.GREY_25_PERCENT.getIndex());
        style.setBorderRight(BorderStyle.THIN);
        style.setBorderBottom(BorderStyle.THIN); // 设置单元格的边框为粗体
        style.setBottomBorderColor(HSSFColor.HSSFColorPredefined.GREY_25_PERCENT.getIndex()); // 设置单元格的边框颜色．
        style.setFont(font);
        // style.setWrapText(true);//自动换行
        return style;
    }

    /**
     * 普通样式
     *
     * @param workbook
     * @return
     */
    private static CellStyle getNormalStyle(HSSFWorkbook workbook) {
        CellStyle style = workbook.createCellStyle();
        HSSFFont font = workbook.createFont();
        font.setFontName("宋体");// 字体
        font.setFontHeightInPoints(FONT_HEIGHT_IN_POINTS);// 字号12号
        style.setFillPattern(FillPatternType.NO_FILL);// 上下居中
        style.setAlignment(HorizontalAlignment.CENTER);// 左右居中
        style.setFillForegroundColor(HSSFColor.HSSFColorPredefined.WHITE.getIndex());// 设置背景颜色
        style.setLeftBorderColor(HSSFColor.HSSFColorPredefined.GREY_25_PERCENT.getIndex());
        style.setBorderLeft(BorderStyle.THIN);
        style.setRightBorderColor(HSSFColor.HSSFColorPredefined.GREY_25_PERCENT.getIndex());
        style.setBorderRight(BorderStyle.THIN);
        style.setBorderBottom(BorderStyle.THIN); // 设置单元格的边框为粗体
        style.setBottomBorderColor(HSSFColor.HSSFColorPredefined.GREY_25_PERCENT.getIndex()); // 设置单元格的边框颜色．
        style.setFont(font);
        // style.setWrapText(true);//自动换行
        return style;
    }

    /**
     * 由Excel文件的Sheet导出至List
     *
     * @param file
     * @param sheetNum
     * @return
     */
    public static List<String> exportListFromExcel(File file, int sheetNum, int columLength) throws IOException {
        return exportListFromExcel(new FileInputStream(file), FilenameUtils.getExtension(file.getName()), sheetNum, columLength);
    }

    /**
     * 由Excel流的Sheet导出至List
     *
     * @param is
     * @param extensionName
     * @param sheetNum
     * @return
     * @throws IOException
     */
    public static List<String> exportListFromExcel(InputStream is, String extensionName, int sheetNum, int columLength)
            throws IOException {

        Workbook workbook = getWorkbook(is, extensionName, sheetNum);

        return exportListFromExcel(workbook, sheetNum, columLength);
    }

    public static Workbook getWorkbook(InputStream is, String extensionName, int sheetNum) throws IOException {
        Workbook workbook = null;

        if (extensionName.toLowerCase().equals(XLS)) {
            workbook = new XSSFWorkbook(is);
        } else if (extensionName.toLowerCase().equals(XLSX)) {
            workbook = new XSSFWorkbook(is);
        }
        return workbook;
    }

    /**
     * 由指定的Sheet导出至List
     *
     * @param workbook
     * @param sheetNum
     * @return
     * @throws IOException
     */
    private static List<String> exportListFromExcel(Workbook workbook, int sheetNum, int columLength) {

        Sheet sheet = workbook.getSheetAt(sheetNum);

        // 解析公式结果
        FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();

        List<String> list = new ArrayList<String>();

        int minRowIx = sheet.getFirstRowNum();
        int maxRowIx = sheet.getLastRowNum();
        for (int rowIx = minRowIx; rowIx <= maxRowIx; rowIx++) {
            Row row = sheet.getRow(rowIx);
            if (row == null) {
                continue;
            }
            StringBuilder sb = new StringBuilder();

            int minColIx = 0;
            int maxColIx = columLength;
            for (int colIx = minColIx; colIx <= maxColIx; colIx++) {
                Cell cell = row.getCell(colIx);
                CellValue cellValue = evaluator.evaluate(cell);
                if (cellValue == null) {
                    continue;
                }
                // 经过公式解析，最后只存在Boolean、Numeric和String三种数据类型，此外就是Error了
                // 其余数据类型，根据官方文档，完全可以忽略http://poi.apache.org/spreadsheet/eval.html
                sb.append(SEPARATOR).append(getCellValue(cell, cellValue));
            }
            if (sb.indexOf(SEPARATOR) != -1) {
                sb = sb.delete(0, 2);
            }
            list.add(sb.toString());
        }
        return list;
    }

    private static String getCellValue(Cell cell, CellValue cellValue) {
        Object value = null;
        CellType cellType = cellValue.getCellTypeEnum();
        if(cellType == CellType.BOOLEAN){
            value = cellValue.getBooleanValue();
        }else if(cellType == CellType.NUMERIC){
            // 这里的日期类型会被转换为数字类型，需要判别后区分处理
            if (DateUtil.isCellDateFormatted(cell)) {
                value = cell.getDateCellValue();
            } else {
                value = DF.format(cellValue.getNumberValue());
            }
        }else if(cellType == CellType.STRING){
            value = cellValue.getStringValue();
        }else if(cellType == CellType.BOOLEAN){

        }else if(cellType == CellType.BOOLEAN){

        }
        return value.toString();
    }

    public static List<Map<String, String>> exportListFromExcel(Workbook workbook, int sheetNum, Map<String, String> keyMap) {
        Sheet sheet = workbook.getSheetAt(sheetNum);

        // 解析公式结果
        FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();
        List<Map<String, String>> list = new ArrayList<>();
        int minRowIx = sheet.getFirstRowNum();
        int maxRowIx = sheet.getLastRowNum();
        Row head = sheet.getRow(minRowIx);
        //获取excel上的表头数据
        Map<String, Integer> columnIndex = new HashMap<>();
        for (int i = head.getFirstCellNum(); i < head.getLastCellNum(); i++) {
            Cell cell = head.getCell(i);
            CellValue cellValue = evaluator.evaluate(cell);
            if (cellValue == null) {
                continue;
            }
            String columnName = getCellValue(cell, cellValue);
            if (columnIndex.containsKey(columnName)) {
                throw new RuntimeException("列名有重复，值为:" + columnName);
            } else {
                columnIndex.put(columnName, i);
            }
        }
        //获取excel中的表格数据
        for (int rowIx = minRowIx + 1; rowIx <= maxRowIx; rowIx++) {
            Row row = sheet.getRow(rowIx);
            if (row == null) {
                continue;
            }
            boolean flag = true;//默认该行列值全部为空
            Map<String, String> rowResult = new HashMap<>();
            Iterator<Cell> it = row.cellIterator();
            while (it.hasNext()) {
                Cell temp = it.next();
                CellValue cellValue = evaluator.evaluate(temp);
                if (cellValue != null) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                continue;
            }
            for (String key : keyMap.keySet()) {
                Integer index = columnIndex.get(key);
                if (index == null) {
                    throw new RuntimeException("关键列" + key + "丢失！！");
                }
                Cell cell = row.getCell(index);
                CellValue cellValue = evaluator.evaluate(cell);
                if (cellValue == null) {
                    throw new RuntimeException("行" + row.getRowNum() + ",列" + key + "为必填");
                }
                rowResult.put(keyMap.get(key), getCellValue(cell, cellValue));
            }
            list.add(rowResult);
        }
        return list;
    }

    /**
     * 从文件读取创建excel
     *
     * @param file
     */
    public static HSSFWorkbook createWorkbook(File file) {
        POIFSFileSystem fs;
        HSSFWorkbook workbook = null;
        try {
            fs = new POIFSFileSystem(new FileInputStream(file));
            //读取excel模板
            workbook = new HSSFWorkbook(fs);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return workbook;
    }

    /**
     * 从文件读取创建excel
     *
     * @param filePath
     */
    public static XSSFWorkbook createXSSFWorkbook(String filePath) {
        File file = new File(filePath);
        POIFSFileSystem fs;
        XSSFWorkbook workbook = null;
        try {
            //读取excel模板
            workbook = new XSSFWorkbook(new FileInputStream(file));

        } catch (IOException e) {
            e.printStackTrace();
        }
        return workbook;
    }


    /**
     * 从文件读取创建excel
     *
     * @param filePath
     * @author tom
     */
    public static HSSFWorkbook createWorkbook(String filePath) {
        File file = new File(filePath);
        return createWorkbook(file);
    }

    /**
     * 判断一个字符串是不是数字类型
     *
     * @param str
     * @return
     */
    public static boolean isDouble(String str) {
        return str.matches("^[-+]?\\d+\\.\\d+$");
    }

    private static boolean isInteger(String str) {
        return str.matches("^[-+]?\\d+$");
    }


    public static <T> CandyResult<String> getExcelValues(MultipartFile file, String[] columns, Class<T> Classz, List<T> resultList) {
        CandyResult<String> result = new CandyResult<>();
        result.setSuccess(true);
        if (file == null) {
            result.setMessage("文件不能为空");
            return result;
        }
        String fileName = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".") + 1);
        if (!("xls".equals(fileName) || "xlsx".equals(fileName))) {
            result.setMessage("文件类型必须为*.xlsx");
            return result;
        }
        List<String> contents;
        try {
            contents = exportListFromExcel(file.getInputStream(), "xlsx", 0,
                    columns.length);
            if (contents.size() <= 1) {
                result.setSuccess(true);
                return result;
            }
            // String[] titles = (new
            // String(contents.get(0))).split(POIUtils.SEPARATOR);
            // 第一列为标题 去掉
            contents.remove(0);
            if (!validateExcelValue(contents, columns.length)) {
                result.setSuccess(false);
                result.setMessage("请检查excel列数");
                return result;
            }
            for (String content : contents) {
                T bean;
                bean = (T) Classz.newInstance();
                String[] columnValues = content.split(SEPARATOR);
                for (int i = 0; i < columns.length; i++) {
                    if (columns[i] != "" && columnValues.length > i) {
                        try {
                            ObjectUtil.setValue(columns[i], columnValues[i], bean);
                        } catch (Exception e) {
                            result.setSuccess(false);
                            result.setMessage("id为" + columnValues[0] + "的第" + (i + 1) + "列格式不符合标准,请检查数据样式是否跟模版一致");
                            LOGGER.warn(result.getMessage());
                            return result;
                        }
                    }

                }
                resultList.add(bean);
            }

        } catch (IOException | InstantiationException | IllegalAccessException e) {
            LOGGER.error("更新失败", e);
        }
        return result;
    }

    public static boolean validateExcelValue(List<String> contents, int length) {
        if (contents.get(0).length() < length) {
            return false;
        }
        return true;
    }

}
