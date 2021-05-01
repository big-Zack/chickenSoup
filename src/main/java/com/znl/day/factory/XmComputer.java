package com.znl.day.factory;

/**
 * @author by 张益豪
 * @Classname XmComputer
 * @Description TODO
 * @Date 2021/3/29 23:37
 */
public class XmComputer implements Calculation {
    @Override
    public void powerOn() {
        System.out.println("小米电脑正在开机");
    }

    @Override
    public void powerOff() {
        System.out.println("小米电脑正在关机");
    }
}
