package theinternet_automation.exitAd;

import org.openqa.selenium.WebDriver;
import theinternet_automation.PageObject;
import theinternet_automation.entryAd.EntryAdPageWebElements;

public class ExitAdPageVerify extends PageObject {
    ExitAdPageWebElements exitAdPageWebElements = new ExitAdPageWebElements(driver);

    public ExitAdPageVerify(WebDriver driver) { super(driver);}
    boolean isExitAdModalVisible() {
        return exitAdPageWebElements.exitAdModal().isDisplayed();
    }
}
