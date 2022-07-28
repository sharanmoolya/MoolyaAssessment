package Pages;

import UtilsJava.getProperties;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginPage extends Base{
    @Test
    public void loginpage() throws IOException, InterruptedException {
    driver.findElement(By.linkText("Login")).click();

    Thread.sleep(4000);
    driver.findElement(By.id("mobile")).sendKeys(getProperties.getPropertiesOf("phonenumber"));
    Thread.sleep(4000);
    driver.findElement(By.xpath("(//a[text()='Login'])[2]")).click();
    }
}
