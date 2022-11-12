package testcases;


import java.util.HashMap;
import java.util.Hashtable;



import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Home_Page;
import pages.Login_Page;
import utilities.Utilities;


public class LoginPage_Test {
	//public static WebDriver driver;
	
	
	
	//Enter Valid Credentials
	@Test(dataProviderClass= Utilities.class, dataProvider="dp")
	public void EnterValidCredentials(Hashtable<String, String> data) throws InterruptedException {
		
		
		Home_Page home=new Home_Page();
		Login_Page login= new Login_Page();
		
		home.login_link();
		Thread.sleep(2000);
		login.doLogin(data.get("username"), data.get("password"));
		login.login_link();
		Thread.sleep(2000);
		
	
		
	}
	
	
	
}
