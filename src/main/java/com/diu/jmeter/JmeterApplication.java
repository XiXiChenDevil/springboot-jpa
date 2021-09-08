package com.diu.jmeter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author DIU
 * @date 2021/9/8 23:03
 */
@SpringBootApplication
public class JmeterApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(JmeterApplication.class, args);
        System.out.println("当前spring中组件一共有：" + run.getBeanDefinitionCount() + "个");
    }

}
