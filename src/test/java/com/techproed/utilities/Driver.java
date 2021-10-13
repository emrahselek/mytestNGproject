package com.techproed.utilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class Driver {

    private static WebDriver driver;
    /*getDriver() method is used :
     * 1. SetUp driver
     * 2. create driver
     * 3. return river
     * driver  ------->>>>>>> Driver.getDriver()
     * */
    public static WebDriver getDriver(){
        if (driver==null){//if driver is not pointing anywhere, then instantiate the driver
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }


    public static void closeDriver(){
        if (driver!=null){//if driver is pointing somewhere ot if driver is being used

            driver.quit();//close the driver

            driver=null;//and make the driver null so that we can instantiate the driver again

        }
    }
}