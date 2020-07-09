package WebDriver_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetMethods {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost/login.do");// opens the URL

		String title = driver.getTitle();// opens the Page title
		System.out.println("Title of the Page:" + title);

		String currentUrl = driver.getCurrentUrl();
		System.out.println("URL of the Page:" + currentUrl);

		String text = driver.findElement(By.xpath("//td[@id='headerContainer'][@class='header']")).getText();
		System.out.println("Text is:" + text);

		String version = driver.findElement(By.xpath("//nobr[contains(text(),'actiTIME 2017.1')]")).getText();
		System.out.println("Version Of AcTi-Time is:" + version);

		driver.close();

	}

}
