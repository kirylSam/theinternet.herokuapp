package theinternet_automation.multipleWindows;

import lombok.Getter;
import lombok.experimental.Accessors;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import theinternet_automation.PageObject;

@Getter
@Accessors(fluent = true)
public class MultipleWindowsPageWebElements extends PageObject {

    public MultipleWindowsPageWebElements(WebDriver driver) { super(driver);}

    @FindBy(css = ".example [target]")
    private WebElement newTabLink;

    @FindBy(css = "h3")
    private WebElement newTabText;
}
