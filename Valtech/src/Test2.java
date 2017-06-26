
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;

public class Test2 {
	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Repository\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.valtech.com");
		String a[] = { "ABOUT", "WORK", "SERVICES" };
		for (int i = 1; i < 4; i++) {
			driver.findElement(By.xpath(".//*[@id='navigationMenuWrapper']/div/ul/li[" + i + "]/a/span")).click();
			Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='container']//following::h1")).getText()
					.equalsIgnoreCase(a[i - 1]));

		}
		driver.close();
	}
}
