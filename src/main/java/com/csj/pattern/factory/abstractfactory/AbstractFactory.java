package com.csj.pattern.factory.abstractfactory;

import com.csj.pattern.factory.entity.Computer;

public interface AbstractFactory {

    Computer getAsus();

    Computer getDell();

    Computer getMacBook();

}
