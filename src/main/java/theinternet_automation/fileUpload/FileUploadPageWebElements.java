package theinternet_automation.fileUpload;

import lombok.Getter;
import lombok.experimental.Accessors;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import theinternet_automation.PageObject;

@Getter
@Accessors(fluent = true)
public class FileUploadPageWebElements extends PageObject {

    public FileUploadPageWebElements(WebDriver driver) { super(driver);}

    @FindBy(css = "input#file-upload")
    private WebElement uploadField;

    @FindBy(css = "input#file-submit")
    private WebElement uploadButton;

    @FindBy(css = "h3")
    private WebElement successPageHeader;

    @FindBy(css = "#uploaded-files")
    private WebElement uploadedFilesInfo;
}
