package com.techproed._NewJob_First;

import org.testng.annotations.*;

public class DataProvider_ {

    @Test(dataProvider = "dataSet")
    public void test(String emrah, String selek, String denver, String colorado){
        System.out.println(emrah+" "+selek+" "+denver+" "+colorado);
    }

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
        Object[][] dataMan = new Object[3][4];//row:3 and colomn:4

        dataMan[0][0] = "user1";
        dataMan[0][1] = "pass1";
        dataMan[0][2] = "pass1";
        dataMan[0][3] = "pass1";

        dataMan[1][0] = "user2";
        dataMan[1][1] = "pass2";
        dataMan[1][2] = "pass2";
        dataMan[1][3] = "pass2";

        dataMan[2][0] = "user3";
        dataMan[2][1] = "pass3";
        dataMan[2][2] = "pass3";
        dataMan[2][3] = "pass3";

        return dataMan;
    }
}