package theinternet_automation.initialization;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
    @BeforeClass
    @Parameters({"browser"})
    public void setUp(String browser) {
        DriverFactory.setupWebDriver(browser);
    }

    @AfterClass
    public void tearDown() {
        DriverFactory.closeBrowser();
    }
}
