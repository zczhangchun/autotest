package com.zhangchun.groups;

import org.testng.annotations.Test;

/**
 * @author zhangchun
 */
@Test(groups = "two")
public class TwoGroup {

    public void m1(){
        System.out.println("TwoGroup ");
    }

    public void m2(){
        System.out.println("TWoGroup too");
    }
}
