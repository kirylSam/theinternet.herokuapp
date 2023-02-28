package theinternet_automation.dropdown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import theinternet_automation.PageObject;

import java.util.List;

public class DropdownPageVerify extends PageObject {
    DropdownPageWebElements dropdownPageWebElements = new DropdownPageWebElements(driver);

    public DropdownPageVerify(WebDriver driver) { super(driver);}

    public boolean verifyTextOfEachElement() {
        Select selectDropdown = new Select(dropdownPageWebElements.dropdown());
        List<WebElement> dropdownOptions = selectDropdown.getOptions();

        String option1Text = dropdownOptions.get(1).getText();
        String option2Text = dropdownOptions.get(2).getText();

        if (option1Text.equals("Option 1") && option2Text.equals("Option 2")) {
            return true;
        } else {
            return false;
        }
    }
}
