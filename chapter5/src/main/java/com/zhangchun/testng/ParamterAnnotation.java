package com.zhangchun.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author zhangchun
 */
public class ParamterAnnotation {

    @Test
    @Parameters({"name","age"})
    public void m1(String name, int age){
        System.out.println("name = " + name + "\t age = " + age);
    }
}
