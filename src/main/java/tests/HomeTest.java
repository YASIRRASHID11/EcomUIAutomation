package tests;
import pageObjects.HomePage;
import org.testng.annotations.*;

// Test code moved to src/test/java/tests/HomeTest.java where TestNG is available (test scope).
public class HomeTest {

    @Test
    public void testHomePageNavigation() {
        HomePage homePage = new HomePage();
        homePage.clickHome();
        // Add assertions in the test folder version
    }
}
