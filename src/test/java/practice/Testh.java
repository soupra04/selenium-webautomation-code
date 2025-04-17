package practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Testh {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.addArguments("--start-maximized");
		WebDriver driver = new EdgeDriver(edgeOptions);
		driver.get("https://the-internet.herokuapp.com/");
		WebElement ele = driver.findElement(By.xpath("//h2[normalize-space()='Available Examples']"));
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src =ele.getScreenshotAs(OutputType.FILE);
		File trg= new File(".\\\\screenshots\\\\ele.png");
		FileUtils.copyFile(src, trg);
		
			
			
		
	}

}
