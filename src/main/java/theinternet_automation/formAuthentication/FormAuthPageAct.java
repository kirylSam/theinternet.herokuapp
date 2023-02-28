package theinternet_automation.formAuthentication;

import org.openqa.selenium.WebDriver;
import theinternet_automation.PageObject;
import theinternet_automation.utilities.WaitUtility;

import static org.testng.AssertJUnit.assertTrue;

public class FormAuthPageAct extends PageObject {

    FormAuthPageWebElements formAuthPageWebElements = new FormAuthPageWebElements(driver);
    FormAuthPageVerify formAuthPageVerify = new FormAuthPageVerify(driver);

    public FormAuthPageAct(WebDriver driver) { super(driver);}

    public FormAuthPageAct openFormAuthPage() {
        driver.navigate().to("https://the-internet.herokuapp.com/login");
        return this;
    }

    public FormAuthPageAct enterCorrectEmailAndPassword() {
        formAuthPageWebElements.usernameInputField().sendKeys("tomsmith");
        formAuthPageWebElements.passwordInputField().sendKeys("SuperSecretPassword!");
        formAuthPageWebElements.loginButton().click();
        return this;
    }

    public FormAuthPageAct checkIfLoggedIntoSecureArea() {
        WaitUtility.WaitForVisibilityOf(formAuthPageWebElements.secureAreaHeader());
        assertTrue(formAuthPageVerify.isSecureAreaOpened());
        return this;
    }

    public FormAuthPageAct logoutFromSecureArea() {
        formAuthPageWebElements.logoutButton().click();
        return this;
    }

    public FormAuthPageAct enterIncorrectEmailAndPassword(){
        WaitUtility.WaitForVisibilityOf(formAuthPageWebElements.loginButton());
        formAuthPageWebElements.usernameInputField().sendKeys("Wrong");
        formAuthPageWebElements.passwordInputField().sendKeys("Wrong");
        formAuthPageWebElements.loginButton().click();
        return this;
    }

    public FormAuthPageAct checkIfLoginErrorMessageIsShown(){
        WaitUtility.WaitForVisibilityOf(formAuthPageWebElements.loginButton());
        assertTrue(formAuthPageVerify.isLoginErrorMessageShown());
        return this;
    }
}
