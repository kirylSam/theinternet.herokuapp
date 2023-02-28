package theinternet_automation.formAuthPageTest;

import org.testng.annotations.Test;
import theinternet_automation.floatingMenu.FloatingMenuPageAct;
import theinternet_automation.formAuthentication.FormAuthPageAct;
import theinternet_automation.initialization.BaseClass;
import theinternet_automation.initialization.DriverFactory;

public class FormAuthPageTest extends BaseClass {
    @Test
    public void checkFormAuthPage() {
        FormAuthPageAct formAuthPageAct = new FormAuthPageAct(DriverFactory.getDriver());
        formAuthPageAct
                .openFormAuthPage()
                .enterCorrectEmailAndPassword()
                .checkIfLoggedIntoSecureArea()
                .logoutFromSecureArea()
                .enterIncorrectEmailAndPassword()
                .checkIfLoginErrorMessageIsShown();
    }
}
