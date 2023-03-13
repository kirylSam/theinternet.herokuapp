package theinternet_automation.inputs;

import org.openqa.selenium.WebDriver;
import theinternet_automation.PageObject;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class InputsPageAct extends PageObject {

    InputsPageVerify inputsPageVerify = new InputsPageVerify(driver);
    InputsPageWebElements inputsPageWebElements = new InputsPageWebElements(driver);

    //Constructor
    public InputsPageAct(WebDriver driver) {
        super(driver);
    }

    public InputsPageAct openInputsPage() {
        driver.navigate().to("https://the-internet.herokuapp.com/inputs");
        return this;
    }

    public InputsPageAct enterTextValue() {
        inputsPageWebElements.inputField().sendKeys("AAABBCC");
        return this;
    }


    public InputsPageAct checkIfTextIsNotAccepted() {
        assertFalse(inputsPageVerify.isTextAccepted());
        return this;
    }

    public InputsPageAct enterNumber() {
        inputsPageWebElements.inputField().sendKeys("123");
        return this;
    }

    public InputsPageAct checkIfNumberIsAccepted() {
        assertTrue(inputsPageVerify.isNumberAccepted());
        return this;
    }

}
