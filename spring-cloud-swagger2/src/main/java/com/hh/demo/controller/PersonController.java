package com.hh.demo.controller;

import com.hh.demo.bean.PersonBean;
import com.hh.demo.bean.ResponseBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
@Api(value = "PersonController", description = "人员相关api")
public class PersonController {

    @Autowired
    private List<PersonBean> personBeans;

    @RequestMapping(value = "/save", method = {RequestMethod.POST})
    @ApiOperation(value = "保存人员信息", notes = "保存人员信息", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseBean<PersonBean> save(@RequestBody PersonBean personBean) {
        ResponseBean responseBean = new ResponseBean();
        responseBean.setCode(100);
        responseBean.setMsg("success");
        responseBean.setValue(personBean);

        System.out.print(personBeans.size());
        return responseBean;
    }
}
