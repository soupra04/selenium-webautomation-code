package sleniumTopic;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class BrokenLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.addArguments("--start-maximized");
		WebDriver driver = new EdgeDriver(edgeOptions);
		driver.get("https://the-internet.herokuapp.com/broken_images");
		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println(links.size());

		for (WebElement link : links) {

			String url = link.getAttribute("href");

			if (!url.isEmpty() && url != null) {
				checkBrokenLink(url);

			} else {
				System.out.println("No broken link found");
			}

		}
		driver.quit();
	}

	private static void checkBrokenLink(String url) {
		// TODO Auto-generated method stub
		
		try {
			HttpURLConnection connection = (HttpURLConnection) (new URL(url).openConnection());
			connection.setRequestMethod("HEAD");
			connection.connect();
			int responseCode = connection.getResponseCode();
			
			if (responseCode >= 400) {
				System.out.println("broken Link"+url+responseCode);
			} else {
				System.out.println("valid Link"+url+responseCode);
			}
			
			
			
		} catch(IOException e) {
            System.out.println("❌ Exception checking link: " + url + " - Message: " + e.getMessage());

			
		}

	}

}
