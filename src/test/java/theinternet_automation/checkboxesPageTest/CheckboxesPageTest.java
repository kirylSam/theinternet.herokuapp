package theinternet_automation.checkboxesPageTest;

import org.testng.annotations.Test;
import theinternet_automation.checkboxes.CheckboxesPageAct;
import theinternet_automation.initialization.BaseClass;
import theinternet_automation.initialization.DriverFactory;

public class CheckboxesPageTest extends BaseClass {
    @Test
    public void checkCheckboxesPage() {
        CheckboxesPageAct checkboxesPageAct = new CheckboxesPageAct(DriverFactory.getDriver());
        checkboxesPageAct
                .openChexboxesPage()
                .checkIfCheckbox1IsNotSelectedByDefault()
                .checkIfCheckbox2IsSelectedByDefault()
                .clickCheckbox1AndCheckIfSelected()
                .clickCheckbox2AndCheckIfNotSelected();
    }
}
