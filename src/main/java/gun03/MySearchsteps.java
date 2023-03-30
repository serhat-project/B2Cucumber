package gun03;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import java.time.Duration;
import java.util.List;

public class MySearchsteps {
    WebDriver driver;
    WebDriverWait wait;

    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    By lSearchArea = By.xpath("//input[@name='search']");
    By lSearchButton= By.xpath("(//button[contains(@type,'button')])[4]");
    By lProducts = By.xpath("//div[@class='product-thumb']");
    @Given("user on opencart main page")
    public void userOnOpencartMainPage() {
        driver.get("http://opencart.abstracta.us/index.php?route=common/home");
    }

    @When("user search {string}")
    public void userSearch(String text) {
        wait.until(ExpectedConditions.elementToBeClickable(lSearchArea)).sendKeys(text);
        wait.until(ExpectedConditions.elementToBeClickable(lSearchButton)).click();

    }

    @Then("product count should be {int}")
    public void productCountShouldBe(int num) {
//        int productCount = driver.findElements(lProducts).size();
//        Assert.assertEquals(productCount, num);
        wait.until(ExpectedConditions.numberOfElementsToBe(lProducts, num));
        driver.quit();
    }


}
