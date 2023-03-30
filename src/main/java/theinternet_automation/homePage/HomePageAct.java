package theinternet_automation.homePage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import theinternet_automation.PageObject;

import static org.testng.Assert.assertTrue;

public class HomePageAct extends PageObject {
    private final HomePageVerify homePageVerify = new HomePageVerify(driverThread.get());

    //Constructor
    public HomePageAct(WebDriver driver) {
        super(driver);
    }

    public HomePageAct openHomePage() {
        driverThread.get().navigate().to("https://the-internet.herokuapp.com/");
        return this;
    }

    public HomePageAct checkIfHomePageIsOpened() {
        assertTrue(homePageVerify.isHomePageOpened());
        return this;
    }

    void scrollToAndClickUsingJS(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) driverThread.get();
        executor.executeScript("arguments[0].scrollIntoView(true);", element);
        executor.executeScript("arguments[0].click();", element);
    }
}



