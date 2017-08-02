import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class main {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("http://www.google.com");
		Driver.manage().window().fullscreen();

	}

}
