package ex_selenium22_03_2025;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.net.HttpURLConnection;

//Find all links (<a> tags) on the webpage.
//2️⃣ Extract the href attribute from each link.
//3️⃣ Send an HTTP request to the URL using Java's HttpURLConnection.
//4️⃣ Check the response status code:
//✅ 200 → Valid link (working)
//❌ 404, 500, 403 → Broken link
//5️⃣ Log the results.


public class CheckBrokenLink {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.addArguments("--start-maximized");
		driver = new EdgeDriver(edgeOptions);
		driver.get("https://the-internet.herokuapp.com/broken_images");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(WebElement link : links ) {
			
			String url = link.getAttribute("href");
			
			if( url != null  && !url.isEmpty() )
				checkBrokenLink(url);
			else {
				System.out.println("null and empty links found");
			}
		}	
	driver.quit();
}
			public static void checkBrokenLink(String url) {
				
				try {
					HttpURLConnection  connection = (HttpURLConnection ) new URL(url).openConnection();
					connection.setRequestMethod("HEAD");
					connection.setConnectTimeout(5000);
					connection.setReadTimeout(5000);
					connection.connect();
					int rCode = connection.getResponseCode();
					connection.disconnect();
					
					if(rCode >= 400) {
						System.out.println("Broken Link: " + url + " | Status Code: " + rCode);
					} else {
		                System.out.println("✅ Valid Link: " + url + " | Status Code: " + rCode);

					}
					
				} catch(IOException e) {
					System.out.println("Error Checking Link: " + url);
					
				}
				
			}
		}

	


