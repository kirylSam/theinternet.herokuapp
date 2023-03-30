package theinternet_automation.checkboxes;

import org.openqa.selenium.WebDriver;
import theinternet_automation.PageObject;
import theinternet_automation.utilities.WaitUtility;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class CheckboxesPageAct extends PageObject {

    private CheckboxesPageVerify checkboxesPageVerify = new CheckboxesPageVerify(driverThread.get());
    private CheckboxesPageWebElements checkboxesPageWebElements = new CheckboxesPageWebElements(driverThread.get());

    public CheckboxesPageAct(WebDriver driver) {super(driver);}

    public CheckboxesPageAct openChexboxesPage() {
        driverThread.get().navigate().to("https://the-internet.herokuapp.com/checkboxes");
        return this;
    }

    public CheckboxesPageAct checkIfCheckbox1IsNotSelectedByDefault() {
        WaitUtility.WaitForVisibilityOf(checkboxesPageWebElements.checkbox1());
        assertTrue((checkboxesPageVerify.isCheckbox1NotSelectedByDefault()));
        return this;
    }

    public CheckboxesPageAct checkIfCheckbox2IsSelectedByDefault() {
        assertTrue(checkboxesPageVerify.isCheckbox2SelectedByDefault());
        return this;
    }

    public CheckboxesPageAct clickCheckbox1AndCheckIfSelected() {
        checkboxesPageWebElements.checkbox1().click();
        assertTrue(checkboxesPageVerify.isCheckboxSelected(checkboxesPageWebElements.checkbox1()));
        return this;
    }

    public CheckboxesPageAct clickCheckbox2AndCheckIfNotSelected() {
        checkboxesPageWebElements.checkbox2().click();
        assertFalse(checkboxesPageVerify.isCheckboxSelected(checkboxesPageWebElements.checkbox2()));
        return this;
    }

}
