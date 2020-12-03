package ui.pages.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MarketPage extends BasePage {
    static WebDriver driver;

    public MarketPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void selectSection(String name) {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(By.linkText(name))).click();
    }

    public void priceMin(String price) {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(By.id("glpricefrom"))).sendKeys(price);
    }

    public void priceMax(String price) {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(By.id("glpriceto"))).sendKeys(price);
    }

    public void selectManufacturer(String name) {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='search-prepack']//*[contains(text(),'" + name + "')]"))).click();
    }

    public static int getNumberOfElements() {
        return driver.findElements(By.tagName("article")).size();
    }

    public static int checkingTheFirst12() {
        results = driver.findElements(By.xpath("//*[@data-zone-name='SearchResults']//h3['title']"));
        int count = 0;
        int i = 0;
        for (WebElement element : results) {
            if (i != 12) {
                if (element.getText().contains("HP") || element.getText().contains("Lenovo")) {
                    count++;
                }
            } else {
                break;
            }
            i++;
        }
        return count;
    }

    public static boolean priceRange() {
        results = driver.findElements(By.xpath("//*[@data-zone-name='price']//*[@href]//span//span[1]"));
        for (WebElement element : results) {
            if (20000 > Integer.parseInt(element.getText().replaceAll("\\s+", "")) &&
                    Integer.parseInt(element.getText().replaceAll("\\s+", "")) > 25000) {
                return false;
            }
        }
        return true;
    }

}
