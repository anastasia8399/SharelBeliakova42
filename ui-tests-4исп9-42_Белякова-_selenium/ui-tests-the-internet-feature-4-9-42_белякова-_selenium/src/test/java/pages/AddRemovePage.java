package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddRemovePage {

    private final WebDriver driver;

    private final By addElementButton =
            By.xpath("//button[text()='Add Element']");

    private final By deleteButton =
            By.xpath("//button[text()='Delete']");

    public AddRemovePage(WebDriver driver) {
        this.driver = driver;
    }

    public void addElement() {
        driver.findElement(addElementButton).click();
    }

    public void deleteElement() {
        driver.findElements(deleteButton)
                .get(0)
                .click();
    }

    public int getDeleteButtonsCount() {
        return driver.findElements(deleteButton).size();
    }
}