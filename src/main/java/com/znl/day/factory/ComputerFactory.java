package com.znl.day.factory;

/**
 * @author by 张益豪
 * @Classname ComputerFactory
 * @Description TODO
 * @Date 2021/3/29 23:39
 */
public class ComputerFactory {
    public Calculation create(String computer) {
        if (computer.isEmpty()) {
            return null;
        }
        if ("DELL".equals(computer)) {
            return new DellComputer();
        } else if ("XM".equals(computer)) {
            return new XmComputer();
        }
        return null;
    }
}
