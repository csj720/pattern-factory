package com.csj.pattern.factory.entity;

/**
 * 计算机
 */
public interface Computer {

    String ASUS = "ASUS";
    String DELL = "DELL";
    String MACBOOK = "MACBOOK";

    //获取一个计算机
    String getName();
}
