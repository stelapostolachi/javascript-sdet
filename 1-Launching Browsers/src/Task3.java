import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/stelapostolachi/Selenium/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		
		String title= driver.getTitle();
		
		if(title.contains("Business")){
			System.out.println("Verify");
		}else {
			System.out.println("Not verify");
		}
		
		driver.quit();
				
		
		
		

	}

}
