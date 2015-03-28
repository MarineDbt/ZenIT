
package BL.Front;

import BL.DataClasses.*;
import BL.TechnicalClasses.UserManager;

/**
 * Used to access the functionalities about users in a more abstract way, hiding the data
 * 
 * @author Elie GALLET
 * @version 1.0
 * @date march 2015
 * 
 */
public class UserFacade {
	
	/*
	 * To be able to login and register
	 */
	
	private UserManager userManager;
	
	
	public UserFacade(){
		this.userManager = new UserManager();
	}
	
	public User getCurrentUser(){
		return this.userManager.getCurrentUser();
	}

	public void register(String firstname, String lastname, String street, String PC, String city, String phone, String email, String id, String pwd){
		userManager.register(firstname, lastname, street, PC, city, phone, email, id, pwd);
	}

    public boolean login(String id, String pwd) {        
        return userManager.login(id, pwd);
    } 

    public User consultProfile(User currentUser) {        
    	return userManager.consultProfile(currentUser);
    } 

    public boolean modifyProfile(String firstname, String lastname, String street, String PC, String city, String phone, String email, String id, String pwd) {        
        return userManager.modifyProfile(firstname, lastname, street, PC, city, phone, email, id, pwd);
    } 

    public boolean deleteProfile( User currentUser) {        
        return userManager.deleteProfile(currentUser);
    }

    public boolean isUser(String id) {
		return userManager.isUser(id);
	}

	public boolean checkPassword(String id, String pwd) {
		return userManager.checkPassword(id, pwd);
	}
	
 }
