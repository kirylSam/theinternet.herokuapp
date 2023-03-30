package theinternet_automation.contextMenu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import theinternet_automation.PageObject;
import theinternet_automation.utilities.WaitUtility;

import static org.testng.AssertJUnit.assertTrue;

public class ContextMenuPageAct extends PageObject {

    ContextMenuPageWebElements contextMenuPageWebElements = new ContextMenuPageWebElements(driverThread.get());
    ContextMenuPageVerify contextMenuPageVerify = new ContextMenuPageVerify(driverThread.get());

    public ContextMenuPageAct (WebDriver driver) { super(driver);}

    public ContextMenuPageAct openContextMenuPage() {
        driverThread.get().navigate().to("https://the-internet.herokuapp.com/context_menu");
        return this;
    }

    public ContextMenuPageAct rightClickOnContextMenuField() {
        WaitUtility.WaitForVisibilityOf(contextMenuPageWebElements.contextMenuField());

        //right-clicking using Actions class
        Actions action = new Actions(driverThread.get());
        action.contextClick(contextMenuPageWebElements.contextMenuField()).perform();
        return this;
    }

    public ContextMenuPageAct checkIfAlertIsPresent() {
        assertTrue(contextMenuPageVerify.isJSAlertTriggered());
        return this;
    }
}
