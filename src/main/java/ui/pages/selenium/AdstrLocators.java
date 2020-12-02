package ui.pages.selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class AdstrLocators {

    @FindBy(xpath = "//*[contains(text(),'Маркет')]")
    private WebElement btnMarket;

    @FindBy(xpath = "//*[contains(text(),'Компьютеры')]")
    private WebElement btnComputers;

    @FindBy(linkText = "от")
    private WebElement priceFrom;

    @FindBy(linkText = "Цена, ₽ до")
    private WebElement priceTo;

    public void clickBtnMarket() {
        btnMarket.click();
    }

    public void clickBtnComputers() {
        btnComputers.click();
    }

    abstract void clickSection();

    public void inputPriceTo(String price) {
        priceTo.sendKeys(price);
    }

    public void inputPriceFrom(String price) {
        priceFrom.sendKeys(price);
    }

    abstract void clickManufacturer();
}
