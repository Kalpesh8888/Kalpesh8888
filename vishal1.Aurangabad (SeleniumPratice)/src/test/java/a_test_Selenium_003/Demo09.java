package a_test_Selenium_003;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

	WebDriverManager.chromedriver().setup();

     WebDriver driver = new ChromeDriver();

driver.get("https://www.facebook.com/");
driver.findElement(By.id("email")).sendKeys("kalpesh@gmail.com");
driver.findElement(By.id("pass")).sendKeys("kalpesh@123"); 
driver.findElement(By.id("loginbutton")).click();
  
  
  
  
  
  
}

	
		
	}
}
