package theinternet_automation.jsAlerts;

import lombok.Getter;
import lombok.experimental.Accessors;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import theinternet_automation.PageObject;

@Getter
@Accessors(fluent = true)
public class JSAlertsPageWebElements extends PageObject {

    public JSAlertsPageWebElements(WebDriver driver) { super(driver);}

    @FindBy(css = "[onclick='jsAlert\\(\\)']")
    private WebElement jsAlertButton;

    @FindBy(css = "[onclick='jsConfirm\\(\\)']")
    private WebElement jsConfirmButton;

    @FindBy(css = "[onclick='jsPrompt\\(\\)']")
    private WebElement jsPrompt;

    @FindBy(css = "#result")
    private WebElement result;
}
