package com.hh.demo;

import com.hh.demo.bean.PersonBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public PersonBean firstPersonBean(){
        PersonBean personBean = new PersonBean();
        personBean.setName("小黄");
        return personBean;
    }

    @Bean
    public PersonBean secPersonBean(){
        PersonBean personBean = new PersonBean();
        personBean.setName("小蓝");
        return personBean;
    }

    @Bean
    public PersonBean thrPersonBean(){
        PersonBean personBean = new PersonBean();
        personBean.setName("小白");
        return personBean;
    }
}