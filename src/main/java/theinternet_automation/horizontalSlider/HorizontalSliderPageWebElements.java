package theinternet_automation.horizontalSlider;

import lombok.Getter;
import lombok.experimental.Accessors;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import theinternet_automation.PageObject;

@Getter
@Accessors(fluent = true)
public class HorizontalSliderPageWebElements extends PageObject {

    public HorizontalSliderPageWebElements(WebDriver driver) { super(driver);}

    @FindBy(css = "input")
    private WebElement slider;

    @FindBy(css = "#range")
    private WebElement sliderValue;
}
