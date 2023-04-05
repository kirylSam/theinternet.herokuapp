package theinternet_automation.notificationMessages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import theinternet_automation.PageObject;
import theinternet_automation.utilities.WaitUtility;

import static org.testng.AssertJUnit.assertTrue;

public class NotificationMessagesPageAct extends PageObject {

    NotificationMessagesPageVerify notificationMessagesPageVerify = new NotificationMessagesPageVerify(driverThread.get());
    NotificationMessagesPageWebElements notificationMessagesPageWebElements = new NotificationMessagesPageWebElements(driverThread.get());

    //Constructor
    public NotificationMessagesPageAct(WebDriver driver) {
        super(driver);
    }

    public NotificationMessagesPageAct openNotificationMessagesPage() {
        driverThread.get().navigate().to("https://the-internet.herokuapp.com/notification_message");
        return this;
    }

    public NotificationMessagesPageAct checkIfAnyAlertIsShown() {
        assertTrue(notificationMessagesPageVerify.checkIfAnyAlertIsShown());
        return this;
    }

    public NotificationMessagesPageAct clickOnLoadNewMessageLink() {
        notificationMessagesPageWebElements.loadNewMessageLink().click();
        return this;
    }

    public NotificationMessagesPageAct checkAgainIfAnyAlertIsShown() {
        assertTrue(notificationMessagesPageVerify.checkIfAnyAlertIsShown());
        return this;
    }
}
