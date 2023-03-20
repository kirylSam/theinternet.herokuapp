package theinternet_automation.multipleWindows;

import org.openqa.selenium.WebDriver;
import theinternet_automation.PageObject;
import theinternet_automation.utilities.WaitUtility;

public class MultipleWindowsPageVerify extends PageObject {

    MultipleWindowsPageWebElements multipleWindowsPageWebElements = new MultipleWindowsPageWebElements(driver);

    public MultipleWindowsPageVerify(WebDriver driver) { super(driver);}

    public boolean isSecondTabOpened() {
        WaitUtility.WaitForTitleToBe("New Window");
        String newTabText = multipleWindowsPageWebElements.newTabText().getText();
        if (newTabText.equals("New Window")) {
            return true;
        } else {
            return false;
        }
    }
}
