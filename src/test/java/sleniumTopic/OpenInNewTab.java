package sleniumTopic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class OpenInNewTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.addArguments("--start-maximized");
		WebDriver driver = new EdgeDriver(edgeOptions);
		driver.get("https://demo.nopcommerce.com/");
		//how to open link in diff tab
		//String tab=Keys.chord(Keys.CONTROL,Keys.RETURN);
		
		
		// driver.findElement(By.linkText("Register")).sendKeys(tab);
		
		//how to open url in diff window
		//driver.switchTo().newWindow(WindowType.WINDOW);
		
		////how to open url in diff tab
		//driver.switchTo().newWindow(WindowType.TAB);
		
		//driver.get("https://the-internet.herokuapp.com/");
		WebElement text = driver.findElement(By.linkText("Register"));
		System.out.println(text.getLocation());
		System.out.println(text.getLocation().getX());
		System.out.println(text.getLocation().getY());
		
		System.out.println(text.getSize());
		System.out.println(text.getSize().getHeight());
		driver.quit();
		
	}

}
