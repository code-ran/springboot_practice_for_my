package com.ransibi;

import org.springframework.boot.SpringApplication;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: rsb
 * @description: 2024-09-11-13-41
 * @description:
 * @Version: 1.0.0
 */
@Component
public class Task {
    @Scheduled(fixedRate = 5000)
    public void testTimerTask(){
        System.out.println("定时测试");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 9){
                System.out.println("执行完毕，开始退出!");
                System.exit(0);
                System.out.println("退出成功!");
            }
        }
    }
}
