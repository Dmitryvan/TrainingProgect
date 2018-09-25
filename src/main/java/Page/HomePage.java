package Page;


import Settings.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends Base {

    private WebDriver driver;

    public HomePage(WebDriver driver){this.driver = driver; }

    By nameFieldRegLocator = By.id("user_first_name");
    By emailFieldRegLocator = By.id("user_email");
    By passwordFieldRegLocator = By.id("user_password_signup");
    By xIconGenresWindowLocator = By.cssSelector("div.modal__content:nth-child(1) > div:nth-child(1) > button:nth-child(1)");
    By profileIconLocator = By.cssSelector(".dropdown__trigger--profileMenu > span:nth-child(1) > img:nth-child(1)");
    By profileSignOutLocator = By.cssSelector("div.siteHeader__subNav > ul:nth-child(2) > li:nth-child(13) > a:nth-child(1)");
    By goodreadsLabelLocator = By.cssSelector(".siteHeader__logo");
    By goodreadsHomeInscriptionLocator = By.cssSelector("#choices > p:nth-child(1) > a");
    By signUpButtonLocator = By.cssSelector(".button");

    By emailFieldLoginLocator = By.id("userSignInFormEmail");
    By passwordFieldLoginLocator = By.id("user_password");
    By loginButtonLocator = By.cssSelector("input.gr-button");
    By signInButtonLocator = By.cssSelector("input.gr-button");

    By pageTitlelocator = By.cssSelector(".column_right > h1:nth-child(1)");

    By bookTitleFieldLocator = By.cssSelector(".searchBox__input--navbar");
    By searchIconLocator = By.cssSelector(".searchBox__icon--navbar");
//    By searchResultLocator = By.cssSelector(".searchSubNavContainer");


    public void inputName(String name) {
        WebElement register = driver.findElement(nameFieldRegLocator);
        register.click();
        register.sendKeys(name);
    }

    public void inputEmail(String email){
        WebElement register = driver.findElement(emailFieldRegLocator);
        register.click();
        register.sendKeys(email);
    }

    public void inputPassword(String password){
        WebElement register = driver.findElement(passwordFieldRegLocator);
        register.click();
        register.sendKeys(password);
    }

    public void clickSignUpButton (){
        driver.findElement(signUpButtonLocator).click();
    }

    public void clickXiconGenresPopUp() {
        driver.findElement(xIconGenresWindowLocator).click();
    }

    public void clickGoodreadsLabel() {
        driver.findElement(goodreadsLabelLocator).click();
    }

    public void clickSignOut() {
        driver.findElement(profileIconLocator).click();    //click Profile icon
        driver.findElement(profileSignOutLocator).click(); //click SignOut
    }

    public void clickGoodreadsHomeInscription() {
        driver.findElement(goodreadsHomeInscriptionLocator).click();
    }

    public void registrationSite (String userName, String userEmail, String userPassword) {
        inputName(userName);
        inputEmail(userEmail);
        inputPassword(userPassword);
        clickSignUpButton();
    }


    public void inputEmailLogin (String email){
        WebElement login = driver.findElement(emailFieldLoginLocator);
        login.click();
        login.sendKeys(email);
    }

    public void inputPasswordLogin(String password) {
        WebElement login = driver.findElement(passwordFieldLoginLocator);
        login.click();
        login.sendKeys(password);
    }

    public void clickLoginButton (){
        driver.findElement(loginButtonLocator).click();
    }
    public void clickSignInButton (){
        driver.findElement(signInButtonLocator).click();
    }

    public void loginSite(String userEmail, String userPassword) {
        inputEmailLogin(userEmail);
        inputPasswordLogin(userPassword);
        clickLoginButton();
    }


    public void inputBookTitle (String bookTitle) {
        WebElement title = driver.findElement(bookTitleFieldLocator);
        title.click();
        title.sendKeys(bookTitle);
    }

    public void clickSearchIcon (){
        driver.findElement(searchIconLocator).click();
    }

    public void bookSearch(String userBookTitle) {
        inputBookTitle(userBookTitle);
        clickSearchIcon();
    }
}

