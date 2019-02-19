package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		//typing in first name
		driver.findElement(By.xpath("//*[@id=\"u_0_n\"]")).sendKeys("Tester selenium");
		
		// click on radio button called male
		driver.findElement(By.xpath("//*[@id=\"u_0_a\"]")).click();
		
		//selecting DOB
		Select test=new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));  
		
		test.selectByIndex(26);
		
		Select test2=new Select (driver.findElement(By.xpath("//*[@id=\"month\"]")));
		
		test2.selectByVisibleText("May");
		
		Select test3=new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
		
		test3.selectByIndex(5);
		
		//submit button
		//driver.findElement(By.xpath("//*[@id=\"u_0_15\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"reg_pages_msg\"]/a")).click();
		
		driver.navigate().back();
		
		driver.quit();
		
		
	}

}
