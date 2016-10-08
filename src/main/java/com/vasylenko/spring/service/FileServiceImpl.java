package com.vasylenko.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

/**
 * Created by vastl271nko on 09.10.16.
 */
@Service("fileService")
public class FileServiceImpl implements FileService {

    @Value("${sourceLocation:/home/vastl271nko/Documents/input}")
    private String source;

    @Value("${destination:/home/vastl271nko/Documents/output}")
    private String destination;

    @Autowired
    private Environment environment;

    @Override
    public void readValues() {
        System.out.println("Getting property via Spring Environment :"
                + environment.getProperty("jdbc.driverClassName"));

        System.out.println("Source Location : " + source);
        System.out.println("Destination Location : " + destination);
    }
}
