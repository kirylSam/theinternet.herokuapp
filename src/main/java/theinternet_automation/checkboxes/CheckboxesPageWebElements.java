package theinternet_automation.checkboxes;

import lombok.Getter;
import lombok.experimental.Accessors;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import theinternet_automation.PageObject;

@Getter
@Accessors(fluent = true)
public class CheckboxesPageWebElements extends PageObject {

    public CheckboxesPageWebElements(WebDriver driver) {super(driver);}

    @FindBy(css = "#checkboxes [type='checkbox']:nth-of-type(1)")
    private WebElement checkbox1;

    @FindBy(css = "form#checkboxes > input:nth-of-type(2)")
    private WebElement checkbox2;
}
