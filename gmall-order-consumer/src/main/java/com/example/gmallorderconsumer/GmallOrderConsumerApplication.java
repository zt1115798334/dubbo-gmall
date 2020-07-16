package com.example.gmallorderconsumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author zhang
 */
@EnableHystrix
@EnableDubbo
@SpringBootApplication
public class GmallOrderConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallOrderConsumerApplication.class, args);
    }

}
