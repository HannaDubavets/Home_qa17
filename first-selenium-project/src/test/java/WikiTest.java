import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WikiTest {
    WebDriver driver;
    @BeforeMethod
    public  void setUp(){
        driver = new ChromeDriver();

    }


    @Test
    public void wikiTest(){
        driver.navigate().to("https://www.wikipedia.org/");
    }


    @AfterMethod
    public void teatDown(){
driver.quit();
    }

}

