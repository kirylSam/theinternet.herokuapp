package theinternet_automation.jQueryMenu;

import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import theinternet_automation.PageObject;
import theinternet_automation.utilities.WaitUtility;

import static org.testng.AssertJUnit.assertTrue;

public class JQueryMenuPageAct extends PageObject {

    JQueryMenuPageVerify jQueryMenuPageVerify = new JQueryMenuPageVerify(driver);
    JQueryMenuPageWebElements jQueryMenuPageWebElements = new JQueryMenuPageWebElements(driver);

    //Constructor
    public JQueryMenuPageAct(WebDriver driver) {
        super(driver);
    }

    public JQueryMenuPageAct openJQueryMenuPage() {
        driver.navigate().to("https://the-internet.herokuapp.com/jqueryui/menu");
        return this;
    }

    public JQueryMenuPageAct hoverOverEnabledButton() {
        Actions actions = new Actions(driver);
        actions.moveToElement(jQueryMenuPageWebElements.enabledButton());
        actions.perform();
        return this;
    }

    public JQueryMenuPageAct hoverOverBackToJQueryButton() {
        WaitUtility.WaitForVisibilityOf(jQueryMenuPageWebElements.backToJQueryUIButton());
        Actions actions = new Actions(driver);
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
