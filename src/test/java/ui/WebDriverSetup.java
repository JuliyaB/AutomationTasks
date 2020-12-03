package ui;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ui.pages.selenium.PageOne;
import ui.pages.selenium.PageTwo;
import util.ConfProperties;

import java.util.concurrent.TimeUnit;

public class WebDriverSetup {
    public static PageOne pageOne;
    public static PageTwo pageTwo;
    public static WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        driver = new ChromeDriver();
        pageOne = new PageOne(driver);
        pageTwo = new PageTwo(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("yandex"));
    }

    @After
    public void after() {
        System.clearProperty("End");
        driver.close();
    }
}
