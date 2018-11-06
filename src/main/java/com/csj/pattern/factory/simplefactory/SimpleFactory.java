package com.csj.pattern.factory.simplefactory;

import com.csj.pattern.factory.entity.Asus;
import com.csj.pattern.factory.entity.Computer;
import com.csj.pattern.factory.entity.Dell;
import com.csj.pattern.factory.entity.MacBook;

public class SimpleFactory {

    public Computer getComputer(String computerType) {
        if ("asus".equalsIgnoreCase(computerType)) {
            return new Asus();
        } else if ("dell".equalsIgnoreCase(computerType)) {
            return new Dell();
        } else if ("macbook".equalsIgnoreCase(computerType)) {
            return new MacBook();
        } else {
            System.out.println("没有该品牌！！！");
            return null;
        }
    }
}
