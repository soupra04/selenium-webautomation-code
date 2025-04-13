package sleniumTopic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import dev.failsafe.internal.util.Durations;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.addArguments("--start-maximized");
		WebDriver driver = new EdgeDriver(edgeOptions);
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement table = driver.findElement(By.xpath("//table[@class='dataTable']"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		
		for (int i=0;i<rows.size();i++) {
			WebElement row = rows.get(i);
			List<WebElement> columns =  row.findElements(By.tagName("td"));
			for (int j=0;j<columns.size();j++) {
				System.out.printf("%-20s", columns.get(j).getText());
			}
		}
		System.out.println();

		
		
	}

}
