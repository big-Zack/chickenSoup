package com.znl.day.factory;

/**
 * @author by 张益豪
 * @Classname DellComputer
 * @Description TODO
 * @Date 2021/3/29 23:38
 */
public class DellComputer implements Calculation {
    @Override
    public void powerOn() {
        System.out.println("戴尔电脑正在开机");
    }

    @Override
    public void powerOff() {
        System.out.println("戴尔电脑正在关机");
    }
}
