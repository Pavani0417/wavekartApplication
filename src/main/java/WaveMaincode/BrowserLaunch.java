package WaveMaincode;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

//
public class BrowserLaunch
{
    public static WebDriver createBrowser() {
//        ChromeDriver driver=new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();

   }
}
