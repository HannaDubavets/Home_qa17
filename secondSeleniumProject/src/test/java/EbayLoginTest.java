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


        wd.get("https://www.ebay.com/");

        wd.findElement(By.linkText("Sign in")).click();
        wd.findElement(By.name("userid")).click();
        wd.findElement(By.name("userid")).clear();
        wd.findElement(By.name("userid")).sendKeys("username");

        wd.findElement(By.id("pass")).click();
        wd.findElement(By.id("pass")).clear();
        wd.findElement(By.id("pass")).sendKeys("password");

        wd.findElement(By.id("sgnBt")).click();






    }
    @AfterMethod
    public void tearDown(){
        //wd.quit();
    }

}
