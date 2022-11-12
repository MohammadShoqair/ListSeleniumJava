package navigation;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromeweb driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://127.0.0.1:5500/index2.html");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title+"\n"+"-----------");
		java.util.List<WebElement>  listOptions = driver.findElements(By.tagName("option"));
		
		for(int i=0; i<listOptions.size();i++) {
			System.out.println(listOptions.get(i).getText());
		}

	}

}
