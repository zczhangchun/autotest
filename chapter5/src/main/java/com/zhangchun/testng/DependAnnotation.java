package com.zhangchun.testng;

import org.testng.annotations.Test;

/**
 * @author zhangchun
 */
public class DependAnnotation {


    @Test
    public void m11(){
        System.out.println("依赖前置");
    }

    //依赖了m11方法，但是如果m11方法抛异常，那么m12方法就不会执行，m11方法报错
    @Test(dependsOnMethods = {"m11"})
    public void m12(){
        System.out.println("依赖执行");
    }

}
