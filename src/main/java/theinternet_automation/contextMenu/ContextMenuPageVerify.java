package theinternet_automation.contextMenu;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import theinternet_automation.PageObject;

import java.time.Duration;

public class ContextMenuPageVerify extends PageObject {

    public ContextMenuPageVerify(WebDriver driver) { super(driver);}

    boolean isJSAlertTriggered() {
        WebDriverWait wait = new WebDriverWait(driverThread.get(), Duration.ofSeconds(2));
        try {
            wait.until(ExpectedConditions.alertIsPresent());
            String alertText = driverThread.get().switchTo().alert().getText();
            if (alertText.equals("You selected a context menu")) {
                return true;
            } else {
                return false;
            }
        } catch (TimeoutException e) {
            System.out.println("[EXCEPTION] ContextMenuPage Alert exception");
            return false;
        }
    }
}
