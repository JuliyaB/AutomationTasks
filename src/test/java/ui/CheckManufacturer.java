package ui;

import enums.Manufacturer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CheckManufacturer extends BaseMarketTest {

    @Test
    public void checkManufacturer() {
        marketPage.clickBtnMarket();
        marketPage.selectSection("Компьютеры");
        marketPage.selectSection("Ноутбуки");
        marketPage.priceMax("30000");
        marketPage.selectManufacturer(Manufacturer.HP.getManufacturer());
        marketPage.selectManufacturer(Manufacturer.Lenovo.getManufacturer());
        //Нет кнопки "Применить"
        marketPage.siteWait();
        //Выдается больше 12
        assertTrue(12 <= marketPage.getNumberOfElements());
        assertEquals(12, marketPage.checkingTheFirst12());
    }

}
