package theinternet_automation.floatingMenu;

import lombok.Getter;
import lombok.experimental.Accessors;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import theinternet_automation.PageObject;

@Getter
@Accessors(fluent = true)
public class FloatingMenuPageWebElements extends PageObject {

    public FloatingMenuPageWebElements(WebDriver driver) { super(driver);}

    @FindBy(css = "#page-footer")
    private WebElement pageFooter;

    @FindBy(css = "[href='\\#about']")
    private WebElement aboutFloatingButton;
}
