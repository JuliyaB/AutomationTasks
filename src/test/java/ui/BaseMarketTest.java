package ui;

import org.junit.After;
import org.junit.Before;
import webDriver.WebDriverSetup;

public class BaseMarketTest extends WebDriverSetup {

    @Before
    public void before() {
        setup();
    }

    @After
    public void afterTest() {
        after();
    }
}
