package theinternet_automation.formAuthentication;

import lombok.Getter;
import lombok.experimental.Accessors;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import theinternet_automation.PageObject;

@Getter
@Accessors(fluent = true)
public class FormAuthPageWebElements extends PageObject {

    public FormAuthPageWebElements(WebDriver driver) { super(driver);}

    @FindBy(css = "#username")
    private WebElement usernameInputField;

    @FindBy(css = "#password")
    private WebElement passwordInputField;

    @FindBy(css = "button")
    private WebElement loginButton;

    @FindBy(css = "h2")
    private WebElement secureAreaHeader;

    @FindBy(css = ".secondary")
    private WebElement logoutButton;

    @FindBy(css = ".flash")
    private WebElement errorMessage;
}
