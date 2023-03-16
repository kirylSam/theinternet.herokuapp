package theinternet_automation.jsAlerts;

import lombok.SneakyThrows;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import theinternet_automation.PageObject;
import theinternet_automation.utilities.WaitUtility;

import static org.testng.AssertJUnit.assertTrue;

public class JSAlertsPageAct extends PageObject {
    /***
     * This whole test is temporarily abandoned due to some issues with Chrome 111. Will return to it later.
     */

    JSAlertsPageVerify jsAlertsPageVerify = new JSAlertsPageVerify(driver);
    JSAlertsPageWebElements jsAlertsPageWebElements = new JSAlertsPageWebElements(driver);

    //Constructor
    public JSAlertsPageAct(WebDriver driver) {
        super(driver);
    }

    public JSAlertsPageAct openJSAlertsPage() {
        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
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
