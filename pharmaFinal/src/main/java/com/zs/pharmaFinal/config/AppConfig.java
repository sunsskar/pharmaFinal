package com.zs.pharmaFinal.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.sql.DataSource;

@EnableAutoConfiguration
@SpringBootConfiguration
@Configuration
@ComponentScan("com.zs.pharmaFinal")
@PropertySource("classpath:application.properties")
public class AppConfig {
    @Autowired
    Environment environment;

    @Bean
    DataSource dataSource() {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        String URL = "url";
        driverManagerDataSource.setUrl(environment.getProperty(URL));
        String USER = "dbuser";
        driverManagerDataSource.setUsername(environment.getProperty(USER));
        String PASSWORD = "dbpassword";
        driverManagerDataSource.setPassword(environment.getProperty(PASSWORD));
        String DRIVER = "driver";
        driverManagerDataSource.setDriverClassName(environment.getProperty(DRIVER));
        return driverManagerDataSource;
    }
}

