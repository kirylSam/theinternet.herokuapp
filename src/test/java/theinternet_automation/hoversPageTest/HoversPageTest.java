package theinternet_automation.hoversPageTest;

import org.testng.annotations.Test;
import theinternet_automation.hovers.HoversPageAct;
import theinternet_automation.initialization.BaseClass;
import theinternet_automation.initialization.DriverFactory;

public class HoversPageTest extends BaseClass {
    @Test
    public void checkHoversPage() {
        HoversPageAct hoversPageAct = new HoversPageAct(DriverFactory.getDriver());
        hoversPageAct
                .openHoversPage()
                .hoverOverPictureOne()
                .checkIfNameOneIsDisplayed()
                .hoverOverPictureTwo()
                .checkIfNameTwoIsDisplayed();
    }
}
