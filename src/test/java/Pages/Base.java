package Pages;

import UtilsJava.getProperties;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Base {
    WebDriver driver;
    @BeforeTest
    public  void  launcBrowser() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get(getProperties.getPropertiesOf("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @AfterTest
    public  void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();

    }

}
