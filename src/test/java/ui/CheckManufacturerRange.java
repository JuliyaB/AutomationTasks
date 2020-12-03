package ui;

import enums.Manufacturer;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CheckManufacturerRange extends BaseMarketTest {

    @Test
    public void checkPriceRange() {
        marketPage.clickBtnMarket();
        marketPage.selectSection("Компьютеры");
        marketPage.selectSection("Планшеты");
        marketPage.priceMin("20000");
        marketPage.priceMax("25000");
        //Отсутсвует производитель "Acer", "DELL" не поподает в ценовое значение
        marketPage.selectManufacturer(Manufacturer.HUAWEI.getManufacturer());
        marketPage.selectManufacturer(Manufacturer.Samsung.getManufacturer());
        //Нет кнопки "Применить"
        driver.get(driver.getCurrentUrl());
        //На странице всегда разное количество товаров, поэтому я получаю текущее количество товаров и промеряю что оно не пустое
        assertTrue(0 < marketPage.getNumberOfElements());
        assertTrue(marketPage.priceRange());
    }

}
