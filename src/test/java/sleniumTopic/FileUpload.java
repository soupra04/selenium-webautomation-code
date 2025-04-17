package sleniumTopic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.addArguments("--start-maximized");
		WebDriver driver = new EdgeDriver(edgeOptions);
		driver.get("https://the-internet.herokuapp.com/upload");
		WebElement upld = driver.findElement(By.id("file-upload"));
		//upld.sendKeys("D:\\Java workspace\\selenium-WebAutomation\\www.opencart.com_index.php_route=account_register.png");
		String dir = System.getProperty("user.dir");
		String file = dir + "\\www.opencart.com_index.php_route=account_register.png";
		upld.sendKeys(file);
		

	}

}
