package com.example.gmalluserprovider;

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
public class GmallUserProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallUserProviderApplication.class, args);
    }

}
