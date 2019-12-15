package com.zhangchun.testng;

import org.testng.annotations.Test;

/**
 * @author zhangchun
 */
public class ThreadAnnotation {

    @Test(invocationCount = 10, threadPoolSize = 3)
    public void m1(){
        System.out.println("---------");
        System.out.println("多线程测试：" + Thread.currentThread().getId());
    }
}
