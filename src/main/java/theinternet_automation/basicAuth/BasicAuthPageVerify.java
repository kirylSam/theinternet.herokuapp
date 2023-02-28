package theinternet_automation.basicAuth;

import org.openqa.selenium.WebDriver;
import theinternet_automation.PageObject;

public class BasicAuthPageVerify extends PageObject {
    public BasicAuthPageVerify(WebDriver driver) { super(driver);}

    boolean areWeLoggedIn() {
        return(driver.getPageSource().contains("Congratulations! You must have the proper credentials."));
    }
}
