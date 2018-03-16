package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestCode {


    public void test() {

        System.setProperty("webdriver.chrome.driver","/home/surya/IdeaProjects/chromedriver");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "http://localhost:8081/login";
        String expectedTitle = "Document";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("x@y.com");
        WebElement pwd = driver.findElement(By.id("password"));
        pwd.sendKeys("qwerty");
        driver.findElement(By.name("Submit")).click();
        actualTitle = driver.getTitle();
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }

        driver.close();

    }

}
