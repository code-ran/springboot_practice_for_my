package com.ransibi.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * 如果想在生成对象时完成某些初始化操作，而偏偏这些初始化操作又依赖于依赖注入，那么久无法在构造函数中实现。
 * 为此，可以使用@PostConstruct注解一个方法来完成初始化，@PostConstruct注解的方法将会在依赖注入完成后被自动调用。
 * 执行顺序: 构造方法 -> @Autowireed -> @PostConstruct
 */
@Component
public class MockData {

    @Autowired
    private TestService testService;

    public MockData(){
        System.out.println("构造函数");
    }
    @PostConstruct
    public void init(){
        System.out.println("初始化操作");
    }
}
