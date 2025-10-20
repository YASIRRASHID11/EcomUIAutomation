package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    @FindBy(xpath = "//a[contains(text(),'Home')]")
    private WebElement homeLink;

    @FindBy(xpath = "//a[@class='nav-link' and @data-target='#exampleModal']")
    private WebElement contactLink;

    @FindBy(xpath = "//a[@class='nav-link' and @data-target='#videoModal']")
    private WebElement aboutUsLink;

    @FindBy(xpath = "//a[@class='nav-link' and @href='cart.html']\n")
    private WebElement cartLink;

    @FindBy(xpath = "//a[@class='nav-link' and @id='login2' and @href='#' and @data-toggle='modal' and @data-target='#logInModal']")
    private WebElement loginLink;

    @FindBy(xpath = "//a[@class='nav-link' and @id='logout2' and @href='#' and @onclick='logOut()']")
    private WebElement logoutLink;

    @FindBy(xpath = "//a[@class='nav-link' and @href='#' and @id='nameofuser' and @style='display:none']")
    private WebElement welcomeUserLink;

    @FindBy(xpath = "//a[@class='nav-link' and @id='signin2' and @href='#' and @data-toggle='modal' and @data-target='#signInModal']")
    private WebElement signupLink;

    public void clickHome() {
        homeLink.click();
    }

    public void clickContact() {
        contactLink.click();
    }
    public void clickAboutUs() {
        aboutUsLink.click();
    }
    public void clickCart() {
        cartLink.click();
    }
    public void clickLogin() {
        loginLink.click();
    }
    public void clickLogout() {
        logoutLink.click();
    }
    public void clickSignup() {
        signupLink.click();
    }
}
