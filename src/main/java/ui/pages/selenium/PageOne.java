package ui.pages.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageOne extends AdstrLocators {
    public WebDriver driver;

    public PageOne(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(linkText = "Ноутбуки")
    private WebElement btnLaptops;

    @FindBy(linkText = "HP")
    private WebElement btnHP;

    @FindBy(linkText = "Lenovo")
    private WebElement btnLenovo;

    @Override
    public void clickSection(){
        btnLaptops.click();
    }

    @Override
    public void clickManufacturer() {
        btnHP.click();
        btnLenovo.click();
    }
}
