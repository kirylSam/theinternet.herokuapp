package theinternet_automation.homePageTest;

import org.testng.annotations.Test;
import theinternet_automation.homePage.HomePageAct;
import theinternet_automation.initialization.BaseClass;
import theinternet_automation.initialization.DriverFactory;


public class HomePageTest extends BaseClass{
    @Test
    public void checkHomePage() {
        HomePageAct homePageAct = new HomePageAct(DriverFactory.getDriver());
        homePageAct
                .openHomePage()
                .checkIfHomePageIsOpened();
    }
}