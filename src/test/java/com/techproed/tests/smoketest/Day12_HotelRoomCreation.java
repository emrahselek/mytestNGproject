package com.techproed.tests.smoketest;

import com.github.javafaker.Faker;
import com.techproed.pages.DefaultPage;
import com.techproed.pages.HotelRoomsPage;
import com.techproed.pages.LoginPage;
import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.Driver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day12_HotelRoomCreation {

    LoginPage loginPage;
    DefaultPage defaultPage;
    HotelRoomsPage hotelRoomsPage;
    Faker faker = new Faker();

    @BeforeMethod
    public void setUp(){
        Driver.getDriver().get(ConfigReader.getProperty("app_url_login"));
        loginPage= new LoginPage();
        loginPage.username.sendKeys(ConfigReader.getProperty("manager_username"));
        loginPage.password.sendKeys(ConfigReader.getProperty("manager_password"));
        loginPage.loginButton.click();

        //asserting login success
        defaultPage= new DefaultPage();
        Assert.assertTrue(defaultPage.addUserButton.isDisplayed());

    }

    @Test
    public void hotelRoomCreate() throws InterruptedException {
//Click on Hotel Management
        defaultPage.hotelManagementTab.click();

//Click on Hotel Rooms
        defaultPage.hotelRoomsTab.click();

//Click on Add Hotel Room
        hotelRoomsPage=new HotelRoomsPage();
        hotelRoomsPage.addHotelRoomLink.click();

//Enter All required fields
        //ID IS DROPDOWN
        Select select = new Select(hotelRoomsPage.idDropdown);
        select.selectByIndex(2);

        //Code
        hotelRoomsPage.code.sendKeys("discount code");

        //Name
        hotelRoomsPage.name.sendKeys(faker.name().fullName());

        //Location
        hotelRoomsPage.location.sendKeys(faker.address().city());

        //description
        hotelRoomsPage.description.sendKeys(faker.company().name());

        //price
        hotelRoomsPage.price.sendKeys(faker.number().digits(4));

        //selectRoom
        Select selectRoom = new Select(hotelRoomsPage.selectRoom);
        selectRoom.selectByVisibleText("King");

        //maxAdultCount
        hotelRoomsPage.maxAdultCount.sendKeys("2");

        //maxChildCount
        hotelRoomsPage.maxChildCount.sendKeys("0");

        //approved
        if(!hotelRoomsPage.isApprove.isSelected()){
            hotelRoomsPage.isApprove.click();
        }

        //saveRoom
        hotelRoomsPage.saveRoom.click();

        //verify
        Thread.sleep(3000);
        Assert.assertTrue(hotelRoomsPage.verify.isDisplayed());


        //Click OK
        hotelRoomsPage.clickOk.click();


    }
}