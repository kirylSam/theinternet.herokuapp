package theinternet_automation.initialization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

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
        return switch (browser.toLowerCase()) {
            case "chrome" -> {
                ChromeOptions optionsChrome = new ChromeOptions();
                optionsChrome.addArguments("--headless=new");
                yield new ChromeDriver(optionsChrome);
            }
            case "firefox" -> {
                FirefoxOptions optionsFirefox = new FirefoxOptions();
                optionsFirefox.addArguments("-headless");
                yield new FirefoxDriver(optionsFirefox);
            }
            default -> throw new IllegalArgumentException("Browser [" + browser + "] is NOT supported");
        };
    }
}