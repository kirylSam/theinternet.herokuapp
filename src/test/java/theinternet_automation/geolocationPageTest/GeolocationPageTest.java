package theinternet_automation.geolocationPageTest;

import org.testng.annotations.Test;
import theinternet_automation.formAuthentication.FormAuthPageAct;
import theinternet_automation.geolocation.GeolocationPageAct;
import theinternet_automation.initialization.BaseClass;
import theinternet_automation.initialization.DriverFactory;

public class GeolocationPageTest extends BaseClass {
    @Test
    public void checkGeolocationPage() {
        GeolocationPageAct geolocationPageAct = new GeolocationPageAct(DriverFactory.getDriver());
        geolocationPageAct
                .openGeolocationPage()
                .clickWhereAmIButton()
                .checkIfLatAndLongValuesAreDisplayed();
    }
}
