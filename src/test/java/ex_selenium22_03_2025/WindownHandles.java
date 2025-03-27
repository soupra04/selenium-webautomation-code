package ex_selenium22_03_2025;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindownHandles {
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void setup() {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		driver = new ChromeDriver(chromeOptions);
		driver.get(" https://the-internet.herokuapp.com/windows");
	}

	@Test
	public void test() {
		driver.findElement(By.xpath("//*[contains(text(), 'Click Here')]")).click();
		String mainwindow = driver.getWindowHandle();
		
		Set<String> windowhandles = driver.getWindowHandles();
		
				
		for (String handle : windowhandles) {
			if(!handle.equals(mainwindow))
			driver.switchTo().window(handle);
			System.out.println("Widnow is switched to new Window"+driver.getTitle());
			driver.switchTo().window(mainwindow);
			System.out.println("Widnow is switched to mainwidnwo"+driver.getTitle());
			break;
		}
		
	}
	
}

