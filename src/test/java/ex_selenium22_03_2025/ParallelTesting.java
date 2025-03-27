package ex_selenium22_03_2025;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTesting {
    WebDriver driver;

    @BeforeMethod
    @Parameters("browser")
    public void setup(String browser) {  // Ensure the parameter name matches testng.xml
        System.out.println("Running tests on browser: " + browser);

        if (browser.equalsIgnoreCase("edge")) {
            EdgeOptions edgeOptions = new EdgeOptions();
            edgeOptions.addArguments("--start-maximized");
            driver = new EdgeDriver(edgeOptions);
        } else if (browser.equalsIgnoreCase("chrome")) {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--start-maximized");
            driver = new ChromeDriver(chromeOptions);
        } else {
            throw new IllegalArgumentException("Invalid browser: " + browser);
        }

        driver.get("https://the-internet.herokuapp.com/broken_images");
    }

    @Test
    public void test() {
        System.out.println("Page title is: " + driver.getTitle());
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
