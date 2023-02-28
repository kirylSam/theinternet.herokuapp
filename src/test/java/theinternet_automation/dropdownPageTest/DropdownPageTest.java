package theinternet_automation.dropdownPageTest;

import org.testng.annotations.Test;
import theinternet_automation.dropdown.DropdownPageAct;
import theinternet_automation.initialization.BaseClass;
import theinternet_automation.initialization.DriverFactory;

public class DropdownPageTest extends BaseClass {
    @Test
    public void checkDropdown() {
        DropdownPageAct dropdownPageAct = new DropdownPageAct(DriverFactory.getDriver());
        dropdownPageAct
                .openDropdownPage()
                .selectByValueIndexVisibleText()
                .checkTextOfDropdownElements();
    }
}
