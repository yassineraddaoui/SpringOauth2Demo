package com.jee.project.myreddit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;

@SpringBootApplication
public class MyRedditApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyRedditApplication.class, args);
    }

}
