package pl.damianrudzki.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pl.damianrudzki.driver.DriverFactory;

/**
 * Created by d_rudzki on 2017-08-07.
 */
public class NewOwner extends DriverFactory {

    public NewOwner(WebDriver driver) {
        super(driver);
    }

    public NewOwner fillFormWithData(){
        driver.findElement(By.id("firstName")).sendKeys("Jan");
        driver.findElement(By.id("lastName")).sendKeys("Nowak");
        driver.findElement(By.id("address")).sendKeys("Brzozowa");
        driver.findElement(By.id("city")).sendKeys("Warszawa");
        driver.findElement(By.id("telephone")).sendKeys("673847321");
        return new NewOwner(driver);
    }


    public OwnerInformation clickOnAddOwnerButton(WebDriver driver) {
        driver.findElement(By.xpath("//*[contains(text(), 'Add Owner')]")).click();
        return new OwnerInformation(driver);
    }
}
