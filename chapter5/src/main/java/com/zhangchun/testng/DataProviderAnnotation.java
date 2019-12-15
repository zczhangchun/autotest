package com.zhangchun.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * @author zhangchun
 */
public class DataProviderAnnotation {


    @Test(dataProvider = "object1")
    public void m1(String name, int age){
        System.out.println(name + ":" + age);
    }

    @DataProvider(name = "object1")
    public Object[][] m2(){

        Object[][] objects = new Object[][]{
                {"zhangsan",1},
                {"lisi",2},
                {"wangwu",3}
        };

        return objects;
    }

    @Test(dataProvider = "method")
    public void m3(String name, int age){
        System.out.println("m3:" + name + ":" + age);
    }

    @Test(dataProvider = "method")
    public void m4(String name, int age){
        System.out.println("m4:" + name + ":" + age);
    }

    @DataProvider(name = "method")
    public Object[][] m5(Method method){

        String methodNa = method.getName();

        if ("m3".equals(methodNa)){
            return new Object[][]{
                    {"zhangsan",1},
                    {"lisi",2}
            };
        }else {
            return new Object[][]{
                    {"wangwu",4}
            };
        }

    }


}
