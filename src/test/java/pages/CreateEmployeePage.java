package pages;

import extensions.UIElementExtentions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CreateEmployeePage {

    private WebDriver driver;

    public CreateEmployeePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(name = "Name")
    private WebElement txtName;

    @FindBy(id = "DurationWorked")
    private WebElement txtDurationWorked;

    @FindBy(name = "Email")
    private WebElement txtEmail;

    @FindBy(name = "Salary")
    private WebElement txtSalary;

    @FindBy(name = "Grade")
    private WebElement ddlGrade;

    @FindBy(css = ".btn")
    private WebElement btnCreate;


    public EmployeeListPage createNewEmployee(String name, String durationWorked, String email, String salary, String grade){
        UIElementExtentions.performClick(btnCreate);
        UIElementExtentions.performEnterText(txtSalary, salary);
        UIElementExtentions.performEnterText(txtEmail, email);
        UIElementExtentions.performDropDownSelectionByText(ddlGrade, grade);
        UIElementExtentions.performEnterText(txtDurationWorked, durationWorked);
        UIElementExtentions.performEnterText(txtName, name);
        return new EmployeeListPage(driver);
    }
}
