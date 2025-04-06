package sleniumTopic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MultipleWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://the-internet.herokuapp.com/windows");
		String mainWindow = driver.getWindowHandle();

		WebElement clickhere = driver.findElement(By.linkText("Click Here"));
		clickhere.click();

		Set<String> allwindows = driver.getWindowHandles();
		for (String handles : allwindows) {
			if (!handles.equals(mainWindow)) {
				driver.switchTo().window(handles);
				System.out.println("Switched to window handle");
				//driver.switchTo().window(mainWindow);
				//System.out.println("Switched to main window");
				break;
			} 
		}

	}

}
