package steam;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class edit_profile {
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
		
		webdriver.findElement(By.xpath("//*[@id=\"account_dropdown\"]/div/a[1]")).click();
		
		Thread.sleep(2000);
		
		webdriver.findElement(By.xpath("/html/body/div[1]/div[7]/div[6]/div[1]/div[1]/div/div/div/div[3]/div[2]/a/span")).click();
		
		webdriver.findElement(By.xpath("//*[@id=\"application_root\"]/div[2]/div[1]/a[5]")).click();
		
		Thread.sleep(4000);
		
		webdriver.findElement(By.xpath("//*[@id=\"application_root\"]/div[2]/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div[2]/div")).click();
		
		webdriver.findElement(By.xpath("//*[@id=\"application_root\"]/div[2]/div[2]/div[3]/div/div[3]/button[1]")).click();
		
	}	
	
	@After
	public void Teardown_stage() {
		webdriver.close();
	}
}
