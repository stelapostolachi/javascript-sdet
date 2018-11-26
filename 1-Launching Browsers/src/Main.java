import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

	public static void main(String[] args) {
//		//use this class to access the browser.
		System.setProperty("webdriver.chrome.driver","/Users/stelapostolachi/Selenium/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.close();//it will close your browser. 
		driver.quit();//it will close everything
		
		
//		System.setProperty("webdriver.gecko.driver","/Users/stelapostolachi/Selenium/geckodriver");
//		FirefoxDriver driver = new FirefoxDriver();
//		driver.get("https://www.amazon.com/");
//		driver.close();
//		
		
		

	}

}
