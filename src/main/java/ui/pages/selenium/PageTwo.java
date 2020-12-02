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

    @FindBy(linkText = "Acer")
    private WebElement btnAcer;

    @FindBy(linkText = "DELL")
    private WebElement btnDELL;

    @Override
    public void clickSection(){
        btnTablets.click();
    }

    @Override
    public void clickManufacturer() {
        btnAcer.click();
        btnDELL.click();
    }
}
