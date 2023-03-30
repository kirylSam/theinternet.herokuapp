package theinternet_automation.exitAd;

import org.openqa.selenium.WebDriver;
import theinternet_automation.PageObject;

public class ExitAdPageVerify extends PageObject {
    ExitAdPageWebElements exitAdPageWebElements = new ExitAdPageWebElements(driverThread.get());

    public ExitAdPageVerify(WebDriver driver) { super(driver);}
    boolean isExitAdModalVisible() {
        return exitAdPageWebElements.exitAdModal().isDisplayed();
    }
}
