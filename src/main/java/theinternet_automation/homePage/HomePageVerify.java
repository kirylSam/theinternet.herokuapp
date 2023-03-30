package theinternet_automation.homePage;

import org.openqa.selenium.WebDriver;
import theinternet_automation.PageObject;

public class HomePageVerify extends PageObject{
    public HomePageVerify(WebDriver driver) { super(driver);}

    private final HomePageWebElements homePageWebElements = new HomePageWebElements(driverThread.get());

    boolean isHomePageOpened() {
        String pageHeading = "";
        pageHeading = homePageWebElements.pageHeading().getText();
        if (pageHeading.equals("Welcome to the-internet")) {
            System.out.printf(pageHeading);
            return true;
        } else {
            System.out.printf(pageHeading);
            return false;
        }
    }
}
