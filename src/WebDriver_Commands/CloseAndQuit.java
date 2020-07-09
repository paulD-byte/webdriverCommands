package WebDriver_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseAndQuit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		// driver.get("http://www.popuptest.com/popuptest2.html");// opens the URL

		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//a[@href='http://www.sakinalium.in']/child::*")).click();

		Thread.sleep(1000);

		// driver.close();
		driver.quit();
	}

}
