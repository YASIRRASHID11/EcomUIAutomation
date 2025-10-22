package tests;
import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;
import org.testng.annotations.*;
import utils.ConfigLoader;

// Test code moved to src/test/java/tests/HomeTest.java where TestNG is available (test scope).
public class HomeTest extends BaseTest {

    @Test
    public void testHomePageNavigation() {
        WebDriver driver=getChromeDriver();
        driver.get(ConfigLoader.getAppUrl());
        HomePage homePage = new HomePage(driver);
        homePage.clickHome();
        // Add assertions in the test folder version
    }
}
