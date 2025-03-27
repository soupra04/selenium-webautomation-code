package practice;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class WwindowHandle {
	
	public static void main(String[] args) {
	
	EdgeOptions edgeOptions = new EdgeOptions();
	edgeOptions.addArguments("--start-maximized");
	WebDriver driver = new EdgeDriver(edgeOptions);
	driver.get("https://the-internet.herokuapp.com/windows");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//*[contains(text(), 'Click Here')]")).click();

	String mainwindow = driver.getWindowHandle();
	
	Set<String> allWindows = driver.getWindowHandles();
	
	for (String handle : allWindows) {
		if(!handle.equals(mainwindow)) {
			driver.switchTo().window(handle);
			System.out.println("window swithced to new Window");
			driver.switchTo().window(mainwindow);
			System.out.println("window swithced to main Window");
			break;
		}
		
	}
	

	
	}
	
}
