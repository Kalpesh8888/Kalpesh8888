package c_vishal1.vishal1.Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class d_Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	
		System.setProperty("Webdriver.chrome.driver", "Chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	    

	    driver.get("https://www.youtube.com/");
	    driver.manage().window().maximize();
	    
 
	    File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    
	    FileUtils.copyFile(src, new File("E:\\KALPESH\\KALPESH\\selenium\\Screenshot/kalpesh4.jpeg"));
	    
	    driver.close();
	

	}

}
