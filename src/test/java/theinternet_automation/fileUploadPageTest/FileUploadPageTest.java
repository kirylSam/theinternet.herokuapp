package theinternet_automation.fileUploadPageTest;

import org.testng.annotations.Test;
import theinternet_automation.fileUpload.FileUploadPageAct;
import theinternet_automation.initialization.BaseClass;
import theinternet_automation.initialization.DriverFactory;

public class FileUploadPageTest extends BaseClass {
    @Test
    public void checkFileUploadPage() {
        FileUploadPageAct fileUploadPageAct = new FileUploadPageAct(DriverFactory.getDriver());
        fileUploadPageAct
                .openFileUploadPage()
                .uploadFileBySendingFilePath()
                .checkIfFileIsUploaded();
    }
}
