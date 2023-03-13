package theinternet_automation.inputs;

import lombok.Getter;
import lombok.experimental.Accessors;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import theinternet_automation.PageObject;

@Getter
@Accessors(fluent = true)
public class InputsPageWebElements extends PageObject {

    public InputsPageWebElements(WebDriver driver) { super(driver);}

    @FindBy(css = "input[type='number']")
    private WebElement inputField;
}
