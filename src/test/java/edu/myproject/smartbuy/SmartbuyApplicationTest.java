package edu.myproject.smartbuy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
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
    public void testingMethod() throws InterruptedException {
        driver.navigate().to(appURL);
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("kutumbe.sanket@gmail.com");
        WebElement pwd = driver.findElement(By.id("password"));
        pwd.sendKeys("cdef3456");
        driver.findElement(By.name("Submit")).click();
        String getTitle = driver.getTitle();
        Assert.assertEquals(getTitle, "Smart Buy");
        driver.findElement(By.name("Hire")).click();
        Thread.sleep(2000);
//        driver.findElement(By.name("Remove")).click();
//        Thread.sleep(5000);
//        driver.findElement(By.linkText("Home")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.name("Hire")).click();
//        Thread.sleep(5000);

    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }
}
