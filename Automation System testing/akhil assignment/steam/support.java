package steam;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class support {
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
		
		webdriver.findElement(By.xpath("//*[@id=\"global_header\"]/div/div[2]/a[4]")).click();
		
		webdriver.findElement(By.xpath("//*[@id=\"help_home_block\"]/a[1]/span")).click();
		
		Thread.sleep(2000);
		
		webdriver.findElement(By.xpath("//*[@id=\"wizard_contents\"]/div/a[2]")).click();
		
		
	}	
	
	@After
	public void Teardown_stage() {
		webdriver.close();
	}
}
