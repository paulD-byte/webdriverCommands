package WebDriver_Commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		// driver.get("http://www.popuptest.com/popuptest2.html");// opens the URL

		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());

		driver.navigate().to("https://www.facebook.com/");
		System.out.println(driver.getTitle());

		driver.navigate().back();
		System.out.println(driver.getTitle());

		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		System.out.println(driver.getTitle());

		Thread.sleep(1000);

		driver.close();
		// driver.quit();
	}

}
