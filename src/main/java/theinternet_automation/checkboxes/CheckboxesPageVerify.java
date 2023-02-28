package theinternet_automation.checkboxes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import theinternet_automation.PageObject;

public class CheckboxesPageVerify extends PageObject {

    private CheckboxesPageWebElements checkboxesPageWebElements = new CheckboxesPageWebElements(driver);

    public CheckboxesPageVerify(WebDriver driver) {super(driver);}

    boolean isCheckbox1NotSelectedByDefault() {
        return (!checkboxesPageWebElements.checkbox1().isSelected());
    }

    boolean isCheckbox2SelectedByDefault() {
        return(checkboxesPageWebElements.checkbox2().isSelected());
    }

    boolean isCheckboxSelected(WebElement element) {
        return element.isSelected();
    }


}
