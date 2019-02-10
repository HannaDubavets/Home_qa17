import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class EbayLoginTest         {
    WebDriver wd;

    @BeforeMethod
    public void setUp(){
        wd=new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        wd.manage().window().maximize();
    }
    @Test
    public void testLoginEbay(){


        openSite("https://www.ebay.com/");
        unitLogin();
        fillLoginForm("pass", "userid");
        confirmLogin();
    }

    @AfterMethod
    public void tearDown(){
        stop();
    }



    //---------------------------------------------------------------

    public void confirmLogin() {
        click(By.id("sgnBt"));
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void fillLoginForm(String pwd, String username) {
         type(By.name("userid"),username);
         type(By.id("pass"),pwd);

    }

    public void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }


    public void unitLogin() {
        click(By.linkText("Sign in"));
    }

    public void openSite(String url) {
        wd.get(url);
    }

    public void stop() {
        wd.quit();
    }



}
