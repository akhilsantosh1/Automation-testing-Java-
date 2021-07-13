package steam;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class addcart {
static WebDriver webdriver;
	
	@Before
	public void setup_stage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	    webdriver = new ChromeDriver();
	}
	
	@Test
	public void test_stage() throws InterruptedException
	{
		webdriver.navigate().to("https://store.steampowered.com/");
		
		webdriver.findElement(By.xpath("//*[@id=\"store_nav_search_term\"]")).click();
		
		webdriver.findElement(By.xpath("//*[@id=\"store_nav_search_term\"]")).sendKeys("Rocket Ski Racing");
		
		webdriver.findElement(By.xpath("//*[@id=\"store_search_link\"]/img")).click();
		
		webdriver.findElement(By.xpath("//*[@id=\"search_resultsRows\"]/a[1]/div[2]/div[1]/span")).click();
		
		webdriver.findElement(By.xpath("//*[@id=\"btn_add_to_cart_104421\"]/span")).click();
		
	}	
	
	@After
	public void Teardown_stage() {
		webdriver.close();
	}
}
