package theinternet_automation.entryAd;

import org.openqa.selenium.WebDriver;
import theinternet_automation.PageObject;
import theinternet_automation.utilities.WaitUtility;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class EntryAdPageAct extends PageObject {

    EntryAdPageWebElements entryAdPageWebElements = new EntryAdPageWebElements(driver);
    EntryAdPageVerify entryAdPageVerify = new EntryAdPageVerify(driver);

    public EntryAdPageAct(WebDriver driver) { super(driver);}

    public EntryAdPageAct openEntryAdPage() {
        driver.navigate().to("https://the-internet.herokuapp.com/entry_ad");
        return this;
    }

    public EntryAdPageAct checkIfEntryAdIsVisible() {
        WaitUtility.WaitForVisibilityOf(entryAdPageWebElements.entryAdModal());
        assertTrue(entryAdPageVerify.isAdModalVisible());
        return this;
    }

    public EntryAdPageAct closeEntryAdModal() {
        entryAdPageWebElements.entryAdModalCloseButton().click();
        return this;
    }

    public EntryAdPageAct checkIfEntryAdIsNotVisible() {
        assertFalse(entryAdPageVerify.isAdModalVisible());
        return this;
    }
}
