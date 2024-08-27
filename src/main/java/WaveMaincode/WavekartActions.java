package WaveMaincode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WavekartActions {

    WavekartLocators locators;
       WebDriver driver;

    public WavekartActions(WebDriver driver) {
        this.driver = driver;
    }
    // Constructor to initialize WebDriver
//    public WavekartActions(WebDriver driver) {
//        this.driver = driver;
//        locators = new WavekartLocators(driver);
//    }


    // Methods to interact with elements
    public WebElement AllProdutcs() {
        return driver.findElement(locators.AllProducts);
    }

    public void clickMyProfileIcon() {
        AllProdutcs().click();
    }

    public void Login() {
        WebElement ele = driver.findElement(locators.Login);
        ele.click();
    }

    public void setUsername(String username) {
        // Find the username input field
        WebElement ele = driver.findElement(locators.UserName);
        ele.clear();
        ele.sendKeys(username);
    }

    public void setPassword(String password) {
        // Find the username input field
        WebElement ele = driver.findElement(locators.Password);
        ele.clear();
        // Enter the username
        ele.sendKeys(password);
    }

    public void SignIn() {
        // Find the username input field
        WebElement ele = driver.findElement(locators.SignIn);
        ele.click();
    }

    public void HighToLow() {
        // Find the username input field
        WebElement ele = driver.findElement(locators.HighToLow);
        ele.click();

    }

    public void AddToCard() {
        // Find the username input field
        WebElement ele = driver.findElement(locators.AddToCard);
        ele.click();
    }

    public void PlaceOrder() {
        // Find the username input field
        WebElement ele = driver.findElement(locators.PlaceOrder);
        ele.click();
    }

    public void Continue() {
        // Find the username input field
        WebElement ele = driver.findElement(locators.Continue);
        ele.click();
    }

    public void NetBanking() {
        // Find the username input field
        WebElement ele = driver.findElement(locators.NetBanking);
        ele.click();
    }

    public void BankDropDown() {
        // Find the username input field
        WebElement ele = driver.findElement(locators.BankDropDown);
        ele.click();
        Select sle = new Select(ele);
        sle.selectByIndex(3);

    }

    public void ConformOrder() {
        // Find the username input field
        WebElement ele = driver.findElement(locators.ConformOrder);
        ele.click();
    }

    public void OutOfStock() {
        // Find the username input field
        WebElement ele = driver.findElement(locators.OutOfStock);
        ele.click();
//        JavascriptExecutor jse=(JavascriptExecutor)driver;
//        jse.executeScript("window.scrollBy(500,500);");

    }

    public void CancelIcon() {
        // Find the username input field
        WebElement ele = driver.findElement(locators.CancelIcon);
        ele.click();
    }

    public void Logout() {
        // Find the username input field
        WebElement ele = driver.findElement(locators.Logout);
        ele.click();
    }

    public void Passwordtextbox(String editpswd) {
        // Find the username input field
        WebElement ele = driver.findElement(locators.Passwordtextbox);
        ele.clear();
        ele.sendKeys(editpswd);

    }

    public void OneItem() {
        // Find the username input field
        WebElement ele = driver.findElement(locators.CamOneItem);
        ele.click();
    }

    public void EditDetailsIcon() {
        // Find the username input field
        WebElement ele = driver.findElement(locators.EditDetailsIcon);
        ele.click();
    }

    public void MyProfileIcon() {
        // Find the username input field
        WebElement ele = driver.findElement(locators.MyProfileIcon);
        ele.click();
    }

    public void LoadMoreProperties() {
        // Find the username input field
        WebElement ele = driver.findElement(locators.LoadMoreProperties);
        ele.click();
    }
}



