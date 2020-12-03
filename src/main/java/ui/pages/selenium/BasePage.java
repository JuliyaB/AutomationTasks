package ui.pages.selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import webDriver.WebDriverSetup;

public abstract class BasePage extends WebDriverSetup {


    @FindBy(xpath = "//*[contains(text(),'Маркет')]")
    private WebElement btnMarket;

    public void clickBtnMarket() {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(btnMarket)).click();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
    }
}
