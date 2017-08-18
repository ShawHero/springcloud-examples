package com.hh.config.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
@ConfigurationProperties(prefix = "config")
@RefreshScope
public class Config {
    private String name;
    private String env;

    @Bean
    @RefreshScope
    public Map configInfo(){
        Map<String,String> map = new HashMap<>();
        map.put("name",name);
        map.put("env", env);
        return map;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }
}
