package com.csj.pattern.factory;

import com.csj.pattern.factory.methodfactory.AsusFactory;
import com.csj.pattern.factory.methodfactory.DellFactory;
import com.csj.pattern.factory.methodfactory.MacBookFactory;
import com.csj.pattern.factory.methodfactory.MethodFactory;

public class MethodFactoryTest {
    public static void main(String[] args) {
        MethodFactory methodFactory = new AsusFactory();
        System.out.println(methodFactory.getComputer().getName());

        MethodFactory dellFactory = new DellFactory();
        System.out.println(dellFactory.getComputer().getName());

        MethodFactory macBookFactory = new MacBookFactory();
        System.out.println(macBookFactory.getComputer().getName());
    }
}
