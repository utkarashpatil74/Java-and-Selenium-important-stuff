package FakeStoreApi;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class ECommerce {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/home");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        SoftAssert s = new SoftAssert();
        s.assertEquals(driver.findElement(By.xpath("//h1[text()='Fake Store']")).getText(), "Fake Store");
        s.assertEquals(driver.findElements(By.xpath("//div[@class='columns mt-3 is-multiline']//footer[@class='card-footer']")).size(), 20);

        WebElement cartButton = driver.findElement(By.xpath("//button[@class='button is-pulled-right']//i"));
        s.assertTrue(cartButton.isDisplayed());

        List<WebElement> ls = driver.findElements(By.xpath("//div[@class='columns mt-3 is-multiline']//footer[@class='card-footer']/button"));
        int count = 0;

        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (WebElement e : ls) {
            String a = e.getText().replaceAll("[^0-9.]", ""); // Extract numeric value
            System.out.println("Extracted price: " + a); // Debugging line to verify extracted value
            if (!a.isEmpty()) {
                double i = Double.parseDouble(a);
                if (i >= 500) {
                  //  js.executeScript("arguments[0].click();", e);
                    e.click();
                    count++;
                }
            }
        }
        System.out.println("Number of products: " + count);
        driver.quit(); // Close the browser after execution
    }
}
