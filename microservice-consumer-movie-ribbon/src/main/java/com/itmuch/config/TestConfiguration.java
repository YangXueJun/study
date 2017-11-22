package com.itmuch.config;

import com.itmuch.cloud.ExcludeFromComponent;
import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by yangxuejun on 2017/11/22.
 */
@Configuration
@ExcludeFromComponent
public class TestConfiguration{

    @Autowired
    public IClientConfig config;

    @Bean
    public IRule ribbonRule(IClientConfig config){
        return new RandomRule();
    }

}
