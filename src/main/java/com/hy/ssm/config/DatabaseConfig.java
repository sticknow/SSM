package com.hy.ssm.config;

import com.hy.ssm.security.config.WebSecurityConfiguration;
import com.zaxxer.hikari.HikariDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import java.beans.PropertyVetoException;


@Configuration
@ComponentScan(basePackages = {"com.hy.ssm"},
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)})
@Import(WebSecurityConfiguration.class)
@EnableAspectJAutoProxy
@EnableTransactionManagement
public class DatabaseConfig {

    @Bean
    public HikariDataSource getDataSource(){
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setDataSourceClassName("com.mysql.jdbc.jdbc2.optional.MysqlDataSource");
        dataSource.addDataSourceProperty("databaseName", "demorest");
        dataSource.addDataSourceProperty("portNumber", "3306");
        dataSource.addDataSourceProperty("serverName", "127.0.0.1");
        dataSource.addDataSourceProperty("user", "root");
        dataSource.addDataSourceProperty("password", "123456");
        return dataSource;
    }
    @Bean
    public DataSourceTransactionManager transactionManager() throws PropertyVetoException {
        return new DataSourceTransactionManager(getDataSource());
    }

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactoryBean sqlSessionFactory() throws Exception{
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(getDataSource());
        sqlSessionFactory.setConfigLocation(new ClassPathResource("config.xml"));
        sqlSessionFactory.setMapperLocations(new ClassPathResource[]{new ClassPathResource("mapper/AppUserMapper.xml")});
        sqlSessionFactory.setTypeAliasesPackage("com.hy.ssm.domain");
        return sqlSessionFactory;
    }

}
