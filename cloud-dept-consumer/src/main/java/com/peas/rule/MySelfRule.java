package com.peas.rule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule()
    {
        return new MyRandomRule();//Ribbon默认是轮询，我自定义为随机
    }

}
