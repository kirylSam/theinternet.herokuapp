package theinternet_automation.multipleWindowsTest;

import org.testng.annotations.Test;
import theinternet_automation.contextMenu.ContextMenuPageAct;
import theinternet_automation.initialization.BaseClass;
import theinternet_automation.initialization.DriverFactory;
import theinternet_automation.multipleWindows.MultipleWindowsPageAct;

public class MultipleWindowsPageTest extends BaseClass {
    @Test
    public void checkMultipleWindowsPage() {
        MultipleWindowsPageAct multipleWindowsPageAct = new MultipleWindowsPageAct(DriverFactory.getDriver());
        multipleWindowsPageAct
                .openMultipleWindowsPage()
                .clickOnNewTabLink()
                .checkIfANewTabIsOpened();
    }
}
