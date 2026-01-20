package gettingStarted;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.selenium.dev/downloads/");
        System.out.println("The current page is :" + driver.getCurrentUrl());

       String pagesource = driver.getPageSource();

        if(pagesource.contains("Structure and Governance")){
            System.out.println("True");

        }
        else{
            System.out.println("False");
        }
        
    }

}
