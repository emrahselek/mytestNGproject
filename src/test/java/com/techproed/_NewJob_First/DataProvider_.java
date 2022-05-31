package com.techproed._NewJob_First;

import org.testng.annotations.*;

public class DataProvider_ {

    @Test(dataProvider = "dataSetBest")
    public void test(String username, String password){
        System.out.println(username+" "+password);
    }

    //1.way
    @DataProvider
    public Object[][] dataSetBest(){
        return new Object[][]{
                             {"user5","pass5"},
                             {"user6","pass6"}
                             };

    }

    //2.way
    @DataProvider
    public Object[][] dataSet() {
        Object[][] dataMan = new Object[3][2];

        dataMan[0][0] = "user1";
        dataMan[0][1] = "pass1";

        dataMan[1][0] = "user2";
        dataMan[1][1] = "pass2";

        dataMan[2][0] = "user3";
        dataMan[2][1]="pass3";

        return dataMan;
    }


}
