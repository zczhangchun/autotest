package com.zhangchun.testng;

import org.testng.annotations.*;

/**
 * @author zhangchun
 */
public class BasicAnnotation {

    @Test(groups = "one")
    public void m1(){
        System.out.println("测试用例1");
    }

    @BeforeMethod
    public void m2(){
        System.out.println("方法之前执行");
    }

    @AfterMethod
    public void m3(){
        System.out.println("方法之后执行");
    }

    @BeforeClass
    public void m4(){
        System.out.println("类一启动执行");
    }

    @AfterClass
    public void m5(){
        System.out.println("类结束时执行");
    }

    @BeforeSuite
    public void m6(){
        System.out.println("套件启动时执行");
    }

    @AfterSuite
    public void m7(){
        System.out.println("套件结束时执行");
    }

    @BeforeGroups("one")
    public void m8(){
        System.out.println("组启动前执行");
    }
    @AfterGroups("one")
    public void m9(){
        System.out.println("组启动后执行");
    }


    //如果预期的异常和方法中真正抛出的异常一样，那么执行条就是绿的，不一样就是红的
    @Test(expectedExceptions = RuntimeException.class)
    public void m10(){
        System.out.println("成功的异常测试");
        throw new RuntimeException();
    }

}
