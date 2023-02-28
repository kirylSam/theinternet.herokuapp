package theinternet_automation.contextMenuPageTest;

import org.testng.annotations.Test;
import theinternet_automation.contextMenu.ContextMenuPageAct;
import theinternet_automation.initialization.BaseClass;
import theinternet_automation.initialization.DriverFactory;

public class ContextMenuPageTest extends BaseClass {
    @Test
    public void checkContextMenu() {
        ContextMenuPageAct contextMenuPageAct = new ContextMenuPageAct(DriverFactory.getDriver());
        contextMenuPageAct
                .openContextMenuPage()
                .rightClickOnContextMenuField()
                .checkIfAlertIsPresent();
    }
}
