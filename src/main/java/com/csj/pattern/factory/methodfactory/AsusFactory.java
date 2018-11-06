package com.csj.pattern.factory.methodfactory;

import com.csj.pattern.factory.entity.Asus;
import com.csj.pattern.factory.entity.Computer;

public class AsusFactory implements MethodFactory {

    public Computer getComputer() {
        return new Asus();
    }
}
