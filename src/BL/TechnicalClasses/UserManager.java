package BL.TechnicalClasses;
import java.util.HashMap;

import BL.DataClasses.Product;
import BL.DataClasses.User;
import ConnectionToPersistence.AbstractPersistenceHandlerFactory;
import ConnectionToPersistence.UserAbstractPersistenceHandler;
import ConnectionToPersistence.UserQueryHandler;


/**
 * 
 * @author Elie
 *
 */
public class UserManager {
	
	/* Attributs */
	private UserFactory userFactory;
	private UserAbstractPersistenceHandler userPersistenceHandler;
	private UserExceptionHandler userExceptionHandler;
	protected HashMap<String,User> users;
	public User currentUser;
	
	/* Methods */
	public UserManager() {
		this.userPersistenceHandler = AbstractPersistenceHandlerFactory.createFactory().createUserPersistenceHandler();
		this.users= new HashMap();
		this.userFactory = new UserFactory();
		this.currentUser = null;
	}
	public boolean login(String id, String pwd){
		
		boolean result = false;
		try {
			System.out.println("a");
			result = userPersistenceHandler.checkPassword(id, pwd);
			System.out.println("b");
		} catch (Exception e) {
			e.printStackTrace();
		} 
		 if (result){
			 System.out.println("c");
			 loadUser(id);
			 currentUser=users.get(id);
		 }
		 
		 return result;
	}
	 public boolean register(String firstname, String lastname, String street, String PC, String city, String phone, String email, String id, String pwd){
		 
		boolean result = false;
		
		try {
			result = this.userPersistenceHandler.insertUser(firstname, lastname, street, PC, city, phone, email, id, pwd);
		} catch (Exception e) {
			// TODO : Error Handling
		}
		
		return result;
	 }
	 private void loadUser(String id){
		 users.put(id,userPersistenceHandler.lookForUserInfo(id));
	 }


	 /**
	  * <p>Does ...</p>
	  * 
	  * @poseidon-object-id [I395d852m14bf5118266mm6bd7]
	  * @param User 
	  */
	     public User consultProfile(User currentUser) {
			return currentUser;        
	         // your code here
	     } 
	 /**
	  * <p>Does ...</p>
	  * 
	  * @poseidon-object-id [I395d852m14bf5118266mm6bb2]
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
	  * @poseidon-object-id [I395d852m14bf5118266mm6aaf]
	  * @param User 
	  * @return 
	  */
	     public boolean deleteProfile(User currentUser) {        
	         // your code here
	         return false;
	     } 	
}
