package ui;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ui.pages.selenium.PageOne;
import util.ConfProperties;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class Test1 {
    public static PageOne pageOne;
    public static WebDriver driver;

    @BeforeAll
    public void setup() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        driver = new ChromeDriver();
        pageOne = new PageOne(driver);
        driver.get(ConfProperties.getProperty("yandex"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test1() {
        pageOne.clickBtnMarket();
        pageOne.clickBtnComputers();
        pageOne.clickSection();
        pageOne.inputPriceTo("30000");
        pageOne.clickManufacturer();
    }


}
