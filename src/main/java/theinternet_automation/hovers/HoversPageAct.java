package theinternet_automation.hovers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import theinternet_automation.PageObject;
import theinternet_automation.utilities.WaitUtility;

import static org.testng.AssertJUnit.assertTrue;

public class HoversPageAct extends PageObject {

    HoversPageVerify hoversPageVerify = new HoversPageVerify(driver);
    HoversPageWebElements hoversPageWebElements = new HoversPageWebElements(driver);

    //Constructor
    public HoversPageAct(WebDriver driver) {
        super(driver);
    }

    public HoversPageAct openHoversPage() {
        driver.navigate().to("https://the-internet.herokuapp.com/hovers");
        return this;
    }

    public HoversPageAct hoverOverPictureOne() {
        Actions actions = new Actions(driver);
        actions.moveToElement(hoversPageWebElements.imageOne());
        actions.perform();
        return this;
    }


    public HoversPageAct checkIfNameOneIsDisplayed() {
        WaitUtility.WaitForVisibilityOf(hoversPageVerify.hoversPageWebElements.nameOne());
        assertTrue(hoversPageVerify.isNameOneDisplayed());
        return this;
    }

    public HoversPageAct hoverOverPictureTwo() {
        Actions actions = new Actions(driver);
        actions.moveToElement(hoversPageWebElements.imageTwo());
        actions.perform();
        return this;
    }

    public HoversPageAct checkIfNameTwoIsDisplayed() {
        WaitUtility.WaitForVisibilityOf(hoversPageVerify.hoversPageWebElements.nameTwo());
        assertTrue(hoversPageVerify.isNameTwoDisplayed());
        return this;
    }

}
