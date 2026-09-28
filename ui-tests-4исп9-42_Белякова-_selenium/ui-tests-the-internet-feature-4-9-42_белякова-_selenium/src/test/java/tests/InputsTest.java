package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import pages.InputsPage;

public class InputsTest extends TestBase {

    @Test
    public void inputAcceptsNumber() {

        driver.get(
                "https://the-internet.herokuapp.com/inputs"
        );

        InputsPage page =
                new InputsPage(driver);

        page.enterValue("123");

        Assert.assertEquals(
                page.getInput().getAttribute("value"),
                "123"
        );
    }

    @Test
    public void inputWorksWithArrowKeys() {

        driver.get(
                "https://the-internet.herokuapp.com/inputs"
        );

        InputsPage page =
                new InputsPage(driver);

        WebElement input =
                page.getInput();

        input.sendKeys("5");

        input.sendKeys(Keys.ARROW_UP);

        Assert.assertEquals(
                input.getAttribute("value"),
                "6"
        );

        input.sendKeys(Keys.ARROW_DOWN);

        Assert.assertEquals(
                input.getAttribute("value"),
                "5"
        );
    }
}