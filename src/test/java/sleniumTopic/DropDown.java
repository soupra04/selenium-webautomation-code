package sleniumTopic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EdgeOptions edgeoptions = new EdgeOptions();
		edgeoptions.addArguments("--start-maximized");
		WebDriver driver = new EdgeDriver(edgeoptions);
		driver.get("https://the-internet.herokuapp.com/dropdown");
		WebElement dropdown = driver.findElement(By.id("dropdown"));
		Select select = new Select(dropdown);
		select.selectByIndex(2);
		WebElement selectoption = select.getFirstSelectedOption();
		System.out.println(selectoption.getText());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.quit();
		

	}

}
