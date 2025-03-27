package ex_selenium22_03_2025;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import dev.failsafe.internal.util.Durations;

public class ExtractWebTabls {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.addArguments("--start-maximized");
		 WebDriver driver = new EdgeDriver(edgeOptions);
		 
		driver.get("https://demoqa.com/webtables");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement table = driver.findElement(By.xpath("//div[@role='grid']"));
		
		List<WebElement> rows = table.findElements(By.className("rt-tr-group"));
		
		int totalRows = rows.size();
		
		for(int i=0; i<totalRows;i++) {
			List<WebElement> columns = rows.get(i).findElements(By.className("rt-td"));
			for (int j=0; j<columns.size();j++) {
				//System.out.println("%-20s", columns.get(j).getText());
				System.out.printf("%-20s", columns.get(j).getText());
			}
		}
System.out.println();
driver.quit();
	}

}
