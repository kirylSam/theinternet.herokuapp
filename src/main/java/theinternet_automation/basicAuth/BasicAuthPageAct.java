package theinternet_automation.basicAuth;

import org.openqa.selenium.WebDriver;
import theinternet_automation.PageObject;
import theinternet_automation.utilities.WaitUtility;

import static org.testng.AssertJUnit.assertTrue;

public class BasicAuthPageAct extends PageObject {

    BasicAuthPageVerify basicAuthPageVerify = new BasicAuthPageVerify(driver);
    BasicAuthPageWebElements basicAuthPageWebElements = new BasicAuthPageWebElements(driver);

    //Constructor
    public BasicAuthPageAct(WebDriver driver) {
        super(driver);
    }

    public BasicAuthPageAct passLoginAndPasswordInURLandOpenBasicAuth() {
        driver.navigate().to("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        return this;
    }

    public BasicAuthPageAct checkIfBasicAuthIsSuccessfull() {
        WaitUtility.WaitForVisibilityOf(basicAuthPageWebElements.congratulationsLabel());
        assertTrue(basicAuthPageVerify.areWeLoggedIn());
        return this;
    }
}
