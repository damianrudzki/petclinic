package pl.damianrudzki.runner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.damianrudzki.pages.*;


/**
 * Created by d_rudzki on 2017-08-07.
 */

public class MainTestRunner {

    WebDriver driver;

    @Before
    public void testSetUP() {
        driver = new ChromeDriver();
    }

    @Test
    public void addEndFindCustomer(){
        HomePage onHomePage = new HomePage(driver);
        onHomePage = onHomePage.navigateToWebApp();
        FindOwners onFindOwners = onHomePage.clickOnFindOwners(driver);
        NewOwner onNewOwner = onFindOwners.clickOnAddOwnerButton(driver);
        onNewOwner.fillFormWithData();
        OwnerInformation onOwnerInformation = onNewOwner.clickOnAddOwnerButton(driver);
        FindOwners onFindOwners2 = onHomePage.clickOnFindOwners(driver);
        onFindOwners.enterOwnerData(driver);
        Owners onOwners = onFindOwners2.clickOnFindOwnerbutton(driver);
        OwnerInformation onOwnerInformation2 = onOwners.clickOnClient(driver);
    }

    @Test
    public void addNewClientWithAnimal() {
        HomePage onHomePage = new HomePage(driver);
        onHomePage = onHomePage.navigateToWebApp();
        FindOwners onFindOwners = onHomePage.clickOnFindOwners(driver);
        NewOwner onNewOwner = onFindOwners.clickOnAddOwnerButton(driver);
        onNewOwner.fillFormWithData();
        OwnerInformation onOwnerInformation = onNewOwner.clickOnAddOwnerButton(driver);
        NewPet onNewPet = onOwnerInformation.addNewPetButton(driver);
        onNewPet.fillFormWithData();
        OwnerInformation onOwnerInformation2 = onNewPet.addPetButton(driver);
    }



    @After
    public void testShutDown() {
      driver.close();
    }
}