package Pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Help extends Base {
    @Test
    public void HelpDetails() throws InterruptedException {
        driver.findElement(By.id("location")).sendKeys("Madanapalli");
        driver.findElement(By.xpath("(//span)[2]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[text()='Help']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//span[@class='L1QZ_'])[1]")).click();

    }
}
