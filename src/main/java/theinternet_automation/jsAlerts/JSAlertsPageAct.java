package theinternet_automation.jsAlerts;

import lombok.SneakyThrows;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import theinternet_automation.PageObject;
import theinternet_automation.utilities.WaitUtility;

import static org.testng.AssertJUnit.assertTrue;

public class JSAlertsPageAct extends PageObject {

    JSAlertsPageVerify jsAlertsPageVerify = new JSAlertsPageVerify(driverThread.get());
    JSAlertsPageWebElements jsAlertsPageWebElements = new JSAlertsPageWebElements(driverThread.get());

    //Constructor
    public JSAlertsPageAct(WebDriver driver) {
        super(driver);
    }

    public JSAlertsPageAct openJSAlertsPage() {
        driverThread.get().navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
        return this;
    }

    public JSAlertsPageAct clickOnJSAlertButton() {
        jsAlertsPageWebElements.jsAlertButton().click();
        return this;
    }

    public JSAlertsPageAct acceptJSAlert() {
        Alert alert = WaitUtility.WaitForAlertToBeDisplayed();
        alert.accept();
        return this;
    }


    public JSAlertsPageAct checkIfResultSectionIsCorrect() {
        WaitUtility.WaitForVisibilityOf(jsAlertsPageWebElements.result());
        assertTrue(jsAlertsPageVerify.isResultConfirmingThatJSAlertWasClicked());
        return this;
    }
}
