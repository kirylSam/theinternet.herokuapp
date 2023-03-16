package theinternet_automation.basicAuth;

import lombok.Getter;
import lombok.experimental.Accessors;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import theinternet_automation.PageObject;

@Getter
@Accessors(fluent = true)
public class BasicAuthPageWebElements extends PageObject {

    public BasicAuthPageWebElements(WebDriver driver) { super(driver);}

    @FindBy(css = "p")
    private WebElement congratulationsLabel;
}
