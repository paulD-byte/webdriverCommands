package WebDriver_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConditionalCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@id='u_0_2']")).click();

		WebElement fn = driver.findElement(By.xpath("//input[@id='u_r_b']"));
		WebElement ln = driver.findElement(By.xpath("//input[@id='u_r_d']"));

		if (fn.isDisplayed() && fn.isEnabled()) {
			fn.sendKeys("Debasis");
		}

		if (ln.isDisplayed() && ln.isEnabled()) {
			ln.sendKeys("Paul");
		}

		// // male radio

		boolean male = driver.findElement(By.xpath("//input[@value='Male']")).isSelected();
		System.out.println(male);

		// female radio
		boolean female = driver.findElement(By.xpath("//input[@value='Female']")).isSelected();
		System.out.println(female);

		if (male == false) {

			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@value='Male']")).click();
		}

		// driver.close();

	}

}
