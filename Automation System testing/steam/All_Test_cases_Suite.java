package steam;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)

@SuiteClasses   //This Test suite runs all the test cases.
({
	Add_item_to_cart.class,       // The test case java files are given.
	Product_preferences.class, 
	Search_games.class 
	
	})


public class All_Test_cases_Suite {

}
