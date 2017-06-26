import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Test1 {
	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Repository\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.valtech.com");
		driver.findElement(By.xpath(".//*[@id='navigationMenuWrapper']/div/ul/li[1]/a/span")).click();
		driver.findElement(By.xpath(".//*[@id='container']/div[10]/div/div[3]/a")).click();
		Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='container']/header[1]/div/p")).getText()
				.equalsIgnoreCase("All the latest news and press releases from Valtech."));
		driver.close();
	}

}
