package theinternet_automation.addRemoveElements;

import lombok.Getter;
import lombok.experimental.Accessors;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import theinternet_automation.PageObject;

@Getter
@Accessors(fluent = true)
public class AddRemoveElementsPageWebElements extends PageObject {
    public AddRemoveElementsPageWebElements(WebDriver driver) {super(driver);}

    @FindBy(css = "string")
    private WebElement addElementButton;

    @FindBy(css = "string")
    private WebElement deleteElementButton;
}
