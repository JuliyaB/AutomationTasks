package ui.pages.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageTwo extends AdstrLocators{
    public WebDriver driver;

    public PageTwo(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(linkText = "Планшеты")
    private WebElement btnTablets;

    @FindBy(xpath = "//div[@id='search-prepack']//*[contains(text(),'Acer')]")
    private WebElement btnAcer;

    @FindBy(xpath = "//div[@id='search-prepack']//*[contains(text(),'DELL')]")
    private WebElement btnDELL;

    @FindBy(xpath = "//*[contains(text(),'Показать всё')]")
    private WebElement btnShowAll;

    @Override
    public void clickSection(){
        btnTablets.click();
    }

    @Override
    public void clickManufacturer() {
        btnDELL.click();
    }

    public void clickShowAll() {
        btnShowAll.click();
    }
}
