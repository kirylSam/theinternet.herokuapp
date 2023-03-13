package theinternet_automation.inputsPageTest;

import org.testng.annotations.Test;
import theinternet_automation.initialization.BaseClass;
import theinternet_automation.initialization.DriverFactory;
import theinternet_automation.inputs.InputsPageAct;

public class InputsPageTest extends BaseClass {
    @Test
    public void checkInputsPage() {
        InputsPageAct inputsPageAct = new InputsPageAct(DriverFactory.getDriver());
        inputsPageAct
                .openInputsPage()
                .enterTextValue()
                .checkIfTextIsNotAccepted()
                .enterNumber()
                .checkIfNumberIsAccepted();
    }
}
