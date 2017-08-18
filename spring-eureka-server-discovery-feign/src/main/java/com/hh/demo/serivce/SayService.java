package com.hh.demo.serivce;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Function:
 * <P> 版权所有 ©2013 Biostime Inc.. All Rights Reserved
 * <p> 未经本公司许可，不得以任何方式复制或使用本程序任何部分 <p>
 * User: 12360
 * Date: 2017/6/7
 * Time: 16:17
 */
@FeignClient("eureka-server-registry")
public interface SayService {

    @RequestMapping("/say")
    @ResponseBody String say();
}
