package theinternet_automation.jsAlertsPageTest;

import org.testng.annotations.Test;
import theinternet_automation.initialization.BaseClass;
import theinternet_automation.initialization.DriverFactory;
import theinternet_automation.jQueryMenu.JQueryMenuPageAct;
import theinternet_automation.jsAlerts.JSAlertsPageAct;

public class JSAlertsPageTest extends BaseClass {
    @Test
    public void checkJSAlertsPage() {
        JSAlertsPageAct jsAlertsPageAct = new JSAlertsPageAct(DriverFactory.getDriver());
        jsAlertsPageAct
                .openJSAlertsPage()
                .clickOnJSAlertButton()
                .acceptJSAlert()
                .checkIfResultSectionIsCorrect();
    }
}
