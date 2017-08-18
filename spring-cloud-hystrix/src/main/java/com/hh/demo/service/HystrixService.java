package com.hh.demo.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

/**
 * Function:
 * <P> 版权所有 ©2013 Biostime Inc.. All Rights Reserved
 * <p> 未经本公司许可，不得以任何方式复制或使用本程序任何部分 <p>
 * User: 12360
 * Date: 2017/6/7
 * Time: 16:45
 */
@Service
public class HystrixService {

    @HystrixCommand(fallbackMethod = "sayFallbackMethod")
    public String sayHello(){
        return (100/0)+" Hello World! ";
    }

    public String sayFallbackMethod(){
        return "Hello Hystrix FallbackMethod ";
    }
}
