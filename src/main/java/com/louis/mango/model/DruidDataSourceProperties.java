package com.louis.mango.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by IntelliJ IDEA.
 *
 * @author xiaokun wang
 * description:
 * path: mango-v2-com.louis.mango.config-DruidDataSourceProperties
 * date: 2019/11/16 11:35
 */
//对Druid进行自定义属性
@ConfigurationProperties(prefix = "spring.datasource.druid")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DruidDataSourceProperties {
    // jdbc
    private String driverClassName;
    private String url;
    private String username;
    private String password;
    // jdbc connection pool
    private int initialSize;
    private int minIdle;
    private int maxActive = 100;
    private long maxWait;
    private long timeBetweenEvictionRunsMillis;
    private long minEvictableIdleTimeMillis;
    private String validationQuery;
    private boolean testWhileIdle;
    private boolean testOnBorrow;
    private boolean testOnReturn;
    private boolean poolPreparedStatements;
    private int maxPoolPreparedStatementPerConnectionSize;
    // filter
    private String filters;
}
