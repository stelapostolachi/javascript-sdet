import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/stelapostolachi/Selenium/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.newtours.demoaut.com");
		
		//id locator
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
       
		String title= driver.getTitle();
		System.out.println(title);
		
		if(title.contains("Find a Flight")) {
			System.out.println("Contains");
		}else {
			System.out.print("Not good");
		}
		driver.close();

	}

}
