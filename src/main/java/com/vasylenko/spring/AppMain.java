package com.vasylenko.spring;

import com.vasylenko.spring.configuration.AppConfig;
import com.vasylenko.spring.service.FileService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Created by vastl271nko on 09.10.16.
 */
public class AppMain {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        FileService service = (FileService) context.getBean("fileService");

        service.readValues();
        context.close();
    }
}
