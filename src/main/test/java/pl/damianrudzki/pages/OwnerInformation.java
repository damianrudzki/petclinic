package pl.damianrudzki.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pl.damianrudzki.driver.DriverFactory;

/**
 * Created by d_rudzki on 2017-08-07.
 */
public class OwnerInformation extends DriverFactory {

    public OwnerInformation(WebDriver driver) {
        super(driver);
    }

    public NewPet addNewPetButton(WebDriver driver) {
        driver.findElement(By.xpath("//*[contains(text(), 'Add New Pet')]")).click();
        return new NewPet(driver);
    }

}
