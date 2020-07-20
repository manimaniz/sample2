package sel.day1.brow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.ClickAction;

public class BrowserAutomation {
	public static void main(String[] args) throws InterruptedException {

		//http://www.adactin.com/HotelApp/ 

			//NOTE: Print the UserName and Password that you are entered.
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\maniz\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//launch url
	driver.get("http://www.adactin.com/HotelApp/ ");
	WebElement mail = driver.findElement(By.xpath("//input[@type='text']"));
	mail.sendKeys("manisivam595@gmail.com");
	String ad = mail.getAttribute("value");
	System.out.println(ad);
	WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
	pwd.sendKeys("sad56452");
	String d = mail.getAttribute("value");
	System.out.println(d);
	 
	}

}
