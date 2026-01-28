package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    //Locators for Login
    @FindBy(linkText = "Login")
    private WebElement lnkLogin;

    @FindBy(linkText = "Employee List")
    private WebElement lnkEmployeeList;

    public LoginPage clickLogin() {
        UIElementExtensions.performClick(lnkLogin);
        return new LoginPage(driver);
    }

    public EmployeeListPage clickEmployeeList(){
        lnkEmployeeList.click();
        return new EmployeeListPage(driver);
    }

}
