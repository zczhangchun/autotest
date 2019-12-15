package com.zhangchun.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangchun
 */
@RestController
@Api(value = "/",description = "这是我全部的方法")
public class SwaggerController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @ApiOperation(value = "你好swagger", httpMethod = "GET")
    public String hello(){
        return "hello swagger";
    }
}
