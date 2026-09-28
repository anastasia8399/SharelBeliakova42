package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import pages.AddRemovePage;

public class AddRemoveElementsTest extends TestBase {

    @Test
    public void addTwoElements() {

        driver.get(
                "https://the-internet.herokuapp.com/add_remove_elements/"
        );

        AddRemovePage page =
                new AddRemovePage(driver);

        page.addElement();
        page.addElement();

        Assert.assertEquals(
                page.getDeleteButtonsCount(),
                2
        );
    }

    @Test
    public void deleteElement() {

        driver.get(
                "https://the-internet.herokuapp.com/add_remove_elements/"
        );

        AddRemovePage page =
                new AddRemovePage(driver);

        page.addElement();
        page.addElement();

        Assert.assertEquals(
                page.getDeleteButtonsCount(),
                2
        );

        page.deleteElement();

        Assert.assertEquals(
                page.getDeleteButtonsCount(),
                1
        );
    }
}