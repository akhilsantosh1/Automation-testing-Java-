package steam;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Product_preferences {
static WebDriver webdriver;    // A webdriver is created and assigned a variable to the webdriver 
	
	@Before
	public void setup_stage() throws InterruptedException {   // The setup stage is used to open the browser and to locate the chrome driver in local storage
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");  // Locates the chrome driver in the local storage.
	    webdriver = new ChromeDriver();
	}
	
	@Test
	public void test_stage() throws InterruptedException   // The test phase executes all the commands that need to automate the test case.
	{
		webdriver.navigate().to("https://store.steampowered.com/");   //Webdriver navigates to the website using the url given in input.
		
		Login_module();  //Login module is called to automate the login process of the website.
		
		webdriver.findElement(By.xpath("//*[@id=\"account_pulldown\"]")).click();  // Used to open the profile in the website.
		
		webdriver.findElement(By.xpath("//*[@id=\"account_dropdown\"]/div/a[4]")).click();
		
		Thread.sleep(2000);
		
		webdriver.findElement(By.xpath("//*[@id=\"main_content\"]/div[2]/div[2]/blockquote[1]/label[1]")).click(); // the commands edits the user preferences on the items that he is seeing in the websie
		
		Thread.sleep(3000);
		
		webdriver.findElement(By.xpath("//*[@id=\"main_content\"]/div[2]/div[2]/blockquote[1]/label[1]/input")).click();
		
	}	
	
	@After
	public void Teardown_stage() { //This phase closes the browser and the automation of the browser.
		webdriver.close();  // COmmand that lets the browser to close and ends the automation.
	}
	
public static void Login_module() throws InterruptedException   //Login module is used to run the login automation of the website and can be called anytime
	{
		webdriver.findElement(By.xpath("//*[@id=\"global_action_menu\"]/a")).click();
		
		webdriver.findElement(By.xpath("//*[@id=\"input_username\"]")).sendKeys("samsanto1234"); //Sends the username of the website to the system
		
		webdriver.findElement(By.xpath("//*[@id=\"input_password\"]")).sendKeys("Akhil@1234"); //Sends the password of the website to the system
		
		webdriver.findElement(By.xpath("//*[@id=\"login_btn_signin\"]/button/span")).click();
		
		Thread.sleep(2000); // Sleep is used to pause the automation for a certain time used to let the website load the page
	}
}
