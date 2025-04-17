package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.addArguments("--start-maximized");
		WebDriver driver = new EdgeDriver(edgeOptions);
		driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");

		WebElement drop = driver.findElement(By.xpath("//button[@data-toggle='dropdown']"));
		drop.click();
		List<WebElement> menus = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
		dropdownselectmethod(menus,"CSS");

	}
	
	public static void dropdownselectmethod(List<WebElement> options, String value) {
		for(WebElement option: options) {
			if(option.getText().equals(value)) {
				option.click();
				break;
			}
			
		}
		
	}

}