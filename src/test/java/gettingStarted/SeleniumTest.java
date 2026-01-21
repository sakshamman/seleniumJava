package gettingStarted;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://eaapp.somee.com");
        System.out.println("The current page is :" + driver.getCurrentUrl());

       String pagesource = driver.getPageSource();

        if(pagesource.contains("Structure and Governance")){
            System.out.println("True");

        }
        else{
            System.out.println("False");
        }

        By locator = By.id("loginLink");
        WebElement element = driver.findElement(locator);
        element.click();

        By txtUserName = By.name("UserName");
        WebElement txtUserNameElement = driver.findElement(txtUserName);
        txtUserNameElement.sendKeys("admin");

        //driver.findElement(By.linkText("Log In")).click();

        //enter password
        driver.findElement(By.id("Password")).sendKeys("password");

        //click login button
        driver.findElement(By.cssSelector(".btn")).click();


    }

}
