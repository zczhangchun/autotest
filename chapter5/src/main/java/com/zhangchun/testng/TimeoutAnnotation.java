package com.zhangchun.testng;

import org.testng.annotations.Test;

/**
 * @author zhangchun
 */
public class TimeoutAnnotation {

    @Test(timeOut = 3000)
    public void m1()throws Exception{
        Thread.sleep(2000);
    }

    //虽然代码睡眠5秒，但是我们设置的超时时长时2秒，所以到达2秒就直接结束
    @Test(timeOut = 2000)
    public void m2()throws Exception{
        Thread.sleep(5000);
    }
}
