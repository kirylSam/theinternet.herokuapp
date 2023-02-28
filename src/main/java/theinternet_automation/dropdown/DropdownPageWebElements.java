package theinternet_automation.dropdown;

import lombok.Getter;
import lombok.experimental.Accessors;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import theinternet_automation.PageObject;

@Getter
@Accessors(fluent = true)
public class DropdownPageWebElements extends PageObject {

    public DropdownPageWebElements(WebDriver driver) { super(driver);}

    @FindBy(css = "select#dropdown")
    private WebElement dropdown;
    
}
