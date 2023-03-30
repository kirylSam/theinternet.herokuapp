package theinternet_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
    //TO DO threadsafe
    //protected static WebDriver driver;
    protected static final ThreadLocal<WebDriver> driverThread = new ThreadLocal<>();


    //this constructor initializes all elements from its child class
    public PageObject(WebDriver driver) {
        PageObject.driverThread.set(driver);
        //PageObject.driver = driver;
        PageFactory.initElements(PageObject.driverThread.get(), this);
    }
}
