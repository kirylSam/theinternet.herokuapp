package theinternet_automation.basicAuth;

import org.openqa.selenium.WebDriver;
import theinternet_automation.PageObject;

import static org.testng.AssertJUnit.assertTrue;

public class BasicAuthPageAct extends PageObject {

    private final BasicAuthPageVerify basicAuthPageVerify = new BasicAuthPageVerify(driver);

    //Constructor
    public BasicAuthPageAct(WebDriver driver) {
        super(driver);
    }

    public BasicAuthPageAct passLoginAndPasswordInURLandOpenBasicAuth() {
        //TODO wylapac okienko i tam wbic
        driver.navigate().to("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        return this;
    }

    public BasicAuthPageAct checkIfBasicAuthIsSuccessfull() {
        assertTrue(basicAuthPageVerify.areWeLoggedIn());
        return this;
    }
}
