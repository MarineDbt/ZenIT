
package BL.Front;

import java.util.HashMap;
import BL.ApplicationClasses.UserManager;
import BL.DataClasses.*;

/**
 * 
 * @author Elie Gallet
 *
 */
public class UserFacade {
	
	/*
	 * To be able to login and register
	 */
	
	protected UserManager userManager;
	
	
	public UserFacade(){
		this.userManager = new UserManager();
	}

	public void register(String firstname, String lastname, String street, String PC, String city, String phone, String email, String id, String pwd){
		userManager.register(firstname, lastname, street, PC, city, phone, email, id, pwd);
	}
	 /*load persistance relative to user*/
	 public void loadData(){
		 //TODO
	 }
 }
