package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Helpers.Driver;

import java.time.Duration;

public class PageObject {

    private static final Duration MAXIMUM = Duration.ofSeconds(40);
    public static WebDriver driver;
    public WebDriverWait wait;
    public PageObject() {
        driver = Driver.getDriver();
        wait = new WebDriverWait(driver, MAXIMUM);
    }

    public String getText(By element) {
        WebElement webElement = wait.until(ExpectedConditions.presenceOfElementLocated(element));
        return webElement.getText();
    }

    public void click(By element) {
        WebElement webElement = wait.until(ExpectedConditions.elementToBeClickable(element));
        webElement.click();
    }

    public void clickAndWaitForInvisibility(By element) {
        WebElement webElement = wait.until(ExpectedConditions.elementToBeClickable(element));
        webElement.click();
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }

    public void setText(By element, String text) {
        WebElement webElement = wait.until(ExpectedConditions.presenceOfElementLocated(element));
        webElement.clear();
        webElement.sendKeys(text);
    }
}
