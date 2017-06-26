import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test3 {
public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Repository\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.valtech.com");
		driver.findElement(By.xpath(".//*[@id='contacticon']/div/div/div[1]/i")).click();
		 List<WebElement> totaloffices =
		 driver.findElements(By.className("contactcities"));
		 System.out.println(totaloffices.size());
		 driver.close();

	}

}
