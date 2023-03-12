package theinternet_automation.hovers;

import org.openqa.selenium.WebDriver;
import theinternet_automation.PageObject;

public class HoversPageVerify extends PageObject {

    HoversPageWebElements hoversPageWebElements = new HoversPageWebElements(driver);

    public HoversPageVerify(WebDriver driver) { super(driver);}


    public boolean isNameOneDisplayed() {
        return hoversPageWebElements.nameOne().isDisplayed();
    }

    public boolean isNameTwoDisplayed() {
        return hoversPageWebElements.nameTwo().isDisplayed();
    }
}
