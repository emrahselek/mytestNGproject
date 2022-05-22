package com.techproed._05202022_NewJob_First;

import org.testng.annotations.Factory;

public class FactoryAnnotation_part3_FactoryAnn {

    @Factory()
    public Object[] factoryMethod() {
        Object[] tests = new Object[2];
        tests[0] = new FactoryAnnotation_part1_Test1();
        tests[1] = new FactoryAnnotation_part2_Test2();
        return tests;
    }

    ;

}
