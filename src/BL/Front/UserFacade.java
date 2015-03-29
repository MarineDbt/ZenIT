
package BL.Front;

import BL.DataClasses.*;
import BL.TechnicalClasses.ShoppingManager;
import BL.TechnicalClasses.UserManager;

/**
 * Used to access the functionalities about users in a more abstract way, hiding the data
 * 
 * @author Elie GALLET
 * @version 1.0
 * @date March 2015
 * 
 */
public class UserFacade {
	
	/*###########*/
	/* Attributs */
	/*###########*/
	
	/**
	 * Unique delegate used by every methods of the facade
	 * 
	 * @see UserManager
	 */
	private UserManager userManager;
	
	/**
	 * Basic constructor
	 */
	public UserFacade(){
		this.userManager = new UserManager();
	}
	/**
	 * @see UserManager
	 */
	public User getCurrentUser(){
		return this.userManager.getCurrentUser();
	}
	/**
	 * @see UserManager
	 */
	public void register(String firstname, String lastname, String street, String PC, String city, String phone, String email, String id, String pwd){
		userManager.register(firstname, lastname, street, PC, city, phone, email, id, pwd);
	}
	/**
	 * @see UserManager
	 */
    public boolean login(String id, String pwd) {        
        return userManager.login(id, pwd);
    } 
    /**
	 * @see UserManager
	 */
    public User consultProfile(User currentUser) {        
    	return userManager.consultProfile(currentUser);
    } 
    /**
	 * @see UserManager
	 */
    public boolean modifyProfile(String firstname, String lastname, String street, String PC, String city, String phone, String email, String id, String pwd) {        
        return userManager.modifyProfile(firstname, lastname, street, PC, city, phone, email, id, pwd);
    } 
    /**
	 * @see UserManager
	 */
    public boolean deleteProfile( User currentUser) {        
        return userManager.deleteProfile(currentUser);
    }
    /**
	 * @see UserManager
	 */
    public boolean isUser(String id) {
		return userManager.isUser(id);
	}
    /**
	 * @see UserManager
	 */
	public boolean checkPassword(String id, String pwd) {
		return userManager.checkPassword(id, pwd);
	}
	
 }
