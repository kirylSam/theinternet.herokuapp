package theinternet_automation.initialization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ThreadGuard;

public final class DriverFactory {

    private DriverFactory() {
        //defeat instantiation - we need only one instance of this class
    }

    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return driver.get();
    }
    public static void setupWebDriver(String selectedBrowser) {
        driver.set(createBrowserInstance(selectedBrowser));
    }

    public static void closeBrowser() {
        driver.get().quit();
        driver.remove();
    }

    private static WebDriver createBrowserInstance(String browser) {
        switch (browser.toLowerCase()) {
            case "chrome":
                return ThreadGuard.protect(new ChromeDriver());
                //return new ChromeDriver();
            case "firefox":
                return ThreadGuard.protect(new FirefoxDriver());
                //return new FirefoxDriver();
            default:
                throw new IllegalArgumentException("Browser [" + browser + "] is NOT supported");
        }
    }
}