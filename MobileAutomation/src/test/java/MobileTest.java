import core.BaseTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.json.simple.parser.ParseException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.geoLocationPage;
import utils.JsonReader;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.io.IOException;

public class MobileTest extends BaseTest {

    private AppiumDriver<MobileElement> driver;

    public MobileTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        try {
            driver = initDriver();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testGeoLocation() throws IOException, ParseException {
        geoLocationPage geolocationPage = new geoLocationPage(driver);

        // Click on the geolocation button
        geolocationPage.clickOnGeoLocationButton();

        // Verify that the find button is displayed
        Assert.assertTrue(geolocationPage.verifyFindButtonDisplayed(), "Find button is displayed");

        // Enter a URL (assuming JsonReader is accessible from BaseTest)
        geolocationPage.enterUrlFromTestData(JsonReader.getTestData("url"));

        // Click on the find button
        geolocationPage.clickFindButton();

        // Verify that the Google logo is displayed
        Assert.assertTrue(geolocationPage.assertGoogleLogoDisplayed(), "Google logo is displayed");
    }

    @AfterMethod
    public void tearDown() {
        // Close the driver
        if (driver != null) {
            driver.quit();
        }
    }
}
