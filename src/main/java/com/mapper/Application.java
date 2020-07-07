package com.mapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: mapper
 * @since: 2020/4/9
 */
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
//        new SpringApplicationBuilder(Application.class).web(WebApplicationType.NONE).run(args);
        SpringApplication.run(Application.class, args);
    }
}
