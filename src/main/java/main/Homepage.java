package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

    WebDriver driver;

    // Constructor
    public Homepage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // PageFactory Locators
    @FindBy(name="username")
    WebElement userName;

    @FindBy(name="password")
    WebElement password;
    
    @FindBy(xpath="//button[text()=' Login ']")
    WebElement login;

    // Methods
    public void  Login(String name,String pass) {
        userName.sendKeys(name);
        password.sendKeys(pass);
        login.click();
        
  }

   
}