package extentions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UIElementExtentions {
    public static void performEnterText(WebDriver driver, By locator, String value) {

        driver.findElement(locator).click();
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(value);



    }
}
