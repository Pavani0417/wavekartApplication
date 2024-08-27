package PageObjectModel;

import WaveMaincode.WavekartActions;
import WaveMaincode.WavekartLocators;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class TestCase1 {
    WavekartLocators locators;
    WebDriver driver;
    WavekartActions wavekartActions;
    private static final Logger logger = LogManager.getLogger(TestCase2.class);

    @BeforeClass
    public void setup() {
        logger.info("Starting TestCase1");
        try {


            System.setProperty("webdriver.chrome.driver", "C:/Users/pavanim_500367/Downloads/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
            driver.get("https://stage-studio.wavemakeronline.com/run-8ksvqqr0tf/ent12665b0f3b39/WaveKart_master/#/Main");
//        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(50));
            wavekartActions = new WavekartActions(driver);
        }
        catch (WebDriverException e) {
            System.out.println("WebDriverException occurred: " + e.getMessage());
        }
    }

//    @BeforeClass
//    public void setup() {
//        WebDriver driver = BrowserLaunch.createBrowser();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.manage().window().maximize();
//        driver.get("https://stage-studio.wavemakeronline.com/run-8ksvqqr0tf/ent12665b0f3b39/WaveKart_master/#/Main");
//        wavekartActions = new WavekartActions(driver);
//    }

    @BeforeMethod
    public void Login() throws InterruptedException {
        //  Thread.sleep(5000);
        wavekartActions.Login();
        //  Thread.sleep(2000);
        wavekartActions.setUsername("user");
        wavekartActions.setPassword("user");
        wavekartActions.SignIn();
    }

    @Test
    public void AddToCard() throws InterruptedException {
        try {


            Thread.sleep(2000);
            WebElement ele = wavekartActions.AllProdutcs();
            ele.click();

            // Thread.sleep(1000);
            wavekartActions.HighToLow();

            wavekartActions.OneItem();

            wavekartActions.AddToCard();

            wavekartActions.PlaceOrder();

            wavekartActions.Continue();
            // Thread.sleep(1000);
            wavekartActions.Continue();

            wavekartActions.NetBanking();

            wavekartActions.BankDropDown();

            wavekartActions.Continue();

            wavekartActions.ConformOrder();
        } catch (NoSuchElementException e) {
            // Handle the exception
            System.out.println("NoSuchElementException occurred: " + e.getMessage());
        }
    }

    @AfterMethod
    public void Logout() throws InterruptedException {
        //Thread.sleep(2000);
        wavekartActions.Logout();

    }

    @AfterClass
    public void teardown() {
        // Clean up after test
        if (driver != null) {
            driver.quit();
        }
    }

}
