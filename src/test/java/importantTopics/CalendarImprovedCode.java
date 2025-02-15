package importantTopics;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarImprovedCode {
    static WebDriver driver; // Class-level driver variable

    public static void main(String[] args) {
        // Configure Edge browser options
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        // Initialize the driver using the class-level variable
        driver = new EdgeDriver(edgeOptions);

        // Open the calendar website
        driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

        // Open the datepicker
        driver.findElement(By.id("datepicker")).click();

        // Wait for the datepicker to be visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("datepicker")));

        // Select the desired date
        selectDate("14", "October", "2023");
    }

    public static String[] getMonthYear(String monthYear) {
        return monthYear.split(" ");
    }

    public static void selectDate(String day, String month, String year) {
        // Get the current displayed month and year in the datepicker
        String monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
        System.out.println("Current month and year: " + monthYear);

        // Navigate to the desired month and year
        while (!(getMonthYear(monthYear)[0].equals(month) && getMonthYear(monthYear)[1].equals(year))) {
            driver.findElement(By.xpath("//a[@title='Next']")).click();
            monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
            System.out.println("Navigated to: " + monthYear);
        }

        // Select the desired day
        driver.findElement(By.xpath("//a[text()='" + day + "']")).click();
    }
}
