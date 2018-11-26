import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicBrowser {

	public static void main(String[] args) {
		String browser = "Chrome";// it's pointing to Chrome
		WebDriver driver =null;//object not looking to any class yet.
		
		if(browser.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver","/Users/stelapostolachi/Selenium/chromedriver");
			driver = new ChromeDriver();//object is assigned to 
			
			
		}else if(browser.equals("Firefox")){
			System.setProperty("webdriver.gecko.driver","/Users/stelapostolachi/Selenium/geckodriver");
			driver = new FirefoxDriver();
			
		}
		
		
			driver.get("https://www.amazon.com/");

	}

}
