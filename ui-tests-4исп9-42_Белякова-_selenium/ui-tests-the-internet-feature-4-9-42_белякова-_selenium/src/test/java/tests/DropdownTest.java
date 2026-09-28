package tests;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import pages.DropdownPage;

public class DropdownTest extends TestBase {

    @Test
    public void dropdownContainsOptions() {

        driver.get(
                "https://the-internet.herokuapp.com/dropdown"
        );

        DropdownPage page =
                new DropdownPage(driver);

        Select select = page.getDropdown();

        Assert.assertTrue(
                select.getOptions().size() >= 2
        );
    }

    @Test
    public void selectFirstAndSecondOption() {

        driver.get(
                "https://the-internet.herokuapp.com/dropdown"
        );

        DropdownPage page =
                new DropdownPage(driver);

        Select select = page.getDropdown();

        select.selectByVisibleText("Option 1");

        Assert.assertEquals(
                select.getFirstSelectedOption().getText(),
                "Option 1"
        );

        select.selectByVisibleText("Option 2");

        Assert.assertEquals(
                select.getFirstSelectedOption().getText(),
                "Option 2"
        );
    }
}