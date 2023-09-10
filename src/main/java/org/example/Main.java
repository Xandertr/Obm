package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {


//        ChromeOptions chromeOptions=new ChromeOptions();
//        chromeOptions.setBrowserVersion("117");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().deleteAllCookies();

        driver.get("https://foreman.mn/");
        WebElement cookieElements = driver.findElement(By.xpath("//button[@data-tid='banner-accept']"));
        Assert.assertTrue(cookieElements.isDisplayed());

        cookieElements.click();

        driver.findElement(By.xpath("//a[@target='_blank' and contains(text(),'Live Demo')]")).click();
        String aa="sdadasda";


    }
}