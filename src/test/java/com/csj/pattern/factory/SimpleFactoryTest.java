package com.csj.pattern.factory;

import com.csj.pattern.factory.entity.Computer;
import com.csj.pattern.factory.simplefactory.SimpleFactory;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Computer asus = simpleFactory.getComputer(Computer.ASUS);
        System.out.println(asus.getName());
        Computer dell = simpleFactory.getComputer(Computer.DELL);
        System.out.println(dell.getName());
        Computer macbook = simpleFactory.getComputer(Computer.MACBOOK);
        System.out.println(macbook.getName());
    }
}
