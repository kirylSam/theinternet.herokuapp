package theinternet_automation.multipleWindows;

import org.openqa.selenium.WebDriver;
import theinternet_automation.PageObject;
import theinternet_automation.utilities.WaitUtility;

import static org.testng.AssertJUnit.assertTrue;

public class MultipleWindowsPageAct extends PageObject {

    MultipleWindowsPageVerify multipleWindowsPageVerify = new MultipleWindowsPageVerify(driver);
    MultipleWindowsPageWebElements multipleWindowsPageWebElements = new MultipleWindowsPageWebElements(driver);

    String originalWindow;

    //Constructor
    public MultipleWindowsPageAct(WebDriver driver) {
        super(driver);
    }

    public MultipleWindowsPageAct openMultipleWindowsPage() {
        driver.navigate().to("https://the-internet.herokuapp.com/windows");
        return this;
    }

    public MultipleWindowsPageAct clickOnNewTabLink() {
        originalWindow = driver.getWindowHandle();
        multipleWindowsPageWebElements.newTabLink().click();
        return this;
    }


    public MultipleWindowsPageAct checkIfANewTabIsOpened() {
        WaitUtility.WaitForASecondWindowToBeOpened();
        //Checking if currently opened window is a newly opened window
        //If it's not - then switches to it
        for (String windowHandle : driver.getWindowHandles()) {
            if(!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        assertTrue(multipleWindowsPageVerify.isSecondTabOpened());
        return this;
    }
}
