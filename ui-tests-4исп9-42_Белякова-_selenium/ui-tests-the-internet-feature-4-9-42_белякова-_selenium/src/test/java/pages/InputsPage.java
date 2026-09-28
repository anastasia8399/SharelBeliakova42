package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputsPage {

    private final WebDriver driver;

    private final By input =
            By.tagName("input");

    public InputsPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getInput() {
        return driver.findElement(input);
    }

    public void enterValue(String value) {

        WebElement element = getInput();

        element.clear();
        element.sendKeys(value);
    }
}