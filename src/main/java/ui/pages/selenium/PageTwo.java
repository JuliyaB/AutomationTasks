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

    @FindBy(xpath = "//div[@id='search-prepack']//*[contains(text(),'HUAWEI')]")
    private WebElement btnHUAWEI;

    @FindBy(xpath = "//div[@id='search-prepack']//*[contains(text(),'Samsung')]")
    private WebElement btnSamsung;

    @Override
    public void clickSection(){
        btnTablets.click();
    }

    @Override
    public void clickManufacturer() {
        btnHUAWEI.click();
        btnSamsung.click();
    }
}
