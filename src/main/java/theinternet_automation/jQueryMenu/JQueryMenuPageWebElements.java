package theinternet_automation.jQueryMenu;

import lombok.Getter;
import lombok.experimental.Accessors;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import theinternet_automation.PageObject;

@Getter
@Accessors(fluent = true)
public class JQueryMenuPageWebElements extends PageObject {

    public JQueryMenuPageWebElements(WebDriver driver) { super(driver);}

    @FindBy(css = "ul#menu > li:nth-of-type(2) > a")
    private WebElement enabledButton;

    @FindBy(css = "[href='\\/jqueryui']")
    private WebElement backToJQueryUIButton;

    @FindBy(css = "[href='\\/jqueryui\\/menu']")
    private WebElement menuLink;
}
