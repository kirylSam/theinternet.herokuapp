package theinternet_automation.basicAuth;

import org.openqa.selenium.WebDriver;
import theinternet_automation.PageObject;
import theinternet_automation.utilities.WaitUtility;

import static org.testng.AssertJUnit.assertTrue;

public class BasicAuthPageAct extends PageObject {

    BasicAuthPageVerify basicAuthPageVerify = new BasicAuthPageVerify(driverThread.get());
    BasicAuthPageWebElements basicAuthPageWebElements = new BasicAuthPageWebElements(driverThread.get());


    //Constructor
    public BasicAuthPageAct(WebDriver driver) {
        super(driver);
    }

    public BasicAuthPageAct passLoginAndPasswordInURLandOpenBasicAuth() {
        driverThread.get().navigate().to("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        return this;
    }

    public BasicAuthPageAct checkIfBasicAuthIsSuccessful() {
        WaitUtility.WaitForVisibilityOf(basicAuthPageWebElements.congratulationsLabel());
        assertTrue(basicAuthPageVerify.areWeLoggedIn());
        return this;
    }
}
