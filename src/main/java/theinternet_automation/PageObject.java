package theinternet_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
    protected static final ThreadLocal<WebDriver> driverThread = new ThreadLocal<>();

    public PageObject(WebDriver driver) {
        PageObject.driverThread.set(driver);
        PageFactory.initElements(PageObject.driverThread.get(), this);
    }
}
