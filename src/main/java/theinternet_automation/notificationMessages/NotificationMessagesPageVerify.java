package theinternet_automation.notificationMessages;

import org.openqa.selenium.WebDriver;
import theinternet_automation.PageObject;

public class NotificationMessagesPageVerify extends PageObject {

    NotificationMessagesPageWebElements notificationMessagesPageWebElements = new NotificationMessagesPageWebElements(driverThread.get());

    public NotificationMessagesPageVerify(WebDriver driver) { super(driver);}

    public boolean checkIfAnyAlertIsShown() {
        return notificationMessagesPageWebElements.alert().isDisplayed();
    }
}
