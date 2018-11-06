package com.csj.pattern.factory.abstractfactory;

import com.csj.pattern.factory.entity.Asus;
import com.csj.pattern.factory.entity.Computer;
import com.csj.pattern.factory.entity.Dell;
import com.csj.pattern.factory.entity.MacBook;

public class ComputerFactory implements AbstractFactory {
    public Computer getAsus() {
        return new Asus();
    }

    public Computer getDell() {
        return new Dell();
    }

    public Computer getMacBook() {
        return new MacBook();
    }

}
