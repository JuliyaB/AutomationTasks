package ui;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class CheckManufacturer extends WebDriverSetup {

    @Test
    public void test1(){
        pageOne.clickBtnMarket();
        focusSwitching();
        pageOne.clickBtnComputers();
        pageOne.clickSection();
        pageOne.inputPriceTo("30000");
        pageOne.clickManufacturer();
        driver.get(driver.getCurrentUrl());
        assertTrue(12 <= driver.findElements(By.tagName("article")).size());
        checkingTheFirst12();
    }

    void checkingTheFirst12(){
        results = driver.findElements(By.xpath("//*[@class='_3dCGE8Y9v3 cLo1fZHm2y']//a['title']"));
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
        System.out.println(count);
    }

}
