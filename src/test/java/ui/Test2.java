package ui;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Test2 extends WebDriverSetup {

    @Test
    public void test2() throws InterruptedException {

        pageTwo.clickBtnMarket();

        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }

        pageTwo.clickBtnComputers();
        pageTwo.clickSection();
        pageTwo.inputPriceFrom("20000");
        pageTwo.inputPriceTo("25000");
        pageTwo.clickShowAll();
        pageTwo.clickManufacturer();
        /*assertEquals(12, driver.findElements(By.tagName("article")).size());*/
        Thread.sleep(3000);
        countP();
    }

    void countP() {
        List<WebElement> results = driver.findElements(By.xpath("//*[@class='_3NaXxl-HYN _3f2ZtYT7NH _2Sc2mRSDwb']//span//span"));
        for (WebElement element : results) {
            /*if (20000 > Integer.parseInt(element.getText()) &&
                    Integer.parseInt(element.getText()) > 25000) {
                System.out.println("Ошибка");
            }*/
            System.out.println(element.getText());
        }
    }
}
