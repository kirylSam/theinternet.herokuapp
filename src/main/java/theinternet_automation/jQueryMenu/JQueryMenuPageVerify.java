package theinternet_automation.jQueryMenu;

import org.openqa.selenium.WebDriver;
import theinternet_automation.PageObject;

public class JQueryMenuPageVerify extends PageObject {

    JQueryMenuPageWebElements jQueryMenuPageWebElements = new JQueryMenuPageWebElements(driverThread.get());

    public JQueryMenuPageVerify(WebDriver driver) { super(driver);}

    public boolean isMenuLinkDisplayed() {
        return jQueryMenuPageWebElements.menuLink().isDisplayed();
    }
}
