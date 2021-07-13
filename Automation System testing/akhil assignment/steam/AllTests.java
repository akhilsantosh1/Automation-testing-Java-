package steam;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)

@SuiteClasses
({ 
	
	add_friend.class,
	addcart.class, 
	community.class, 
	edit_profile.class, 
	language.class, 
	login.class,
	news.class, 
	preference.class, 
	search.class, 
	support.class 
		
})
public class AllTests

{

}
