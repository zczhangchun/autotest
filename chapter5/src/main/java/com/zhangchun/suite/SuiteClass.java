package com.zhangchun.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * @author zhangchun
 */
public class SuiteClass {

    @AfterSuite
    public void m1(){
        System.out.println("组件开始");
    }

    @BeforeSuite
    public void m2(){
        System.out.println("组件结束");
    }
}
