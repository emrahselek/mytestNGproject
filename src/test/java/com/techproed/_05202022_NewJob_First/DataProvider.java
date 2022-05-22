package com.techproed._05202022_NewJob_First;

import org.testng.annotations.Test;

public class DataProvider {

    @Test(dataProvider = "dataSetBest")
    public void test(String username, String password){
        System.out.println(username+"     "+password);
    }

    @org.testng.annotations.DataProvider
    public Object[][] dataSetBest(){
        return new Object[][]{
                             {"user5","pass5"},
                             {"user6","pass6"}
                             };

//        Object[][] emrah = {
//                {"emrah","selek"},
//                {"hakk","emo"},
//                {"asa","asas"}
//        };
//        return emrah;

    }

    @org.testng.annotations.DataProvider
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
