package theinternet_automation.geolocation;

import lombok.Getter;
import lombok.experimental.Accessors;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import theinternet_automation.PageObject;

@Getter
@Accessors(fluent = true)
public class GeolocationPageWebElements extends PageObject {

    public GeolocationPageWebElements(WebDriver driver) { super(driver);}

    @FindBy(css = "button")
    private WebElement whereAmIButton;

    @FindBy(css = "#lat-value")
    private WebElement latValue;

    @FindBy(css = "#long-value")
    private WebElement longValue;

    @FindBy(css = "#demo")
    private WebElement coordinatesElement;
}
