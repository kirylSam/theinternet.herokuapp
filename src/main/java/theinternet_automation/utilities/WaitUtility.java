package theinternet_automation.utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import theinternet_automation.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class WaitUtility extends PageObject {

    public WaitUtility(WebDriver driver) {
        super(driver);
    }
    public static final Duration duration = Duration.ofSeconds(60);
    public static final WebDriverWait wait = new WebDriverWait(driver, duration);

    public static WebElement WaitForVisibilityOf(WebElement element) {
        return wait.until(visibilityOf(element));
    }

    public static Alert WaitForAlertToBeDisplayed() {
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        return alert;
    }

    public static void WaitForASecondWindowToBeOpened() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
    }

    public static void WaitForTitleToBe(String expectedTitle) {
        wait.until(titleIs(expectedTitle));
    }
}