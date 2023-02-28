package theinternet_automation.exitAdPageTest;

import org.testng.annotations.Test;
import theinternet_automation.exitAd.ExitAdPageAct;
import theinternet_automation.initialization.BaseClass;
import theinternet_automation.initialization.DriverFactory;

public class ExitAdPageTest extends BaseClass {
    /** there's a big chance that this test should not be automated as:
     * 1. Selenium is only able to use the mouse while inside the DOM of the browser;
     * 2. So, it's not able to move the mouse outside the document window;
     * 3. And, I'm automating this only as a part of my practice;
     * 4. Also, using the Robot class may cause issues with headless/mouse-less environment;
     */

    @Test
    public void checkExitAdPage() {
        ExitAdPageAct exitAdPageAct = new ExitAdPageAct(DriverFactory.getDriver());
        exitAdPageAct
                .openExitAdPage()
                .checkIfExitAdIsNotShown()
                .moveMouseCursorOutOfViewportPane()
                .checkIfExitAdIsVisible()
                .closeExitAdModal()
                .checkIfExitAdIsNotShown();
    }
}
