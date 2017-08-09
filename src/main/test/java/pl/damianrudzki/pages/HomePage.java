package pl.damianrudzki.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pl.damianrudzki.driver.DriverFactory;

/**
 * Created by d_rudzki on 2017-08-07.
 */

public class HomePage extends DriverFactory {

    public HomePage(WebDriver driver){
        super(driver);
    }

    public FindOwners clickOnFindOwners(WebDriver driver) {
        driver.findElement(By.xpath("//*[contains(text(), 'Find owners')]")).click();
        return new FindOwners(driver);
    }

}
