package theinternet_automation.addRemoveElements;

import lombok.Getter;
import lombok.experimental.Accessors;
import org.openqa.selenium.WebDriver;
import theinternet_automation.PageObject;

@Getter
@Accessors(fluent = true)
public class AddRemoveElementsPageVerify extends PageObject {

    AddRemoveElementsPageWebElements addRemoveElementsPageWebElements = new AddRemoveElementsPageWebElements(driverThread.get());

    public AddRemoveElementsPageVerify(WebDriver driver) {super(driver);}

    boolean isElementAdded() {return true;}

    boolean isElementDeleted() {return true;}
}
