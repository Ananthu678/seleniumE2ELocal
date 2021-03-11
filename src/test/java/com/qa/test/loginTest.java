package com.qa.test;



import org.testng.annotations.Test;

import com.qa.page.AnnouncementsPage;
import com.qa.page.LoginPage;

public class loginTest extends BaseClass {

	   
	  @Test (priority=1)
	  public void LoginPage() {
		  
		   LoginPage lp = new LoginPage(driver);
		   String username = "thala.ananthu@gmail.com";
		   String pwd ="274041A*";
		   lp.setusername(username);
		   lp.setpassword(pwd);
		   lp.login();
		   
		   
		    
	  }
	  
	  @Test (priority=2)
	  public void clickProfile() {
		  AnnouncementsPage ap=new AnnouncementsPage(driver);
		  ap.click();
		  
	  }
}
