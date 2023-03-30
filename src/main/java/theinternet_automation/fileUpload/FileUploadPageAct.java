package theinternet_automation.fileUpload;

import org.openqa.selenium.WebDriver;
import theinternet_automation.PageObject;
import theinternet_automation.utilities.WaitUtility;

import static org.testng.AssertJUnit.assertTrue;

public class FileUploadPageAct extends PageObject {

    //Path to the file for uploading
    String filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\fileUpload\\img.jpg";

    FileUploadPageWebElements fileUploadPageWebElements = new FileUploadPageWebElements(driverThread.get());
    FileUploadPageVerify fileUploadPageVerify = new FileUploadPageVerify(driverThread.get());

    public FileUploadPageAct(WebDriver driver) { super(driver);}

    public FileUploadPageAct openFileUploadPage() {
        driverThread.get().navigate().to("https://the-internet.herokuapp.com/upload");
        return this;
    }

    public FileUploadPageAct uploadFileBySendingFilePath() {
        fileUploadPageWebElements.uploadField().sendKeys(filePath);
        fileUploadPageWebElements.uploadButton().click();
        return this;
    }

    public FileUploadPageAct checkIfFileIsUploaded() {
        WaitUtility.WaitForVisibilityOf(fileUploadPageWebElements.successPageHeader());
        assertTrue(fileUploadPageVerify.isFileNameVisibleInUploadedFiles());
        return this;
    }
}
