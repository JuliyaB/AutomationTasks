package ui;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import ui.pages.selenium.PageOne;
import ui.pages.selenium.PageTwo;
import util.ConfProperties;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebDriverSetup {
    protected static PageOne pageOne;
    protected static PageTwo pageTwo;
    protected static WebDriver driver;
    protected List<WebElement> results;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        driver = new ChromeDriver();
        pageOne = new PageOne(driver);
        pageTwo = new PageTwo(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("yandex"));
    }

    @After
    public void after() {
        driver.close();
        /*driver.quit();*/
    }

    void focusSwitching() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
    }
}
