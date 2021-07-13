package steam;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class language {
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
		
		webdriver.findElement(By.xpath("//*[@id=\"global_action_menu\"]/a")).click();
		
		webdriver.findElement(By.xpath("//*[@id=\"input_username\"]")).sendKeys("samsanto1234");
		
		webdriver.findElement(By.xpath("//*[@id=\"input_password\"]")).sendKeys("Akhil@1234");
		
		webdriver.findElement(By.xpath("//*[@id=\"login_btn_signin\"]/button/span")).click();
		
		Thread.sleep(2000);
		
		webdriver.findElement(By.xpath("//*[@id=\"account_pulldown\"]")).click();
		
		webdriver.findElement(By.xpath("//*[@id=\"account_language_pulldown\"]")).click();
		
		Thread.sleep(2000);
		
		webdriver.findElement(By.xpath("//*[@id=\"language_dropdown\"]/div/a[10]")).click();
		
		
	}	
	
	@After
	public void Teardown_stage() {
		webdriver.close();
	}
}
