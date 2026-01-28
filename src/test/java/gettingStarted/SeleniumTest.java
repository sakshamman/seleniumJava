package gettingStarted;

import extentions.UIElementExtentions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;

public class SeleniumTest {

    public static void main(String[] args) {

        //1. Create a WebDriver with ChromeDriver object
        //2. Launch the browser
        WebDriver driver = new ChromeDriver();

        //3. Navigate to a specific URL
        driver.navigate().to("http://eaapp.somee.com");

        //POM Code
        HomePage homePage = new HomePage(driver);
        var loginPage = homePage.clickLogin();
        homePage = loginPage.performLogin("admin", "password");
        var employeeListPage = homePage.clickEmployeeList();
        var createEmployeePage = employeeListPage.clickCreateNew();
        createEmployeePage.createNewEmployee("AutoUser2", "22222", "autotestuser2@gmail.com", "20000", "Middle");

        Logoff(driver);



//        WebDriver driver = new ChromeDriver();
//
//        driver.navigate().to("http://eaapp.somee.com");
//        System.out.println("The current page is :" + driver.getCurrentUrl());
//
//       String pagesource = driver.getPageSource();
//
//        if(pagesource.contains("Structure and Governance")){
//            System.out.println("True");
//
//        }
//        else{
//            System.out.println("False");
//        }
//
//        By locator = By.id("loginLink");
//        WebElement element = driver.findElement(locator);
//        element.click();
//
//        /*By txtUserName = By.name("UserName");
//        WebElement txtUserNameElement = driver.findElement(txtUserName);
//        txtUserNameElement.sendKeys("admin");*/
//
//        //driver.findElement(By.id("UserName")).sendKeys("admin");
//
//        UIElementExtentions.performEnterText(driver,By.name("UserName"), "admin");
//
//
//
//        //driver.findElement(By.linkText("Log In")).click();
//
//        //enter password
//        driver.findElement(By.id("Password")).sendKeys("password");
//
//        UIElementExtentions.performEnterText(driver,By.name("UserName"), "admin");
//
//        //click login button
//        driver.findElement(By.cssSelector(".btn")).click();
//
//        driver.findElement(By.linkText("Employee List")).click();
//
//        driver.findElement(By.linkText("Create New")).click();
//
//        driver.findElement(By.name("Name")).sendKeys("AutoUser1");
//
//        driver.findElement(By.id("DurationWorked")).sendKeys("40");
//
//        Select selectGrade = new Select(driver.findElement(By.id("Grade")));
//        selectGrade.selectByVisibleText("Middle");
//
//        driver.findElement(By.name("Email")).sendKeys("AutoUser@gmail.com");
//
//        driver.findElement(By.cssSelector(".btn")).click();
//
//        //if mandatory field error for salary appears, then enter salary
//
//        if(driver.findElement(By.xpath("//span[text()='The Salary field is required.']")).isDisplayed()){
//            driver.findElement(By.name("Salary")).sendKeys("10000");
//            driver.findElement(By.cssSelector(".btn")).click();
//        } else {
//            //do nothing
//        }


    }

    public static void Logoff(WebDriver driver) {

        driver.findElement(By.linkText("Log off")).click();
    }

}

