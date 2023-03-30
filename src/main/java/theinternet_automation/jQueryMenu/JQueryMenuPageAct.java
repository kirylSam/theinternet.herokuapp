package theinternet_automation.jQueryMenu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import theinternet_automation.PageObject;
import theinternet_automation.utilities.WaitUtility;

import static org.testng.AssertJUnit.assertTrue;

public class JQueryMenuPageAct extends PageObject {

    JQueryMenuPageVerify jQueryMenuPageVerify = new JQueryMenuPageVerify(driverThread.get());
    JQueryMenuPageWebElements jQueryMenuPageWebElements = new JQueryMenuPageWebElements(driverThread.get());

    //Constructor
    public JQueryMenuPageAct(WebDriver driver) {
        super(driver);
    }

    public JQueryMenuPageAct openJQueryMenuPage() {
        driverThread.get().navigate().to("https://the-internet.herokuapp.com/jqueryui/menu");
        return this;
    }

    public JQueryMenuPageAct hoverOverEnabledButton() {
        Actions actions = new Actions(driverThread.get());
        actions.moveToElement(jQueryMenuPageWebElements.enabledButton());
        actions.perform();
        return this;
    }

    public JQueryMenuPageAct hoverOverBackToJQueryButton() {
        WaitUtility.WaitForVisibilityOf(jQueryMenuPageWebElements.backToJQueryUIButton());
        Actions actions = new Actions(driverThread.get());
        actions.moveToElement(jQueryMenuPageWebElements.backToJQueryUIButton());
        actions.perform();
        return this;
    }

    public JQueryMenuPageAct clickBackToJQueryButton() {
       jQueryMenuPageWebElements.backToJQueryUIButton().click();
       return this;
    }

    public JQueryMenuPageAct checkMenuLinkIsDisplayed() {
        assertTrue(jQueryMenuPageVerify.isMenuLinkDisplayed());
        return this;
    }

}
