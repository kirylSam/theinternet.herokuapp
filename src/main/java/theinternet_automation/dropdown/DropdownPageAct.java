package theinternet_automation.dropdown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import theinternet_automation.PageObject;

import static org.testng.AssertJUnit.assertTrue;

public class DropdownPageAct extends PageObject {

    DropdownPageWebElements dropdownPageWebElements = new DropdownPageWebElements(driver);
    DropdownPageVerify dropdownPageVerify = new DropdownPageVerify(driver);

    public DropdownPageAct(WebDriver driver) { super(driver);}

    public DropdownPageAct openDropdownPage() {
        driver.navigate().to("https://the-internet.herokuapp.com/dropdown");
        return this;
    }

    public DropdownPageAct selectByValueIndexVisibleText() {
        Select dropdownMenu = new Select(dropdownPageWebElements.dropdown());
        dropdownMenu.selectByValue("1");
        dropdownMenu.selectByVisibleText("Option 2");
        dropdownMenu.selectByIndex(2);
        return this;
    }

    public DropdownPageAct checkTextOfDropdownElements() {
        assertTrue(dropdownPageVerify.verifyTextOfEachElement());
        return this;
    }

}
