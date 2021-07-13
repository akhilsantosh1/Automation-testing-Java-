package steam;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class community {
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
		
		webdriver.findElement(By.xpath("//*[@id=\"global_header\"]/div/div[2]/a[2]")).click();
		
		webdriver.findElement(By.xpath("//*[@id=\"ModalContentContainer\"]/div[1]/div[2]/div[1]/a[6]/span")).click();
		
		Thread.sleep(2000);
		
		webdriver.findElement(By.xpath("//*[@id=\"apphub_Card_2385960678\"]/div[1]/div[3]/div/img")).click();
		
		
	}	
	
	@After
	public void Teardown_stage() {
		webdriver.close();
	}
}
