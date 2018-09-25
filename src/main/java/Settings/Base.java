package Settings;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Base {

    protected static WebDriver driver;

    protected static String userName = "Dima";
    protected static String userEmail = "van77dim@gmail.com";
    protected static String userPassword = "0679982026Dfyby";
    protected static String invalidUserPassword = "679982026Dfyby";

    protected static String userBookTitle = "Best crime and mystery books";
    protected static String userReview1 = "Bad book!";
    protected static String userReview2 = "Good book!";
    protected static String userReview3 = "Very interesting, Great book!";


    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.goodreads.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

//    @After
//    public void tearDown(){
//        driver. close();
//    }
}
