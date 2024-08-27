package PageObjectModel;

import WaveMaincode.WavekartActions;
import WaveMaincode.WavekartLocators;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.testng.annotations.Test;

public class TestCase2 {
    WavekartLocators locators;
    WebDriver driver;

    WavekartActions wavekartActions;
    private static final Logger logger = LogManager.getLogger(TestCase2.class);

    //private static final Logger logger=LogManager.getLogManager().getLogger(TestCase2.class);


    @BeforeClass
    public void setup() {
        logger.info("Starting TestCase2");
        try {
            System.setProperty("webdriver.chrome.driver", "C:/Users/pavanim_500367/Downloads/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
            driver.get("https://stage-studio.wavemakeronline.com/run-8ksvqqr0tf/ent12665b0f3b39/WaveKart_master/#/Main");
//        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(50));
            wavekartActions = new WavekartActions(driver);
            try {

                Assert.assertEquals("Wavekart", "orangeHRM");
            }
            finally {
                driver.quit();
            }
        } catch (WebDriverException e) {
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
        try {

            //  Thread.sleep(5000);
            wavekartActions.Login();
            //  Thread.sleep(2000);
            wavekartActions.setUsername("user");
            wavekartActions.setPassword("user");
            wavekartActions.SignIn();
        } catch (Exception e) {
            logger.error("Failed to Execute Logout sceanrio.", e);
        }
    }

    @Test
    public void editprofile() throws InterruptedException {
        //  WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));

        try {
            wavekartActions.MyProfileIcon();

            wavekartActions.EditDetailsIcon();

            wavekartActions.Passwordtextbox("enter");
            // Thread.sleep(2000);
            wavekartActions.CancelIcon();
        } catch (NoSuchElementException e) {
            // Handle the exception
            System.out.println("NoSuchElementException occurred: " + e.getMessage());
        }
    }

    @AfterMethod
    public void Logout() throws InterruptedException {
        try {

            wavekartActions.Logout();
        } catch (Exception e) {
            logger.error("Failed to Execute Logout sceanrio.", e);
        }
    }

    @AfterClass
    public void teardown() {
        // Clean up after test
        try {
            // Perform any additional cleanup or logging here if necessary
        } finally {
            // Ensure the browser is quit regardless of test success or failure
            if (driver != null) {
                driver.quit();
            }
        }
    }


}
