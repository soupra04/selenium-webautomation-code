package ex_selenium_2025;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class ListOfElementsInEbbayWebSite {
	
	@Test
	public void test_list_of_carts() {
		
		EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        
		WebDriver driver = new EdgeDriver(edgeOptions);
	    driver.get("https://www.ebay.com/b/PC-Desktops-All-In-One-Computers/179/bn_661752");
		
		WebElement searchBox = driver.findElement(By.id("gh-ac"));
		searchBox.sendKeys("macmini");
		
		WebElement submitbutton = driver.findElement(By.xpath("//input[@value='Search']"));
		submitbutton.click();
		
		
		List<WebElement> searchTitle = driver.findElements(By.xpath("//div[@class='s-item__title']"));
		List<WebElement> searchprice = driver.findElements(By.xpath("//span[@class='s-item__price']"));
		
		int size = Math.min(searchprice.size(), searchTitle.size());
		
		for ( int i=0; i< size;i++) {
			
			System.out.println("Title : " +searchTitle.get(i).getText() + " || "+ "price : "+ searchprice.get(i).getText());
		}
		
		
	}

}
