package Java8Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Function;

public class LambdaExpressionsHandsOn1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        /*
        Using Lambda Expressions in selenium
        Using Lambda with WebDriverWait (Most Common in Selenium)
        Before Java 8, waits were written using anonymous classes.
        */

        // Old Style (Before Lambda)
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.id("login"));
            }
        });

        // Lambda Version
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait1.until(driver1 -> driver.findElement(By.id("login")));

        /*
        Meaning:
        Take driver
        Execute logic
        Return the element
        */
    }
}
