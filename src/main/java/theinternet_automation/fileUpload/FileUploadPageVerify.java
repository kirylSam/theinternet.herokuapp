package theinternet_automation.fileUpload;

import org.openqa.selenium.WebDriver;
import theinternet_automation.PageObject;

public class FileUploadPageVerify extends PageObject {

    String fileName = "img.jpg";
    FileUploadPageWebElements fileUploadPageWebElements = new FileUploadPageWebElements(driverThread.get());

    public FileUploadPageVerify(WebDriver driver) { super(driver);}

    boolean isFileNameVisibleInUploadedFiles() {
        String uploadedFileName = fileUploadPageWebElements.uploadedFilesInfo().getText();

        if (uploadedFileName.equals(fileName)) {
            return true;
        } else {
            return false;
        }
    }
}
