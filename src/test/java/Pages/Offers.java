package Pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Offers  extends Base{
    @Test
    public  void offetingDetails() throws InterruptedException {
        driver.findElement(By.id("location")).sendKeys("Madanapalli");
        driver.findElement(By.xpath("(//span)[2]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[text()='Offers']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[contains(text(),'Pitta')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[text()='Tandoori']")).click();



    }
}
