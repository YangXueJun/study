package com.itmuch.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by yangxuejun on 2017/11/22.
 */

@SpringBootApplication
@EnableEurekaServer

public class EurekaApplication {

    public static void main(String[] args){
        SpringApplication.run(EurekaApplication.class,args );

    }
}
