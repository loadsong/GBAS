package com.service.core.configurer;

import com.alibaba.druid.pool.DruidDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author songmeng
 */
@Configuration
public class DruidDataSourceConfigurer {

    private Logger logger = LoggerFactory.getLogger(DruidDataSourceConfigurer.class);

    @Value("${spring.datasource.db1.url}")
    private String dbUrl;

    @Value("${spring.datasource.db1.username}")
    private String username;

    @Value("${spring.datasource.db1.password}")
    private String password;

    @Value("${spring.datasource.db1.driver-class-name}")
    private String driverClassName;

    @Value("${spring.datasource.db1.initialSize}")
    private int initialSize;

    @Value("${spring.datasource.db1.minIdle}")
    private int minIdle;

    @Value("${spring.datasource.db1.maxActive}")
    private int maxActive;

    @Value("${spring.datasource.db1.maxWait}")
    private int maxWait;

    @Value("${spring.datasource.db1.timeBetweenEvictionRunsMillis}")
    private int timeBetweenEvictionRunsMillis;

    @Value("${spring.datasource.db1.minEvictableIdleTimeMillis}")
    private int minEvictableIdleTimeMillis;

    @Value("${spring.datasource.db1.validationQuery}")
    private String validationQuery;

    @Value("${spring.datasource.db1.testWhileIdle}")
    private boolean testWhileIdle;

    @Value("${spring.datasource.db1.testOnBorrow}")
    private boolean testOnBorrow;

    @Value("${spring.datasource.db1.testOnReturn}")
    private boolean testOnReturn;

    @Value("${spring.datasource.db1.poolPreparedStatements}")
    private boolean poolPreparedStatements;

    @Value("${spring.datasource.db1.maxPoolPreparedStatementPerConnectionSize}")
    private int maxPoolPreparedStatementPerConnectionSize;

    @Value("${spring.datasource.db1.filters}")
    private String filters;

    @Value("${spring.datasource.db1.connectionProperties}")
    private String connectionProperties;

    @Bean
    public DataSource getDataSource() {
        DruidDataSource datasource = new DruidDataSource();
        datasource.setUrl(this.dbUrl);
        datasource.setUsername(username);
        datasource.setPassword(password);
        datasource.setDriverClassName(driverClassName);

        //configuration
        datasource.setInitialSize(initialSize);
        datasource.setMinIdle(minIdle);
        datasource.setMaxActive(maxActive);
        datasource.setMaxWait(maxWait);
        datasource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
        datasource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        datasource.setValidationQuery(validationQuery);
        datasource.setTestWhileIdle(testWhileIdle);
        datasource.setTestOnBorrow(testOnBorrow);
        datasource.setTestOnReturn(testOnReturn);
        datasource.setPoolPreparedStatements(poolPreparedStatements);
        datasource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);
        try {
            datasource.setFilters(filters);
        } catch (SQLException e) {
            logger.error("druid configuration initialization filter", e);
        }
        datasource.setConnectionProperties(connectionProperties);

        return datasource;
    }
}
