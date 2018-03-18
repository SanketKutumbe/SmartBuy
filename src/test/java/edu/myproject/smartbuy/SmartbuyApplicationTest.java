package edu.myproject.smartbuy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SmartbuyApplicationTest {

    private WebDriver driver;
    String appURL = "http://localhost:8082/login";

    @BeforeMethod
    public void setUp() throws Exception {
        driver = new ChromeDriver();
    }

    @Test
    public void verifyGooglePageTittle() {
        driver.navigate().to(appURL);
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("x@y.com");
        WebElement pwd = driver.findElement(By.id("password"));
        pwd.sendKeys("qwerty");
        driver.findElement(By.name("Submit")).click();
        String getTitle = driver.getTitle();
        Assert.assertEquals(getTitle, "Smart Buy");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }
}