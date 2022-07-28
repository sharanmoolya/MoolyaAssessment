package Pages;

import UtilsJava.getProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Location extends Base{
    @Test
    public void locationpage() throws InterruptedException {
        driver.findElement(By.id("location")).sendKeys("Madanapalli");
        driver.findElement(By.xpath("(//span)[2]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//span[text()='Search']")).click();
        Thread.sleep(3000);
        driver.findElement(By.className("_2FkHZ")).sendKeys("Biryani", Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//div[text()='ADD'])[1]")).click();
        Thread.sleep(2000);
        WebElement  cart=driver.findElement(By.xpath("//span[text()='Cart']"));
                Thread.sleep(2000);
        getProperties.mouseHover(driver,cart);
        getProperties.mouseClick(driver,cart);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[text()='+']")).click();
        Thread.sleep(3000);
      driver.navigate().back();
        driver.findElement(By.xpath("//span[text()='Search']")).click();
        Thread.sleep(3000);
        driver.findElement(By.className("_2FkHZ")).clear();
        Thread.sleep(3000);

        driver.findElement(By.className("_2FkHZ")).sendKeys("Biryani", Keys.ENTER);
        Thread.sleep(3000);

    }
}
