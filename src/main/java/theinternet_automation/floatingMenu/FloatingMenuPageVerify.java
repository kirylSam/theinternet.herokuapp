package theinternet_automation.floatingMenu;

import org.openqa.selenium.WebDriver;
import theinternet_automation.PageObject;

public class FloatingMenuPageVerify extends PageObject {

    public FloatingMenuPageVerify(WebDriver driver) { super(driver);}

    boolean isAboutAddedToURL() {
        String currentURL = driverThread.get().getCurrentUrl();

        if (currentURL.equals("https://the-internet.herokuapp.com/floating_menu#about")) {
            return true;
        } else {
            return false;
        }
    }
}
