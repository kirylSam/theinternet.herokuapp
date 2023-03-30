package theinternet_automation.exitAd;

import org.openqa.selenium.WebDriver;
import theinternet_automation.PageObject;
import theinternet_automation.utilities.WaitUtility;

import java.awt.*;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class ExitAdPageAct extends PageObject {

    ExitAdPageWebElements exitAdPageWebElements = new ExitAdPageWebElements(driverThread.get());
    ExitAdPageVerify exitAdPageVerify = new ExitAdPageVerify(driverThread.get());

    public ExitAdPageAct(WebDriver driver) { super(driver);}

    public ExitAdPageAct openExitAdPage() {
        driverThread.get().navigate().to("https://the-internet.herokuapp.com/entry_ad");
        return this;
    }

    public ExitAdPageAct checkIfExitAdIsNotShown() {
        assertFalse(exitAdPageVerify.isExitAdModalVisible());
        return this;
    }

    public ExitAdPageAct moveMouseCursorOutOfViewportPane() {
        //this is a funky way of testing such feature as it may cause issues when run in headless or on a server
        //(without a physical mouse)
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        robot.mouseMove(600,0);
        return this;
    }

    public ExitAdPageAct checkIfExitAdIsVisible() {
        WaitUtility.WaitForVisibilityOf(exitAdPageWebElements.exitAdModal());
        assertTrue(exitAdPageVerify.isExitAdModalVisible());
        return this;
    }

    public ExitAdPageAct closeExitAdModal() {
        WaitUtility.WaitForVisibilityOf(exitAdPageWebElements.exitAdModalCloseButton());
        exitAdPageWebElements.exitAdModalCloseButton().click();
        return this;
    }
}
