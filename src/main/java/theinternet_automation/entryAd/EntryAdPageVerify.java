package theinternet_automation.entryAd;

import org.openqa.selenium.WebDriver;
import theinternet_automation.PageObject;

public class EntryAdPageVerify extends PageObject {
    EntryAdPageWebElements entryAdPageWebElements = new EntryAdPageWebElements(driverThread.get());

    public EntryAdPageVerify(WebDriver driver) { super(driver);}

    boolean isAdModalVisible() {
        return entryAdPageWebElements.entryAdModal().isDisplayed();
    }
}
