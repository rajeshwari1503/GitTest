package MyPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchBrowsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver","Chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("www.amazon.com");
	
	
	
}
}