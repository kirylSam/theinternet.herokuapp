package theinternet_automation.initialization;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
    @BeforeClass
    @Parameters({"browser"})
    public void setUp(String browser) {
        DriverFactory.setupWebDriver(browser);
        WebDriver driver = DriverFactory.getDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown() {
        DriverFactory.closeBrowser();
    }
}
