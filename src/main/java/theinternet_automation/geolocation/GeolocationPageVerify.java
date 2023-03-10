package theinternet_automation.geolocation;

import org.openqa.selenium.WebDriver;
import theinternet_automation.PageObject;

public class GeolocationPageVerify extends PageObject {

    GeolocationPageWebElements geolocationPageWebElements = new GeolocationPageWebElements(driver);

    public GeolocationPageVerify(WebDriver driver) { super(driver);}

    boolean areLongAndLatValuesDisplayed() {
        return geolocationPageWebElements.latValue().isDisplayed() && geolocationPageWebElements.longValue().isDisplayed();
    }
}
