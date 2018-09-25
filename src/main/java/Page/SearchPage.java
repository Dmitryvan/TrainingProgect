package Page;

import Settings.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Thread.sleep;


public class SearchPage extends Base {

    static WebDriver driver;
    static WebDriverWait wait;

    public SearchPage(WebDriver driver){this.driver = driver; }

    By wantToReadButtonLocator1 = By.cssSelector("#\\31 _book_34804524 > div:nth-child(1) > form:nth-child(1) > button:nth-child(13)");
    By wantToReadButtonLocator2 = By.cssSelector("#\\32 _book_6271941 > div:nth-child(1) > form:nth-child(1) > button:nth-child(13)");
    By wantToReadButtonLocator3 = By.cssSelector("#\\33 _book_26471006 > div:nth-child(1) > form:nth-child(1) > button:nth-child(13)");

    By dropDownListLocator1 = By.cssSelector("#\\31 _book_34804524 > div:nth-child(2) > button:nth-child(2)");
    By readInDropDownListLocator = By.cssSelector(".wtrExclusiveShelves > li:nth-child(1) > button:nth-child(1)");
    By dropDownListLocator2 = By.xpath("/html/body/div[2]/div[3]/div[1]/div[1]/div[2]/table/tbody/tr[2]/td[3]/div/div[2]/button");
    By dropDownListLocator3 = By.cssSelector("#\\33 _book_26471006 > div:nth-child(2) > button:nth-child(2)");
    By saveButtonLocator1 = By.cssSelector("#review_submit_for_34804524");
    By saveButtonLocator2 = By.cssSelector("#review_submit_for_6271941");
    By saveButtonLocator3 = By.cssSelector("#review_submit_for_26471006");

    By rate1Locator1 = By.cssSelector("#\\31 _book_34804524 > div:nth-child(3) > div:nth-child(4) > a:nth-child(1)");
    By rate3Locator3 = By.cssSelector("#\\32 _book_6271941 > div:nth-child(3) > div:nth-child(4) > a:nth-child(3)");
    By rate5Locator5 = By.cssSelector("#\\33 _book_26471006 > div:nth-child(3) > div:nth-child(4) > a:nth-child(5)");

    By reviewLocator1 = By.cssSelector("div.wtrPrompt:nth-child(3) > a:nth-child(1)"); // всплывающая Write a review
    By reviewLocator2 = By.cssSelector("#\\32 _book_6271941 > div:nth-child(1) > div:nth-child(3) > a:nth-child(1)");
    By reviewLocator3 = By.cssSelector("#\\33 _book_26471006 > div:nth-child(1) > div:nth-child(3) > a:nth-child(1)");

    By reviewFieldLocator = By.id("review_review_usertext");

    public void clickWantToReadButtons123 () {
        WebDriverWait wait = (new WebDriverWait(driver,10));
        driver.findElement(wantToReadButtonLocator1).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(wantToReadButtonLocator1));

        driver.findElement(wantToReadButtonLocator2).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(wantToReadButtonLocator2));

        driver.findElement(wantToReadButtonLocator3).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(wantToReadButtonLocator3));
    }

    private void clickRead () {
        driver.findElement(readInDropDownListLocator).click();
    }


    public void clickSaveButtonReadPopUp1 () {
        driver.findElement(saveButtonLocator1).click();
    }
    public void clickSaveButtonReadPopUp2 () {
        driver.findElement(saveButtonLocator2).click();
    }
    public void clickSaveButtonReadPopUp3 () {
        driver.findElement(saveButtonLocator3).click();
    }


    public void markReadInDropDownList1 () {
        driver.findElement(dropDownListLocator1).click();
        clickRead();
        clickSaveButtonReadPopUp1();
    }
    public void markReadInDropDownList2 () {
        driver.findElement(dropDownListLocator2).click();
        clickRead();
        clickSaveButtonReadPopUp2();
    }
    public void markReadInDropDownList3 () {
        driver.findElement(dropDownListLocator3).click();
        clickRead();
        clickSaveButtonReadPopUp3();
    }


    public void clickRate1 () {
        WebElement star = driver.findElement(rate1Locator1);
        Actions builder = new Actions(driver);
        wait = (new WebDriverWait(driver,5));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(rate1Locator1)));

        builder.moveToElement(star).click().perform();
    }
    public void clickRate3 () {
        WebElement star = driver.findElement(rate3Locator3);
        wait = (new WebDriverWait(driver,5));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(rate3Locator3)));

        Actions builder = new Actions(driver);
        builder.moveToElement(star).click().perform();
    }
    public void clickRate5 ()  {
        WebElement star = driver.findElement(rate5Locator5);
        wait = (new WebDriverWait(driver,5));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(rate5Locator5)));

        Actions builder = new Actions(driver);
        builder.moveToElement(star).click().perform();
    }


    public void setReview1 (String review ) throws InterruptedException {
        sleep (1000);
        WebElement rev = driver.findElement(reviewLocator1);
        rev.click(); //элемент есть, но еще не появился, поэтому не может кликнуть. Нужно добавить время ожидания появления элемента

        WebElement revfield = driver.findElement(reviewFieldLocator);
        revfield.click();
        revfield.sendKeys(review);
    }
    public void setReview2 (String review ) throws InterruptedException {
        sleep (1000);
        WebElement rev = driver.findElement(reviewLocator2);
        rev.click();
        WebElement revfield = driver.findElement(reviewFieldLocator);
        revfield.click();
        revfield.sendKeys(review);
    }
    public void setReview3 (String review ) throws InterruptedException {
        sleep (1000);
        WebElement rev = driver.findElement(reviewLocator3);
        rev.click();
        WebElement revfield = driver.findElement(reviewFieldLocator);
        revfield.click();
        revfield.sendKeys(review);
    }

}

