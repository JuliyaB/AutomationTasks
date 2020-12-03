package ui;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CheckPriceRange extends WebDriverSetup {

    @Test
    public void test2() {

        pageTwo.clickBtnMarket();
        focusSwitching();
        pageTwo.clickBtnComputers();
        pageTwo.clickSection();
        pageTwo.inputPriceFrom("20000");
        pageTwo.inputPriceTo("25000");
        pageTwo.clickManufacturer();
        driver.get(driver.getCurrentUrl());
        System.out.println("Количество элементов: "+driver.findElements(By.tagName("article")).size());
        //assertEquals(12, driver.findElements(By.tagName("article")).size());
        priceRange();
    }

    void priceRange() {
        results = driver.findElements(By.xpath("//*[@data-zone-name='price']//*[@href]//span//span[1]"));
        for (WebElement element : results) {
            assertTrue(20000 <= Integer.parseInt(element.getText().replaceAll("\\s+", "")) &&
                    Integer.parseInt(element.getText().replaceAll("\\s+", "")) <= 25000);
        }
    }
}
