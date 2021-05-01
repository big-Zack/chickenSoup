package com.znl.day.factory;

/**
 * @author by 张益豪
 * @Classname ComputerTest
 * @Description TODO
 * @Date 2021/3/29 23:42
 */
public class ComputerTest {
    public static void main(String[] args) {
        // j
        Calculation xm = new ComputerFactory().create("XM");
        xm.powerOn();
    }
}
