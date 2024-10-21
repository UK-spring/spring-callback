package com.example.springcallback.scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SingletonAppConfig {

    @Scope("singleton")
    @Bean
    public SingletonBean myBeanV3() {
        SingletonBean singletonBean = new SingletonBean();
        return singletonBean;
    }

}
