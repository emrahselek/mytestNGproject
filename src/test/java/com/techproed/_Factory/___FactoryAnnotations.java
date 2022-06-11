package com.techproed._Factory;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

/*

    TestNG:(Runner Class gibi) :D
    @Factory annotation is used to specify a method as a factory
    for providing objects to be used by TestNG for test classes.

    The method marked with @Factory annotation should return Object array.
    @Factory is useful when you want to run multiple test classes
    through a single test class.
    It is mandatory that a factory method should return an array of Object i.e.
    Object [].

     */

public class ___FactoryAnnotations {

    @Test
    public void Test1() {
        System.out.println("Simple Test Method");
    }

    @Factory
    public Object[] factoryMethod() {
       return new Object[] { new ___FactoryAnnotations(), new ___FactoryAnnotations(),
                            new ___FactoryAnnotations(), new ___FactoryAnnotations()
                            };
    }
}



