package theinternet_automation.inputs;

import org.openqa.selenium.WebDriver;
import theinternet_automation.PageObject;

public class InputsPageVerify extends PageObject {

    InputsPageWebElements inputsPageWebElements = new InputsPageWebElements(driver);

    public InputsPageVerify(WebDriver driver) { super(driver);}

    public boolean isTextAccepted() {
        String typedValue = inputsPageWebElements.inputField().getAttribute("value");
        int size = typedValue.length();
        if (size == 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isNumberAccepted() {
        String typedValue = inputsPageWebElements.inputField().getAttribute("value");
        int size = typedValue.length();
        if (size != 0) {
            return true;
        } else {
            return false;
        }
    }
}
