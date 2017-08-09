package pl.damianrudzki.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pl.damianrudzki.driver.DriverFactory;

/**
 * Created by d_rudzki on 2017-08-09.
 */
public class Owners extends DriverFactory {

    public Owners(WebDriver driver) {
        super(driver);
    }

    public OwnerInformation clickOnClient(WebDriver driver) {
        driver.findElement(By.xpath("//*[contains(text(), 'Jan Nowak')]")).click();
        return new OwnerInformation(driver);
    }
}