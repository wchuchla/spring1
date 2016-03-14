package com.luxoft.spring.spring1.utils;

import org.springframework.stereotype.Component;

@Component
public class Logger {

    private static Logger INSTANCE;

    private Logger() {
    }

    public static Logger getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Logger();
        }
        return INSTANCE;
    }

    public void log(String text) {
        System.out.println("LOG:" + System.currentTimeMillis() + ":" + text);
    }
}
