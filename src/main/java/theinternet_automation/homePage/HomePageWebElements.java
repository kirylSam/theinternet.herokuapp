package theinternet_automation.homePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import theinternet_automation.PageObject;
import lombok.Getter;
import lombok.experimental.Accessors;

import org.openqa.selenium.support.FindBy;

@Getter
@Accessors(fluent = true)
public class HomePageWebElements extends PageObject{
    public HomePageWebElements(WebDriver driver) { super(driver);}

    @FindBy(css = ".heading")
    private WebElement pageHeading;

}
