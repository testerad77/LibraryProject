package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.utils_package.Driver;

import static org.testng.Assert.assertEquals;

public abstract class BasePage {

    protected WebDriver driver;

    @FindBy(xpath = "//input[@id='inputEmail']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='inputPassword']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInBtn;

    public BasePage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
        // isCurrentPage(); automatically checks if correct page. when we create objects
    }

    public void isCurrentPage(){
        assertEquals(driver.getTitle(),"");
    }}


