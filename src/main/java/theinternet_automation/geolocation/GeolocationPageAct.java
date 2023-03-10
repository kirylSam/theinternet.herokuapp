package theinternet_automation.geolocation;

import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import theinternet_automation.PageObject;
import theinternet_automation.utilities.WaitUtility;

import static org.testng.AssertJUnit.assertTrue;

public class GeolocationPageAct extends PageObject {

    GeolocationPageVerify geolocationPageVerify = new GeolocationPageVerify(driver);
    GeolocationPageWebElements geolocationPageWebElements = new GeolocationPageWebElements(driver);

    //Constructor
    public GeolocationPageAct(WebDriver driver) {
        super(driver);
    }

    public GeolocationPageAct openGeolocationPage() {
        driver.navigate().to("https://the-internet.herokuapp.com/geolocation");
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
