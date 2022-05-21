package com.techproed.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Pr {

    @Test(dataProvider = "dataset")
    public void test(String username, String password, String age){
        System.out.println(username+" "+password+" "+age);

    }

    @DataProvider
    public Object[][] dataset() {
        return new Object[][]{
                {"user1", "pass1", "30"},
                {"user2", "pass2", "25"},
                {"user3", "pass3", "65"}
        };
    }

}
