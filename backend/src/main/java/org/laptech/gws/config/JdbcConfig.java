package org.laptech.gws.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.EmbeddedDataSourceConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Datasource configuration for jdbc<br>
 * For each profile(dev,prod,test) use different dataSource:
 * <ul>
 * <li>Dev: default h2</li>
 * <li>Test: mysql</li>
 * <li>Prod: use jndi</li>
 * </ul>
 * @author rlapin
 */
@Configuration
public class JdbcConfig {

    @Autowired
    private DataSource dataSource;



    @Bean
    @Profile("dev")
    public DataSource dataSourceDev(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource("jdbc:sqlite:gws.db");

        dataSource.setDriverClassName("org.sqlite.JDBC");
        return dataSource;
    }

    @Bean
    @Profile("test")
    public DataSource dataSourceTest(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource("localhost/test","root","");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return dataSource;
    }

    @Bean
    @Profile("prod")
    public DataSource dataSourceProd(){
        return new JndiDataSourceLookup().getDataSource("jdbc/prod");
    }

    @Bean
    public JdbcTemplate jdbcTemplate(){
        return new JdbcTemplate(dataSource);
    }

}
