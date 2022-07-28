package UtilsJava;

import com.sun.net.ssl.internal.ssl.Provider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class getProperties {


    public  static  String getPropertiesOf(String key) throws IOException {
        String pv=null;
        FileInputStream input=new FileInputStream("C:\\Users\\LENOVO T450\\IdeaProjects\\SwiggiyDemoAutomation\\src\\test\\java\\Pages\\TestData.properties");
        Properties prop=new Properties();
        prop.load(input);
        pv=prop.getProperty(key);
        return pv;


    }
    public static void mouseHover(WebDriver driver, WebElement element){
        Actions act=new Actions(driver);
        act.moveToElement(element).build().perform();
    }
    public static void mouseClick(WebDriver driver, WebElement element){
        Actions act=new Actions(driver);
        act.click(element).build().perform();
    }
}
