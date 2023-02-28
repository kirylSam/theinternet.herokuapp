package theinternet_automation.contextMenu;

import lombok.Getter;
import lombok.experimental.Accessors;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import theinternet_automation.PageObject;

@Getter
@Accessors(fluent = true)
public class ContextMenuPageWebElements extends PageObject {

    public ContextMenuPageWebElements(WebDriver driver) { super(driver);}

    @FindBy(css = "#hot-spot")
    private WebElement contextMenuField;
    
}
