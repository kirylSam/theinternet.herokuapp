package theinternet_automation.floatingMenu;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import theinternet_automation.PageObject;
import theinternet_automation.utilities.WaitUtility;

import static org.testng.AssertJUnit.assertTrue;

public class FloatingMenuPageAct extends PageObject {

    FloatingMenuPageWebElements floatingMenuPageWebElements = new FloatingMenuPageWebElements(driver);
    FloatingMenuPageVerify floatingMenuPageVerify = new FloatingMenuPageVerify(driver);

    public FloatingMenuPageAct(WebDriver driver) { super(driver);}

    public FloatingMenuPageAct openFloatingMenuPage() {
        driver.navigate().to("https://the-internet.herokuapp.com/floating_menu");
        return this;
    }

    public FloatingMenuPageAct scrollDownToPageFooter() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", floatingMenuPageWebElements.pageFooter());
        return this;
    }

    public FloatingMenuPageAct clickAboutButtonInFloatingMenu() {
        WaitUtility.WaitForVisibilityOf(floatingMenuPageWebElements.aboutFloatingButton());
        floatingMenuPageWebElements.aboutFloatingButton().click();
        return this;
    }

    public FloatingMenuPageAct checkIfCurrentURLHasAbout() {
        assertTrue(floatingMenuPageVerify.isAboutAddedToURL());
        return this;
    }
}
