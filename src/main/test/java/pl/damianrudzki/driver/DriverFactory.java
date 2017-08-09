package pl.damianrudzki.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pl.damianrudzki.pages.HomePage;

import java.util.concurrent.TimeUnit;

/**
 * Created by d_rudzki on 2017-08-07.
 */

public class DriverFactory {

    protected WebDriver driver;

    public DriverFactory (WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver(){
        return driver;
    }

    public HomePage navigateToWebApp(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("http://localhost:8080/petclinic/");
        driver.manage().window().maximize();
        return new HomePage(driver);
    }
}
