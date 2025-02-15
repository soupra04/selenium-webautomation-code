package ex_selenium_2025;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ActionClassPopUphandling {
	
	@Test
	
	public void test_popup() throws InterruptedException {
		
		
		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.addArguments("inPrivate");
		edgeOptions.addArguments("--start-maximized");
		 WebDriver driver = new EdgeDriver(edgeOptions);
		 driver.get("https://www.makemytrip.com/");
		    System.out.println(driver.getTitle());
		    
		    
		    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModal']")));
		    driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
		    
		    WebElement fromcity = driver.findElement(By.xpath("//input[@id='fromCity']"));
		    
		    try {
		    	Thread.sleep(5000);
		    } catch(InterruptedException e) {
		    	throw new RuntimeException(e);
		    	
		    }
		    Actions actions = new Actions(driver);
		    //actions.moveToElement(fromcity).click().sendKeys("New Delhi").build().perform();
		    
		    /*
		    List<WebElement> listofCity = driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']/li"));
		    
		    for (WebElement e :listofCity) {
		    	if( e.getText().contains("new Delhi")) {
		    		e.click();
		    	}
		    	
		    }
		    */
		    
		    actions.moveToElement(fromcity).click().sendKeys("del").build().perform();
		   
		    try {
		    	Thread.sleep(5000);
		    } catch(InterruptedException e) {
		    	throw new RuntimeException(e);
		    	
		    }
            
		    actions.moveToElement(fromcity).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).perform();
            
		    
	}

}
