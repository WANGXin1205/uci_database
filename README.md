# uci_database
&nbsp;&nbsp;&nbsp;&nbsp; uci 数据库部分数据集导入至mysql数据库   
&nbsp;&nbsp;&nbsp;&nbsp;其实拿 cvs文件 和 Navicat 软件可以直接将数据导入至mysql,
但是为了日后维护和开发，我决定用kotlin写导入的代码，也能练练
手，自从从农夫离职后，好久没写代码，写代码日渐生疏，部分代码
来源于农夫的林哥，李哥，康少，日后我回重构（重构，你懂的）

## 2018.10   
&nbsp;&nbsp;&nbsp;&nbsp; 项目搭建，规范代码中函数命名，筛选数据集，建立数据集概况表，
增加abalone和absenteeism_at_work，adult，anuran_calls数据集的保存和查询所有数据的方法。
同时使用navicat导入cvs,建表效率提升。完成数据集概况表中部分数据集的查询。

## 2018.11
&nbsp;&nbsp;&nbsp;&nbsp; 完善数据集，录入数据

## 未来计划   
1.筛选数据集导入mysql，给出init，仅仅是结构，对于特大型的数据集，不给cvs，给出url。
2.建立DO，写一个通用算法，可以计算分类属性数目。

this project discard, we can lead in database by .cvs or .xls and navicat tools 
