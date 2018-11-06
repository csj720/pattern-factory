package com.csj.pattern.factory.methodfactory;

import com.csj.pattern.factory.entity.Computer;
import com.csj.pattern.factory.entity.MacBook;

public class MacBookFactory implements MethodFactory {
    public Computer getComputer() {
        return new MacBook();
    }
}
