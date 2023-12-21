package core;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseTest {

    private Properties config;
    public BaseTest() {
        this.config = new Properties();
        try {
            config.load(new FileInputStream("C:\\Users\\ASUS\\Documents\\Automation\\MobileAutomation\\MobileAutomation\\config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected AppiumDriver<MobileElement> initDriver() throws MalformedURLException {
        // Set up the desired capabilities
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, config.getProperty("platformName"));
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, config.getProperty("platformVersion"));
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, config.getProperty("deviceName"));
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, config.getProperty("automationName"));
        desiredCapabilities.setCapability(MobileCapabilityType.APP, config.getProperty("app"));

        // Create the driver
        return new AppiumDriver<>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);

    }


}

