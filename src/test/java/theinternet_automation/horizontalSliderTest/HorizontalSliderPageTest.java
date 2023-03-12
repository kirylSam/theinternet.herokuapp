package theinternet_automation.horizontalSliderTest;

import org.testng.annotations.Test;
import theinternet_automation.horizontalSlider.HorizontalSliderPageAct;
import theinternet_automation.initialization.BaseClass;
import theinternet_automation.initialization.DriverFactory;

public class HorizontalSliderPageTest extends BaseClass {
    @Test
    public void checkHorizontalSliderPage() {
        HorizontalSliderPageAct horizontalSliderPageAct = new HorizontalSliderPageAct(DriverFactory.getDriver());
        horizontalSliderPageAct
                .openHorizontalSliderPage()
                .clickOnSlider()
                .pressRightArrowButton(4)
                .checkIfSliderIndicatesCorrectValue(2);
    }
}
