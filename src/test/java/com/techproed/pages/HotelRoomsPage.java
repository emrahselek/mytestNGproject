package com.techproed.pages;
import com.techproed.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelRoomsPage {

    public HotelRoomsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(partialLinkText = "ADD HOTELROOM")
    public WebElement addHotelRoomLink;

    @FindBy(id = "IDHotel")
    public WebElement idDropdown;

    @FindBy(id="Code")
    public WebElement code;

    @FindBy(id="Name")
    public WebElement name;

    @FindBy(id="Location")
    public WebElement location;

    @FindBy(xpath="//textarea[@role='textbox']")
    public WebElement description;

    @FindBy(id="Price")
    public WebElement price;

    @FindBy(xpath = "//li[@data-id='700']")
    public WebElement price700;

    @FindBy(id="IDGroupRoomType")
    public WebElement selectRoom;

    @FindBy(id="MaxAdultCount")
    public WebElement maxAdultCount;

    @FindBy(id="MaxChildCount")
    public WebElement maxChildCount;

    @FindBy(id="IsAvailable")
    public WebElement isApprove;

    @FindBy(id="btnSubmit")
    public WebElement saveRoom;

    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement popupMessage;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement clickOk;


}
