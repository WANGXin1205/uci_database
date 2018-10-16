package com.growlithe.uci.configure

import com.github.pagehelper.PageHelper
import org.apache.ibatis.plugin.Interceptor
import org.mybatis.spring.SqlSessionFactoryBean
import org.mybatis.spring.annotation.MapperScan
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.jdbc.DataSourceBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.io.support.PathMatchingResourcePatternResolver
import org.springframework.jdbc.datasource.DataSourceTransactionManager

import javax.sql.DataSource
import java.util.Properties

@Configuration
@MapperScan(basePackages = arrayOf("com.growlithe.uci.mysql.database.**.dao.mapper"), sqlSessionFactoryRef = "mysqlSqlSessionFactory")
class MysqlDataSourceConfig {

    @Bean(name = arrayOf("mysqlDataSource"))
    @ConfigurationProperties(prefix = "spring.datasource.mysql")
    fun mysqlDataSource(): DataSource {
        return DataSourceBuilder.create().build()
    }

    @Bean(name = arrayOf("mysqlTransactionManager"))
    fun mysqlTransactionManager(@Qualifier("mysqlDataSource") dataSource: DataSource): DataSourceTransactionManager {
        return DataSourceTransactionManager(dataSource)
    }

    @Bean(name = arrayOf("mysqlSqlSessionFactory"))
    @Throws(Exception::class)
    fun mysqlSqlSessionFactory(@Qualifier("mysqlDataSource") dataSource: DataSource,
                               @Qualifier("mysqlPageHelper") mysqlPageHelper: PageHelper): SqlSessionFactoryBean {
        val sessionFactory = SqlSessionFactoryBean()
        sessionFactory.setDataSource(dataSource)

        val plugins = arrayOf<Interceptor>(mysqlPageHelper)
        sessionFactory.setPlugins(plugins)
        sessionFactory.setMapperLocations(PathMatchingResourcePatternResolver()
                .getResources(MAPPER_LOCATION))
        return sessionFactory
    }

    @Bean
    fun mysqlPageHelper(): PageHelper {
        val pageHelper = PageHelper()
        val p = Properties()
        p.setProperty("offsetAsPageNum", "true")
        p.setProperty("rowBoundsWithCount", "true")
        p.setProperty("reasonable", "true")
        p.setProperty("dialect", "MYSQL")
        pageHelper.setProperties(p)
        return pageHelper
    }

    companion object {

        private val MAPPER_LOCATION = "classpath:com/growlithe/uci/mysql/database/**/dao/mapper/*.xml"
    }

}
