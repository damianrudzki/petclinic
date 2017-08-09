package pl.damianrudzki.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pl.damianrudzki.driver.DriverFactory;

/**
 * Created by d_rudzki on 2017-08-07.
 */
public class FindOwners extends DriverFactory {

    public FindOwners(WebDriver driver){
        super(driver);
    }

    public NewOwner clickOnAddOwnerButton(WebDriver driver) {
        driver.findElement(By.xpath("//*[contains(text(), 'Add Owner')]")).click();
        return new NewOwner(driver);
    }
    public FindOwners enterOwnerData(WebDriver driver) {
        driver.findElement(By.name("lastName")).sendKeys("Nowak");
        return new FindOwners(driver);
    }

    public Owners clickOnFindOwnerbutton(WebDriver driver) {
        driver.findElement(By.xpath("//*[@id=\"search-owner-form\"]/fieldset/div[2]/button")).click();
        return new Owners(driver);
    }


}
