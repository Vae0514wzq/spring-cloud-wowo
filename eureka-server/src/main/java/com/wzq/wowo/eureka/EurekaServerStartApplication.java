package com.wzq.wowo.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerStartApplication {
    public static void main(String[] args) {
    	SpringApplication.run(EurekaServerStartApplication.class, args);
    }
}
