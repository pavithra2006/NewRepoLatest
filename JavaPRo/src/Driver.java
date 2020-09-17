import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver.exe");
		WebDriver driver = null;
		driver = new ChromeDriver();
		driver.get("http://www.htmlcanvasstudio.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}
