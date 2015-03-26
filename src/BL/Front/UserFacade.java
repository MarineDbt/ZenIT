
package BL.Front;

import BL.DataClasses.*;
import BL.TechnicalClasses.UserManager;

/**
 * 
 * @author Elie Gallet
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

    public  void consultProfile(User currentUser) {        
        // your code here
    } 

    public boolean modifyProfile(String firstname, String lastname, String street, String PC, String city, String phone, String email, String id, String pwd) {        
        // your code here
        return false;
    } 

    public boolean deleteProfile( User currentUser) {        
        // your code here
        return false;
    }

	
    public boolean isMember(User user) {
		return userManager.isMember(user);
	}
	public boolean isUser(String id) {
		return userManager.isUser(id);
	}

	public boolean checkPassword(String id, String pwd) {
		return userManager.checkPassword(id, pwd);
	}

	public boolean isContributor(User user) {
		return userManager.isContributor(user);
	}
	
	public boolean isAdministrator(User user) {
		return userManager.isAdministrator(user);
	}

	public boolean isSupervisor(User user) {
		return userManager.isSupervisor(user);
	}
	
 }
