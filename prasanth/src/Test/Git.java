package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Git {
	
	public static void main(String args[]) throws Throwable {
		
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" )	;
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(5000);
	
	driver.close();
	
	}	
}

