package theinternet_automation.jsAlerts;

import org.openqa.selenium.WebDriver;
import theinternet_automation.PageObject;

public class JSAlertsPageVerify extends PageObject {

    JSAlertsPageWebElements jsAlertsPageWebElements = new JSAlertsPageWebElements(driverThread.get());

    public JSAlertsPageVerify(WebDriver driver) { super(driver);}

    public boolean isResultConfirmingThatJSAlertWasClicked() {
        return jsAlertsPageWebElements.result().getText().contains("You successfully clicked an alert");
    }
}
