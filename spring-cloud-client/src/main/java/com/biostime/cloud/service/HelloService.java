package com.biostime.cloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Function:
 * <P> 版权所有 ©2013 Biostime Inc.. All Rights Reserved
 * <p> 未经本公司许可，不得以任何方式复制或使用本程序任何部分 <p>
 * User: 12360
 * Date: 2016/9/2
 * Time: 13:50
 */
@Service
public class HelloService {

    final String SERVICE_NAME="cloud-server";
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hystrixCallHello")
    public String callHello() {
        return restTemplate.getForObject("http://"+SERVICE_NAME+"/home", String.class);
    }

    private String hystrixCallHello() {
        return "HystrixCommand";
    }
}
