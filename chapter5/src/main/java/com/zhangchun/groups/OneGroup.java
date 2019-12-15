package com.zhangchun.groups;

import org.testng.annotations.Test;

/**
 * @author zhangchun
 */
@Test(groups = "one")
public class OneGroup {

    public void m1(){
        System.out.println("oneGroup");
    }

    public void m2(){
        System.out.println("oneGroup too");
    }
}
