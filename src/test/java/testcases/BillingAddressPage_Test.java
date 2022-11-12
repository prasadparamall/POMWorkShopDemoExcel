package testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import pages.BillingAddress_Page;
import utilities.Utilities;



public class BillingAddressPage_Test {
	
	
	@Test(priority = 3, dataProviderClass=Utilities.class, dataProvider="dp")
	public void BillingAdd(Hashtable<String,String> data) throws Exception {
		BillingAddress_Page billing = new BillingAddress_Page();
		billing.checkout();
		billing.BillingAddressdropdown();
		billing.BillingAdd(data.get("fname"), data.get("lname"), data.get("email"), data.get("city"), data.get("address1"), data.get("address2"), data.get("zipcode"), data.get("phoneno"));
	
	}

}
