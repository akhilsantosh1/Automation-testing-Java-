package steam;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class add_friend {
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
		
		webdriver.findElement(By.xpath("//*[@id=\"global_header\"]/div/div[2]/a[3]")).click();
		
		webdriver.findElement(By.xpath("//*[@id=\"friendactivity_right_column\"]/div/div[3]/div[5]/a/span")).click();
		
		webdriver.findElement(By.xpath("/html/body/div[1]/div[7]/div[3]/div/div[2]/div[1]/a[2]/span")).click();
		
		Thread.sleep(3000);
		
		webdriver.findElement(By.xpath("//*[@id=\"application_root\"]/div/div[4]/div/div[1]/div/input")).click();
		
		webdriver.findElement(By.xpath("//*[@id=\"application_root\"]/div/div[4]/div/div[1]/div/input")).sendKeys("aksanto");
		
		Thread.sleep(2000);
		
		webdriver.findElement(By.xpath("//*[@id=\"application_root\"]/div/div[4]/div/div[1]/div/input")).sendKeys(Keys.ENTER);
		
	}	
	
	@After
	public void Teardown_stage() {
		webdriver.close();
		
	}
}
