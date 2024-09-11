package com.ransibi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @description: ${description}
 * @author: rsb
 * @description: 2024-09-11-13-35
 * @description: ${description}
 * @Version: 1.0.0
 */
@SpringBootApplication
@EnableScheduling
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class);
    }
}