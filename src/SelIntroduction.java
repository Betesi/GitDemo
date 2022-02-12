import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// Invoking Browser, we need to create object of class to access all that is in
		// it
		// chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Betesi\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();

		// Firefox browser
		// System.setProperty("webdriver.gecko.driver",
		// "C:\\Users\\Betesi\\geckodriver.exe");
		// WebDriver driver2 = new FirefoxDriver();

		// Microsoft edge browser
		// System.setProperty("webdriver.edge.driver",
		// "C:\\Users\\Betesi\\msedgedriver.exe");
		// WebDriver driver3 = new EdgeDriver();

		driver1.get("https://rahulshettyacademy.com/#/index");
		System.out.println(driver1.getTitle());
		System.out.println(driver1.getCurrentUrl());
		driver1.close();

	}

}
