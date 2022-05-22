package com.techproed.dataprovider;

import org.testng.annotations.Factory;

public class _EZS_Test3 {

    @Factory()
    public Object[] factoryMethod() {
        Object[] tests = new Object[2];
        tests[0] = new _EZS_Test1();
        tests[1] = new _EZS_Test2();
        return tests;
    }

    ;

}
