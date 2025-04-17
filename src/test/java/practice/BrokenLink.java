package practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.http.HttpResponse;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.apache.logging.log4j.core.appender.HttpURLConnectionManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class BrokenLink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://the-internet.herokuapp.com/dropdown");
		WebElement drpdown = driver.findElement(By.id("dropdown"));
		List<WebElement> menus = driver.findElements(By.xpath("//select[@id='dropdown']/option"));
		selectdropdown(menus, "Option 1");
		//driver.close();
		
		
		
	}
	
	public static void selectdropdown(List<WebElement> options , String value) {
		for (WebElement option: options) {
			if(option.getText().equals(value)) {
			option.click();
			break;
				
			}
			
		}
		
	}
	
	
}
