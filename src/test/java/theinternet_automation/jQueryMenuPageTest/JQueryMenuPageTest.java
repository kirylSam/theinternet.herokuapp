package theinternet_automation.jQueryMenuPageTest;

import org.testng.annotations.Test;
import theinternet_automation.initialization.BaseClass;
import theinternet_automation.initialization.DriverFactory;
import theinternet_automation.jQueryMenu.JQueryMenuPageAct;

public class JQueryMenuPageTest extends BaseClass {
    @Test
    public void checkJQueryMenuPage() {
        JQueryMenuPageAct jQueryMenuPageAct = new JQueryMenuPageAct(DriverFactory.getDriver());
        jQueryMenuPageAct
                .openJQueryMenuPage()
                .hoverOverEnabledButton()
                .hoverOverBackToJQueryButton()
                .clickBackToJQueryButton()
                .checkMenuLinkIsDisplayed();
    }
}
