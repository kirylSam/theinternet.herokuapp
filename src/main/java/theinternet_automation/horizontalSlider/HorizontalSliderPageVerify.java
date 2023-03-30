package theinternet_automation.horizontalSlider;

import org.openqa.selenium.WebDriver;
import theinternet_automation.PageObject;

public class HorizontalSliderPageVerify extends PageObject {

    HorizontalSliderPageWebElements horizontalSliderPageWebElements = new HorizontalSliderPageWebElements(driverThread.get());

    public HorizontalSliderPageVerify(WebDriver driver) { super(driver);}


    public boolean isSliderIndicatingCorrectValue(int expectedSliderValue) {
        String valueString = horizontalSliderPageWebElements.sliderValue().getText();
        int valueInt = Integer.valueOf(valueString);
        if (valueInt == expectedSliderValue) {
            return true;
        } else {
            return false;
        }
    }
}
