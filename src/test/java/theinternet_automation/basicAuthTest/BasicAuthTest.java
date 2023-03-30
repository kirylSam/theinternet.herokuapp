package theinternet_automation.basicAuthTest;

import org.testng.annotations.Test;
import theinternet_automation.basicAuth.BasicAuthPageAct;
import theinternet_automation.initialization.BaseClass;
import theinternet_automation.initialization.DriverFactory;

public class BasicAuthTest extends BaseClass {
    @Test
    public void checkBasicAuth() {
        BasicAuthPageAct basicAuthPageAct = new BasicAuthPageAct(DriverFactory.getDriver());
        basicAuthPageAct
                .passLoginAndPasswordInURLandOpenBasicAuth()
                .checkIfBasicAuthIsSuccessful();
    }
}
