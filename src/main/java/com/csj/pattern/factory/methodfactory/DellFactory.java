package com.csj.pattern.factory.methodfactory;

import com.csj.pattern.factory.entity.Computer;
import com.csj.pattern.factory.entity.Dell;

public class DellFactory implements MethodFactory {
    public Computer getComputer() {
        return new Dell();
    }
}
