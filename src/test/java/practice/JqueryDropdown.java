package practice;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import dev.failsafe.internal.util.Durations;

public class JqueryDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.addArguments("--start-maximized");
		WebDriver driver = new EdgeDriver(edgeOptions);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/windows");

		String mainwindow = driver.getWindowHandle(); // main window
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> allwindows = driver.getWindowHandles();

		for (String handle : allwindows) {
			if (!handle.equals(mainwindow)) {
				driver.switchTo().window(handle);
				System.out.println("Switched to diffwindow");
				driver.switchTo().window(mainwindow);
				System.out.println("Switched to main window");
				break;

			}

		}

		for (String hanlde : allwindows) {
			String title = driver.switchTo().window(hanlde).getTitle();
			if (title.equals("New Window")) {
				driver.close();
			}
		}
	}
}
