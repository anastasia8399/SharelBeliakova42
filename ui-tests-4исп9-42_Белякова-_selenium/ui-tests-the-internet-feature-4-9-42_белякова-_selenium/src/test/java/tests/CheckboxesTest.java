package tests;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import pages.CheckboxesPage;

public class CheckboxesTest extends TestBase {

    @Test
    public void firstCheckboxCanBeChecked() {

        CheckboxesPage page =
                new CheckboxesPage(driver, wait);

        page.open();

        List<WebElement> checkboxes =
                page.getCheckboxes();

        Assert.assertFalse(
                checkboxes.get(0).isSelected(),
                "Первый checkbox должен быть unchecked."
        );

        checkboxes.get(0).click();

        Assert.assertTrue(
                checkboxes.get(0).isSelected(),
                "Первый checkbox должен стать checked."
        );
    }

    @Test
    public void secondCheckboxCanBeUnchecked() {

        CheckboxesPage page =
                new CheckboxesPage(driver, wait);

        page.open();

        List<WebElement> checkboxes =
                page.getCheckboxes();

        Assert.assertTrue(
                checkboxes.get(1).isSelected(),
                "Второй checkbox должен быть checked."
        );

        checkboxes.get(1).click();

        Assert.assertFalse(
                checkboxes.get(1).isSelected(),
                "Второй checkbox должен стать unchecked."
        );
    }
}