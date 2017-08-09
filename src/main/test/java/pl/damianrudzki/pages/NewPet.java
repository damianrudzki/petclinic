package pl.damianrudzki.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pl.damianrudzki.driver.DriverFactory;


/**
 * Created by d_rudzki on 2017-08-07.
 */
public class NewPet extends DriverFactory {

    public NewPet(WebDriver driver) {
        super(driver);
    }

    public NewPet fillFormWithData() {
        driver.findElement(By.id("name")).sendKeys("name");
        driver.findElement(By.id("birthDate")).sendKeys("1998/12/12");
        driver.findElement(By.id("birthDate")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[contains(text(), 'dog')]")).click();
        return new NewPet(driver);
    }


    public OwnerInformation addPetButton(WebDriver driver) {
        WebElement addPetButtonelement = driver.findElement(By.xpath("//*[contains(text(), 'Add Pet')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(addPetButtonelement).click().perform();
        addPetButtonelement.click();
        return new OwnerInformation(driver);
    }

}

