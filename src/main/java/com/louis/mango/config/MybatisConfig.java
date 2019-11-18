package com.louis.mango.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * Created by IntelliJ IDEA.
 *
 * @author xiaokun wang
 * description:
 * path: mango-v2-com.louis.mango.config-MybatisConfig
 * date: 2019/11/14 9:31
 */
//mybatis配置类

@Configuration  //表示这是一个配置类
@MapperScan("com.louis.mango.**.dao") //扫描所有的DAO
public class MybatisConfig {

    //注入数据源
    @Autowired
    private DataSource dataSource;

    //配置连接的数据源
    @Bean
    public SqlSessionFactory sqlSessionFactory()throws Exception{
        SqlSessionFactoryBean sqlSessionFactoryBean=new SqlSessionFactoryBean();

        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setTypeAliasesPackage("com.louis.dao.**.model");//扫描所有的实体类

        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath*:**/sqlmap/*.xml"));
        // 扫描映射文件 对于这样扫描xml文件放在java目录还是resources目录都可以

        return sqlSessionFactoryBean.getObject();
    }

}
