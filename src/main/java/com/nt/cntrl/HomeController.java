package com.nt.cntrl;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

	//method to get index page
	
	//method to signup form
	
	//method to process sign up form
	   //read username and password and store it in login table
	
	
	//method to get sign in form
	
	//method to process signin form
		//read username and password and cross check with login table
		//if correct
			//create session
			//return result.jsp and show some message(login success) and some links at left side(inbox,draft,logout)
		//if wrong user
			//return signIn page
	
	
	//method to process inbox messages
		//check user from session
		//user is present in session
			//goto database and fetch all the inbox messages from inbox table for this user
			//return inbox.jsp which will show all this messages and ad one link(logout)
	
		//if user is null
			//return login page
	
	//same thing for draft
	
	//logout method
		//destroy the session and return back to login
	
}
