package gun03.loginWithMap;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Driver;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class LoginStepDefs {
    WebDriver driver;
    WebDriverWait wait;

    {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    By lUserName = By.xpath("//input[@name='username']");
    By lPassword = By.xpath("//input[@name='password']");
    By lSubmit = By.xpath("//button[@type='submit']");
    By lNotificationInvalidCredential = By.xpath("//p[text()='Invalid credentials']");
    By lUserPanel = By.cssSelector(".oxd-userdropdown-tab");
    By lUserPanelLogoutLink = By.xpath("//a[text()='Logout']");
    By lNotificationRequired = By.xpath("//span[text()='Required']");

    @Given("user on page {string}")
    public void userOnPage(String url) {
        driver.get(url);
    }

    @When("user fill the login form as follows")
    public void userFillTheLoginFormAsFollows(DataTable table) {
        Map<String, String> map = table.asMap();

        wait.until(ExpectedConditions.visibilityOfElementLocated(lUserName)).sendKeys(map.get("username"));

        driver.findElement(lPassword).sendKeys(map.get("password"));

        wait.until(ExpectedConditions.elementToBeClickable(lSubmit)).click();
    }

    @Then("login should be successful")
    public void loginShouldBeSuccessful() {
        wait.until(ExpectedConditions.urlContains("dashboard"));
    }

    @Then("quit driver")
    public void quitDriver() {
        Driver.quitDriver();
    }

    @When("user tries to login as follows, conclution should be as in status")
    public void userTriesToLoginAsFollowsConclutionShouldBeAsInStatus(DataTable table) {
        List<Map<String, String>> maps = table.asMaps();

        for (Map<String, String> map : maps) {

            String username = map.get("username") == null ? "" : map.get("username");
            String password = map.get("password") == null ? "" : map.get("password");
            sendkeys(lUserName, username);
            sendkeys(lPassword, password);
            click(lSubmit);

            if (username.length()<=0 || password.length()<=0){
                int numberOfNotification = username.length()<=0 && password.length()<=0 ? 2 : 1;
                wait.until(ExpectedConditions.numberOfElementsToBe(lNotificationRequired, numberOfNotification));
            }else {
                if (map.get("status").equalsIgnoreCase("false")) {
                    wait.until(ExpectedConditions.visibilityOfElementLocated(lNotificationInvalidCredential));
                } else {
                    wait.until(ExpectedConditions.urlContains("dashboard"));
                    click(lUserPanel);
                    click(lUserPanelLogoutLink);
                    wait.until(ExpectedConditions.visibilityOfElementLocated(lUserName));
                }
            }
        }

    }

    public void sendkeys(By locator, String text){
        WebElement element =  wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.clear();
        element.sendKeys(text);
    }
    public void click(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public void clickByAction(By locator){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        new Actions(driver).moveToElement(element).click().perform();
    }
}
