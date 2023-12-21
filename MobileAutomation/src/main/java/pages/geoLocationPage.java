package pages;

import helper.WaitHelper;
import io.appium.java_client.MobileElement;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class geoLocationPage {

    private AppiumDriver<MobileElement> driver;
    private Properties locators;

    public geoLocationPage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        this.locators = new Properties();
        try {
            locators.load(new FileInputStream("C:\\Users\\ASUS\\Documents\\Automation\\MobileAutomation\\MobileAutomation\\resources\\locators\\locators.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void clickOnGeoLocationButton() {
        MobileElement geoLocationButton = driver.findElementById(locators.getProperty("geoLocationButton"));
        geoLocationButton.click();
    }
    public boolean verifyFindButtonDisplayed() {
        WaitHelper waitHelper = new WaitHelper(driver);
        MobileElement findButton = driver.findElementById(locators.getProperty("findButton"));
        MobileElement visibleGoogleLogo  = waitHelper.waitForElementVisible(findButton, 10);
        return visibleGoogleLogo.isDisplayed();
    }
    public void enterUrlFromTestData(String url) {
        MobileElement editUrlText = driver.findElementById(locators.getProperty("urlInput"));
        editUrlText.clear();
        editUrlText.sendKeys(url);
    }
    public void clickFindButton() {
        MobileElement findButton = driver.findElementById(locators.getProperty("findButton"));
        findButton.click();
    }
    public boolean assertGoogleLogoDisplayed() {
        WaitHelper waitHelper = new WaitHelper(driver);
        By googleLogo = By.xpath(locators.getProperty("googleLogo"));
        MobileElement visibleGoogleLogo  = waitHelper.waitForElementPresence(googleLogo, 10);
        return visibleGoogleLogo.isDisplayed();
    }
}
