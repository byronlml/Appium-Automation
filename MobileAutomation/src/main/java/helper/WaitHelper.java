package helper;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {

    private final WebDriver driver;

    public WaitHelper(WebDriver driver) {
        this.driver = driver;
    }

    public MobileElement waitForElementVisible(MobileElement element, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        return (MobileElement) wait.until(ExpectedConditions.visibilityOf(element));
    }
    public MobileElement waitForElementPresence(By locator, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        return (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }
}
