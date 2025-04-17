package sleniumTopic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

public class KeyEnter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.addArguments("--start-maximized");
		WebDriver driver = new EdgeDriver(edgeOptions);
		//driver.get("https://the-internet.herokuapp.com/key_presses?");
		Actions action = new Actions(driver);
		//WebElement trg = driver.findElement(By.id("target"));
		//action.sendKeys(trg, Keys.ENTER).perform();
		driver.get("https://text-compare.com/");
		WebElement src = driver.findElement(By.name("text1"));
		src.sendKeys("Hello Soupra");
		
		/*
		//cntr a
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		action.perform();
		
		
		//cntr c
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.perform();
		
		//tab
		
		action.keyDown(Keys.TAB);
		action.perform();
		
		
		//cntr v
		action.keyDown(Keys.DOWN);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.perform();
		*/
		
		// Perform Ctrl + A to select all text
        action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();

        // Perform Ctrl + C to copy the selected text
        action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();

        // Perform Tab to move focus to the second text area
        action.sendKeys(Keys.TAB).perform();

        // Perform Ctrl + V to paste the copied text
        action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		

	}

}
