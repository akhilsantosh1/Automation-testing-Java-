package steam;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class news {
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
		
		webdriver.findElement(By.xpath("//*[@id=\"genre_tab\"]/span/a[1]")).click();
		
		webdriver.findElement(By.xpath("//*[@id=\"tab_select_TopSellers\"]/div")).click();
		
		webdriver.findElement(By.xpath("//*[@id=\"TopSellersRows\"]/a[1]/div[3]/div[2]")).click();
		
		
	}	
	
	@After
	public void Teardown_stage() {
		webdriver.close();
	}
}
