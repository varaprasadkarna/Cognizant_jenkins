package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import main.Homepage;

public class HomePageTest {

    WebDriver driver;
    Homepage hp;

    @BeforeMethod
    public void setup() {

    
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://practicetestautomation.com/practice-test-login/");

   

        hp = new Homepage(driver);
    }

    @Test
    public void loginIntoWeb() {
    	hp.Login("vara","Password123");
    }
}

    