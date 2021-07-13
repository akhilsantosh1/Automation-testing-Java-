package steam;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_item_to_cart {
static WebDriver webdriver;  // A webdriver is created and assigned a variable to the webdriver 
	
	@Before
	public void setup_stage() throws InterruptedException {   // The setup stage is used to open the browser and to locate the chrome driver in local storage
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe"); // Locates the chrome driver in the local storage.
	    webdriver = new ChromeDriver();  
	}
	
	@Test
	public void test_stage() throws InterruptedException    // The test phase executes all the commands that need to automate the test case.
	{
		webdriver.navigate().to("https://store.steampowered.com/");   //Webdriver navigates to the website using the url given in input.
		
		Login_module();  //Login module is called to automate the login process of the website.
		
		webdriver.findElement(By.xpath("//*[@id=\"store_nav_search_term\"]")).click();
		
		webdriver.findElement(By.xpath("//*[@id=\"store_nav_search_term\"]")).sendKeys("Rocket Ski Racing"); // Enters the items that need to be added to the cart
		
		webdriver.findElement(By.xpath("//*[@id=\"store_search_link\"]/img")).click();
		
		webdriver.findElement(By.xpath("//*[@id=\"search_resultsRows\"]/a[1]/div[2]/div[1]/span")).click();
		
		webdriver.findElement(By.xpath("//*[@id=\"btn_add_to_cart_104421\"]/span")).click(); // the commands adds the item selected above to the cart
		
	}	
	
	@After
	public void Teardown_stage() {  //This phase closes the browser and the automation of the browser.
		webdriver.close();  // COmmand that lets the browser to close and ends the automation.
	}
	
public static void Login_module() throws InterruptedException     //Login module is used to run the login automation of the website and can be called anytime
	{
		webdriver.findElement(By.xpath("//*[@id=\"global_action_menu\"]/a")).click();
		
		webdriver.findElement(By.xpath("//*[@id=\"input_username\"]")).sendKeys("samsanto1234"); //Sends the username of the website to the system
		
		webdriver.findElement(By.xpath("//*[@id=\"input_password\"]")).sendKeys("Akhil@1234"); //Sends the password of the website to the system
		
		webdriver.findElement(By.xpath("//*[@id=\"login_btn_signin\"]/button/span")).click();
		
		Thread.sleep(2000);   // Sleep is used to pause the automation for a certain time used to let the website load the page
	}
}
