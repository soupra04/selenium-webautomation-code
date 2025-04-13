package sleniumTopic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


public class CaptureScreenShots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.addArguments("--start-maximized");
		WebDriver driver = new EdgeDriver(edgeOptions);
		driver.get("https://demo.nopcommerce.com/");
	//Full Page screenshot
		//takescreenshot is interfrace
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File(".\\screenshots\\homepage.png");
		
		FileUtils.copyFile(src, trg);
		
		//for specific webelement : pls identify the element and then
		//		File src = element.getScreenshotAs(OutputType.FILE);

		
		driver.close();
	}

}
