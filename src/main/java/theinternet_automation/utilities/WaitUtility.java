package theinternet_automation.utilities;

import theinternet_automation.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.invisibilityOf;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class WaitUtility extends PageObject {

    public WaitUtility(WebDriver driver) {
        super(driver);
    }
    public static final Duration duration = Duration.ofSeconds(60);
    public static final WebDriverWait wait = new WebDriverWait(driver, duration);

    public static Boolean WaitForInvisibilityOf(WebElement element) {
        return wait.until(invisibilityOf(element));
    }

    public static WebElement WaitForVisibilityOf(WebElement element) {
        return wait.until(visibilityOf(element));
    }

    public static WebElement WaitForElementToBeClickable(WebElement element) {
        return wait.until(elementToBeClickable(element));
    }
}