package theinternet_automation.formAuthentication;

import org.openqa.selenium.WebDriver;
import theinternet_automation.PageObject;

public class FormAuthPageVerify extends PageObject {
    FormAuthPageWebElements formAuthPageWebElements = new FormAuthPageWebElements(driver);

    public FormAuthPageVerify(WebDriver driver) { super(driver);}

    boolean isSecureAreaOpened() {
        String currentURL = driver.getCurrentUrl();
        if (currentURL.equals("https://the-internet.herokuapp.com/secure") && driver.getPageSource().contains("Welcome to the Secure Area.")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isLoginErrorMessageShown() {
        return formAuthPageWebElements.errorMessage().isDisplayed();
    }
}
