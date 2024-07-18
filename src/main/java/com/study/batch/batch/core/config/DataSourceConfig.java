package com.study.batch.batch.core.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * <pre>
 *
 *
 * Description : com.study.batch.batch.core.config
 * </pre>
 *
 * @author
 * @since 2024. 7. 18.
 */
@Configuration
public class DataSourceConfig {

    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder.create()
                .url("jdbc:hsqldb:mem:testdb")
                .username("sa")
                .password("")
                .driverClassName("org.hsqldb.jdbc.JDBCDriver")
                .build();
    }
}
