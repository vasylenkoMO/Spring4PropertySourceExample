package com.vasylenko.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by vastl271nko on 09.10.16.
 */
@Configuration
@ComponentScan(basePackages = "com.vasylenko.spring")
@PropertySource(value = { "classpath:application.properties" })
public class AppConfig {
    /*
    * PropertySourcesPlaceHolderConfigurer Bean only required for @Value("{}") annotations.
    * Remove this bean if you are not using @Value annotations for injecting properties.
    */
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
