package theinternet_automation.notificationMessages;

import lombok.Getter;
import lombok.experimental.Accessors;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import theinternet_automation.PageObject;

@Getter
@Accessors(fluent = true)
public class NotificationMessagesPageWebElements extends PageObject {

    public NotificationMessagesPageWebElements(WebDriver driver) { super(driver);}

    @FindBy(css = "#flash")
    private WebElement alert;

    @FindBy(css = "[href='\\/notification_message']")
    private WebElement loadNewMessageLink;
}
