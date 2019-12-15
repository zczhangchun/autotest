package com.zhangchun.testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * @author zhangchun
 */
public class BasicAnnotation {

    @Test
    public void m1(){
        Assert.assertEquals(1,2);
    }

    @Test
    public void m2(){
        Assert.assertEquals(1,1);
    }

    @Test
    public void m3(){
        System.out.println("hello，异常");
        throw new RuntimeException();
    }

    @Test
    public void m4(){
        System.out.println("hello，没有异常");
    }

    @Test
    public void m5(){
        Reporter.log("这个日志内容可以在页面上看到");
        throw new RuntimeException();
    }
}
