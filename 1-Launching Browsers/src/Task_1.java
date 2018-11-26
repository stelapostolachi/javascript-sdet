import org.openqa.selenium.chrome.ChromeDriver;

public class Task_1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/stelapostolachi/Selenium/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.close();
		
		
	}

}
