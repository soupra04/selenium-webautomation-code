package ex_selenium_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class UploadFile {
	
	@Test
	
	public void test_upload_file() {
		
		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.addArguments("--start-maximized");

		 WebDriver driver = new EdgeDriver(edgeOptions);
		String URL = "https://awesomeqa.com/selenium/upload.html";
		driver.get(URL);
		WebElement choseFile = driver.findElement(By.id("fileToUpload"));
		
		String dir= System.getProperty("user.dir");
		System.out.println(dir);
		
		choseFile.sendKeys(dir + "/Hello.txt");
		driver.findElement(By.name("submit")).click();
		
	}

}
