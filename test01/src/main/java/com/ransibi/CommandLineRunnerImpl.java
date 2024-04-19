package com.ransibi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Order(1)
public class CommandLineRunnerImpl implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i < 20; i++) {
            System.out.println("====CommandLineRunnerImpl已执行====");
        }
    }
}
