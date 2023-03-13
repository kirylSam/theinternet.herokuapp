package theinternet_automation.exitAd;

import lombok.Getter;
import lombok.experimental.Accessors;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import theinternet_automation.PageObject;

@Getter
@Accessors(fluent = true)
public class ExitAdPageWebElements extends PageObject {

    public ExitAdPageWebElements(WebDriver driver) { super(driver);}

    @FindBy(css = ".modal")
    private WebElement exitAdModal;

    @FindBy(css = ".modal-footer p")
    private WebElement exitAdModalCloseButton;
}
