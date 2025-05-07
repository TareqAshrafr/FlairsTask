package Helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;


public class Driver {
    private static WebDriver driver;

    private static ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-certificates-errors");
        return options;
    }

    public static void startChromeDriver(String targetUrl, String driverPath) {
        System.setProperty("webdriver.chrome.driver", driverPath);
        if (driver == null) {
            ChromeOptions options = getChromeOptions();
            driver = new ChromeDriver(ChromeDriverService.createDefaultService(), options);
            driver.get(targetUrl);
            driver.manage().window().maximize();
        }

    }

    public static void closeDriver() {
        driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }

}
