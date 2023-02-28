package theinternet_automation.floatingMenuPageTest;

import org.testng.annotations.Test;
import theinternet_automation.fileUpload.FileUploadPageAct;
import theinternet_automation.floatingMenu.FloatingMenuPageAct;
import theinternet_automation.initialization.BaseClass;
import theinternet_automation.initialization.DriverFactory;

public class FloatingMenuPageTest extends BaseClass {
    @Test
    public void checkFloatingMenuPage() {
        FloatingMenuPageAct floatingMenuPageAct = new FloatingMenuPageAct(DriverFactory.getDriver());
        floatingMenuPageAct
                .openFloatingMenuPage()
                .scrollDownToPageFooter()
                .clickAboutButtonInFloatingMenu()
                .checkIfCurrentURLHasAbout();
    }
}
