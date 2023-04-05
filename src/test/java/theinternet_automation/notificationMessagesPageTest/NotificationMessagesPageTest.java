package theinternet_automation.notificationMessagesPageTest;

import org.testng.annotations.Test;
import theinternet_automation.initialization.BaseClass;
import theinternet_automation.initialization.DriverFactory;
import theinternet_automation.jsAlerts.JSAlertsPageAct;
import theinternet_automation.notificationMessages.NotificationMessagesPageAct;

public class NotificationMessagesPageTest extends BaseClass {
    @Test
    public void checkNotificationMessagesPage() {
        NotificationMessagesPageAct notificationMessagesPageAct = new NotificationMessagesPageAct(DriverFactory.getDriver());
        notificationMessagesPageAct
                .openNotificationMessagesPage()
                .checkIfAnyAlertIsShown()
                .clickOnLoadNewMessageLink()
                .checkAgainIfAnyAlertIsShown();
    }
}
