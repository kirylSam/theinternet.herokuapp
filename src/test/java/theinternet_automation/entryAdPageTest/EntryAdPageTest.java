package theinternet_automation.entryAdPageTest;

import org.testng.annotations.Test;
import theinternet_automation.entryAd.EntryAdPageAct;
import theinternet_automation.initialization.BaseClass;
import theinternet_automation.initialization.DriverFactory;

public class EntryAdPageTest extends BaseClass {
    @Test
    public void checkEntryAdPage() {
        EntryAdPageAct entryAdPageAct = new EntryAdPageAct(DriverFactory.getDriver());
        entryAdPageAct
                .openEntryAdPage()
                .checkIfEntryAdIsVisible()
                .closeEntryAdModal()
                .checkIfEntryAdIsNotVisible();
    }
}
