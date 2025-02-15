package importantTopics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.addArguments("--start-maximized");
		WebDriver driver = new EdgeDriver(edgeOptions);
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("datepicker")));

		driver.findElement(By.id("datepicker")).click();

		String monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
		System.out.println(monthYear);

		String month = monthYear.split(" ")[0].trim();
		String year = monthYear.split(" ")[1].trim();

		System.out.println(month);
		System.out.println(year);

		while (!(month.equals("June") && year.equals("2025"))) {

			driver.findElement(By.xpath("//a[@title='Next']")).click();
			monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
			System.out.println(monthYear);

			month = monthYear.split(" ")[0].trim();
			year = monthYear.split(" ")[1].trim();
			System.out.println(month);
			System.out.println(year);
			
			
		}
		driver.findElement(By.xpath("//a[text()='15']")).click();

	}

}
