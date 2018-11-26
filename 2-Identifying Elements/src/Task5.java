import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/stelapostolachi/Selenium/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		//1example
//		driver.get("http://juliemr.github.io/protractor-demo/");
//		driver.findElement(By.xpath("html/body/div/div/form/input[1]")).sendKeys("6");
//		driver.findElement(By.xpath("//*[@ng-model = 'operator']/option[2]")).click();
//		driver.findElement(By.xpath("//*[@id = 'gobutton']/preceding::input[1]")).sendKeys("3");
//		driver.findElement(By.xpath("//*[@ng-model = 'operator']/following::button")).click();
		
		
		//2nd example
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("[title='Already a user? Sign in']")).click();
		driver.findElement(By.cssSelector("[name='loginform'] #login1")).sendKeys("gddddd");
		driver.findElement(By.cssSelector(".f14.margTop10.form-label + div>input")).sendKeys("6543");
		driver.findElement(By.cssSelector("[name='procced']")).click();
		
		
		

	}

}
