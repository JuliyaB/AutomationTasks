package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import ui.pages.selenium.MarketPage;
import util.ConfProperties;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebDriverSetup {
    public static MarketPage marketPage;
    public static WebDriver driver;
    public List<WebElement> results;

    public void setup() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        driver = new ChromeDriver();
        marketPage = new MarketPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("yandex"));
    }

    public void after() {
        driver.close();
        driver.quit();
    }
}
