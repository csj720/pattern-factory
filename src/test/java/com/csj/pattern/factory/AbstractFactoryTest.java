package com.csj.pattern.factory;

import com.csj.pattern.factory.abstractfactory.AbstractFactory;
import com.csj.pattern.factory.abstractfactory.ComputerFactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractFactory computerFactory = new ComputerFactory();
        System.out.println(computerFactory.getAsus().getName());
        System.out.println(computerFactory.getDell().getName());
        System.out.println(computerFactory.getMacBook().getName());
    }
}
