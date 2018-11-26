import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/stelapostolachi/Selenium/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.dice.com/");
		
		driver.get("https://www.indeed.com/");
		driver.navigate().back();
		
		String title= driver.getTitle();
		System.out.println(title);
		
		String title1 = driver.getCurrentUrl();
		System.out.println(title1);
		
		
		driver.navigate().forward();
		driver.get("https://www.indeed.com/");
		
		String title2= driver.getTitle();
		System.out.println(title2);
		
		String title3 = driver.getCurrentUrl();
		System.out.println(title3);
		driver.close();
		driver.quit();
		

	}

}
