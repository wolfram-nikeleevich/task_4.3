package ru.netology;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.*;

public class CallbackTest {

    private WebDriver driver;

    @BeforeAll
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
    }

    @BeforeEach
    void setUpDriver() {
        driver = new ChromeDriver();
    }

    @AfterEach
    public void close() {
        driver.quit();
        driver = null;
    }

    @Test
    public void test(){
        driver.get("http://localhost:9999");
        driver.findElement().sendKeys("Андрей");
        driver.findElement().sendKeys("+79876543210");
        driver.findElement().click();
        driver.findElement().click();
        driver.findElement().getText();
        String text = driver.findElement().getText();
        assertEquals("",text);
    }
}
