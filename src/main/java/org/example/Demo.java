package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.logging.Logger;

public class Demo
{

    private static String URL = "https://dantri.com.vn/";
    private static String TAB_XAHOI = "(//a[contains(text(),\"Xã hội\")])[1]";

    public static void main( String[] args )
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get(URL);
        WebElement web = driver.findElement(By.xpath(TAB_XAHOI));
        web.click();

    }
}
