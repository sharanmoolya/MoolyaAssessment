package Pages;

import UtilsJava.getProperties;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;

public class SignUpPage  extends Base{
    @Test
    public  void signUpProcess() throws InterruptedException, IOException {
        driver.findElement(By.linkText("Sign up")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("mobile")).sendKeys(getProperties.getPropertiesOf("phonenumber"));

        Thread.sleep(4000);
        driver.findElement(By.id("name")).sendKeys(getProperties.getPropertiesOf("name"));
        Thread.sleep(4000);

        driver.findElement(By.id("email")).sendKeys(getProperties.getPropertiesOf("email"));
        Thread.sleep(4000);

        driver.findElement(By.id("password")).sendKeys(getProperties.getPropertiesOf("password"));
        Thread.sleep(4000);

        driver.findElement(By.xpath("//a[text()='CONTINUE']")).click();
        Thread.sleep(4000);


    }
}

