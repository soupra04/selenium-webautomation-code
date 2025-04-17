package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class JqueryMenus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.addArguments("--start-maximized");
		WebDriver driver = new EdgeDriver(edgeOptions);
		driver.get("https://the-internet.herokuapp.com/jqueryui/menu#");
		List<WebElement> menustest = driver.findElements(By.xpath("//ul[@id='menu']/li"));
		clickmenushello(menustest, "Enabled");
		
		List<WebElement> dwn = driver.findElements(By.xpath("//ul[contains(@class,'ui-menu ui-widget ui-widget-content ui-front') and @aria-expanded='true']"));
		clickmenushello(dwn, "Downloads");
		
		

	}
	
	public static void clickmenushello(List<WebElement> options, String value) {
		for (WebElement option:options) {
			if(option.getText().equals(value)) {
				option.click();
				break;
			}
			
		}
	}

}
