package theinternet_automation.geolocation;

import org.openqa.selenium.WebDriver;
import theinternet_automation.PageObject;
import theinternet_automation.utilities.WaitUtility;

import static org.testng.AssertJUnit.assertTrue;

public class GeolocationPageAct extends PageObject {

    GeolocationPageVerify geolocationPageVerify = new GeolocationPageVerify(driverThread.get());
    GeolocationPageWebElements geolocationPageWebElements = new GeolocationPageWebElements(driverThread.get());

    //Constructor
    public GeolocationPageAct(WebDriver driver) {
        super(driver);
    }

    public GeolocationPageAct openGeolocationPage() {
        driverThread.get().navigate().to("https://the-internet.herokuapp.com/geolocation");
        return this;
    }

    public GeolocationPageAct clickWhereAmIButton() {
        geolocationPageWebElements.whereAmIButton().click();
        return this;
    }

    public GeolocationPageAct checkIfLatAndLongValuesAreDisplayed() {
        WaitUtility.WaitForVisibilityOf(geolocationPageWebElements.latValue());
        assertTrue("Lat and Long values are not displayed!", geolocationPageVerify.areLongAndLatValuesDisplayed());
        return this;
    }
}
