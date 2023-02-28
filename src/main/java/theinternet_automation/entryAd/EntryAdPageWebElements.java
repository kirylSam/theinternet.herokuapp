package theinternet_automation.entryAd;

import lombok.Getter;
import lombok.experimental.Accessors;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import theinternet_automation.PageObject;

@Getter
@Accessors(fluent = true)
public class EntryAdPageWebElements extends PageObject {

    public EntryAdPageWebElements(WebDriver driver) { super(driver);}

    @FindBy(css = ".modal")
    private WebElement entryAdModal;

    @FindBy(css = ".modal-footer p")
    private WebElement entryAdModalCloseButton;
    
}
