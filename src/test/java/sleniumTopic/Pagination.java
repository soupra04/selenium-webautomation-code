package sleniumTopic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Pagination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://practice.expandtesting.com/dynamic-pagination-table");
		String text = driver.findElement(By.id("example_info")).getText();
		System.out.println(text);
		
		//ext.indexOf("of ")+1
		////text.indexOf(" entries")-1
		int num =Integer.valueOf(text.substring(text.indexOf("of ")+3,text.indexOf(" entries")));
		System.out.println(num);
		
		for (int i=1;i<=num;i++) {
			
		}
		
		
	}

}
