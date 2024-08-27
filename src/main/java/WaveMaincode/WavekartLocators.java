package WaveMaincode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WavekartLocators {
    WebDriver driver;

    public WavekartLocators(WebDriver driver) {
        this.driver = driver;
    }

    public static final By PhoneImage = By.xpath("//div[@widget-id='widget-id108']");

    public static final By AllProducts = By.xpath("//li[@name='list_services']/a");
    public static final By HighToLow = By.xpath("//a[@title='Price - High to Low']");
    public static final By CamOneItem = By.xpath("//div[contains(@class,'active')]//p[text()='Nikon D7100 SLR']");
    public static final By AddToCard = By.xpath("//button[@name='AddToCart']");
    public static final By PlaceOrder = By.xpath("//span[text()='Place Order']");
    public static final By Continue = By.xpath("//span[text()='Continue']");
    public static final By NetBanking = By.xpath("//span[text()='Net Banking']");
    public static final By BankDropDown = By.xpath("//select[@name='select4']");
    public static final By ConformOrder = By.xpath("//i[@class='app-icon wm-sl-l sl-check']");
    public static final By MyProfileIcon = By.xpath("//span[text()='My Profile']");
    public static final By EditDetailsIcon = By.xpath("//button[@name='edit']");
    public static final By Passwordtextbox = By.xpath("//input[@name='password_formWidget']");
    public static final By CancelIcon = By.xpath("//i[@class='app-icon wi wi-cancel']");
    public static final By OutOfStock = By.xpath("//span[@class='caption']");
   // window.scrollBy(500,500);
   public static final By Logout = By.xpath("//a[@name='Logout']");
   public static final By Login = By.xpath("//i[@class='app-icon glyphicon glyphicon-log-in']");
    public static final By UserName = By.xpath("//input[@placeholder='Enter Username']");
    public static final By Password = By.xpath("//input[@placeholder='Enter Password']");
    public static final By SignIn = By.xpath("//button[@caption='Sign in']");

    public static final By LoadMoreProperties = By.xpath("//*[contains(text(),'Load More Products')]");


}

