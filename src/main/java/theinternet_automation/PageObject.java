package theinternet_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
    protected static WebDriver driver;

    //this constructor initializes all elements from its child class
    public PageObject(WebDriver driver) {
        PageObject.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
