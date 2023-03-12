package theinternet_automation.hovers;

import lombok.Getter;
import lombok.experimental.Accessors;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import theinternet_automation.PageObject;

@Getter
@Accessors(fluent = true)
public class HoversPageWebElements extends PageObject {

    public HoversPageWebElements(WebDriver driver) { super(driver);}

    @FindBy(css = "div:nth-of-type(1) > img[alt='User Avatar']")
    private WebElement imageOne;

    @FindBy(css = "div:nth-of-type(1) > .figcaption > h5")
    private WebElement nameOne;

    @FindBy(css = "div:nth-of-type(2) > img[alt='User Avatar']")
    private WebElement imageTwo;

    @FindBy(css = "div:nth-of-type(2) > .figcaption > h5")
    private WebElement nameTwo;
}
