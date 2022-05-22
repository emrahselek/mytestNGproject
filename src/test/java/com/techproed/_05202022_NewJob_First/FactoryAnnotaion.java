package com.techproed._05202022_NewJob_First;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

/*

    TestNG -  @Factory is useful when you want to run multiple test classes
    through a single test class.

    Sometimes we may need to run a set of tests with different data values.
    To achieve this we may define a separate set of tests inside a suite in
    the testng XML and test the required scenario.
    The problem with this approach is that if we get an extra set of data,
    we will need to redefine the test.

    TestNG solves this problem by providing the @Factory annotation feature;
    @Factory defines and creates tests dynamically at runtime.
    It is mandatory that a factory method should return an array of Object i.e.
    Object [].

     */

public class FactoryAnnotaion {

    @Test
    public void Test1() {
        System.out.println("Simple Test Method");
    }

    @Factory
    public Object[] factoryMethod() {
       return new Object[] { new FactoryAnnotaion(), new FactoryAnnotaion(),
                            new FactoryAnnotaion(), new FactoryAnnotaion()
                            };
    }
}


