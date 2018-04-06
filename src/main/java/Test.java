import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://bing.com");
		String title = driver.getTitle();
		System.out.println("title = " + title);
		driver.close();
	}

}
