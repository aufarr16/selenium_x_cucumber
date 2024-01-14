package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class HomePage {
    WebDriver driver;
    String homePage;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void isOnHomePage(WebDriver driver){
        homePage = driver.getCurrentUrl();
        assertEquals(homePage,"https://www.saucedemo.com/inventory.html");
        assertTrue(driver.findElement(By.id("item_3_title_link")).isDisplayed());
    }
}
