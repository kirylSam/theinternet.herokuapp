package theinternet_automation.addRemoveElements;

import org.openqa.selenium.WebDriver;
import theinternet_automation.PageObject;

import static org.testng.AssertJUnit.assertTrue;

public class AddRemoveElementsPageAct extends PageObject {
    AddRemoveElementsPageWebElements addRemoveElementsPageWebElements = new AddRemoveElementsPageWebElements(driverThread.get());
    AddRemoveElementsPageVerify addRemoveElementsPageVerify = new AddRemoveElementsPageVerify(driverThread.get());

    public AddRemoveElementsPageAct(WebDriver driver) {super(driver);}

    public AddRemoveElementsPageAct openAddRemoveElementsPage() {
        driverThread.get().navigate().to("https://the-internet.herokuapp.com/add_remove_elements/");
        return this;
    }

    public AddRemoveElementsPageAct clickOnAddElementButton() {
        addRemoveElementsPageWebElements.addElementButton().click();
        return this;
    }

    public AddRemoveElementsPageAct clickOnDeleteButtonForElement(String elementId) {
        addRemoveElementsPageWebElements.deleteElementButton().click();
        return this;
    }

    public AddRemoveElementsPageAct checkIfElementIsAdded() {
        assertTrue(addRemoveElementsPageVerify.isElementAdded());
        return this;
    }

    public AddRemoveElementsPageAct checkIfElementIsDeleted() {
        assertTrue(addRemoveElementsPageVerify.isElementDeleted());
        return this;
    }
}
