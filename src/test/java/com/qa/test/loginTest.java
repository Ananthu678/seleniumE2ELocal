package com.qa.test;



import org.testng.annotations.Test;


import com.qa.page.LoginPage;

public class loginTest extends BaseClass {

	   
	  @Test
	  public void LoginPage() {
		  
		   LoginPage lp = new LoginPage(driver);
		   String username = "thala.ananthu@gmail.com";
		   String pwd ="274041A*";
		   lp.setusername(username);
		   lp.setpassword(pwd);
		   lp.login();
		   
		   
		    
	  }
	  
}
