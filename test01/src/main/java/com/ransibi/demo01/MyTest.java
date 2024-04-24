package com.ransibi.demo01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

/**
 * 该firstBean方法用 进行注释@Bean，表明它生成一个名为“firstBean”的 bean。
 * 该secondBean方法用@Bean和进行注释@DependsOn(“firstBean”)。这意味着“secondBean”bean 依赖于“firstBean”bean。
 * 通过此设置，Spring 将确保在应用程序上下文初始化期间“firstBean”在“secondBean”之前初始化。
 */
@Component
public class MyTest {

    @Bean(name = "firstBean")
    public void firstBean() {
        System.out.println("firstBean");
    }

    @Bean(name = "secondBean")
    @DependsOn("firstBean")
    public void secondBean() {
        System.out.println("secondBean");
    }
}
