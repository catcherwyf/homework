package com.catcher.autoFiguration.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@EnableConfigurationProperties(SchoolProperties.class)
public class SchoolAutoConfiguration {
    @Autowired
    private SchoolProperties schoolProperties;

    @Bean
    public School school(){
        int id = schoolProperties.getId();
        String name = schoolProperties.getName();

        return new School();
    }
}
