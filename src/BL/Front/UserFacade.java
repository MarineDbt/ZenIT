
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
	
	public UserManager userManager;
	
	
	public UserFacade(){
		this.userManager = new UserManager();
	}

	public void register(String firstname, String lastname, String street, String PC, String city, String phone, String email, String id, String pwd){
		userManager.register(firstname, lastname, street, PC, city, phone, email, id, pwd);
	}
	 /*load persistence relative to user*/
	public void loadData(){
		 //TODO
	}
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I395d852m14bf5118266mm7055]
 * @param String 
 * @param String 
 * @return 
 */
    public boolean login(String id, String pwd) {        
        return userManager.login(id, pwd);
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I395d852m14bf5118266mm700b]
 * @param User 
 */
    public  void consultProfile(User currentUser) {        
        // your code here
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I395d852m14bf5118266mm6b2b]
 * @param User 
 * @param String 
 * @param .. 
 * @return 
 */
    public boolean modifyProfile(String firstname, String lastname, String street, String PC, String city, String phone, String email, String id, String pwd) {        
        // your code here
        return false;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I395d852m14bf5118266mm6b06]
 * @param User 
 * @return 
 */
    public boolean deleteProfile( User currentUser) {        
        // your code here
        return false;
    } 
 }
