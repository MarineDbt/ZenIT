package BL.TechnicalClasses;
import java.sql.SQLException;
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
	private UserExceptionHandler userExceptionHandler; // TODO : error handling
	protected HashMap<String,User> users;
	public User currentUser;
	
	/* Methods */
	public UserManager() {
		this.userPersistenceHandler = AbstractPersistenceHandlerFactory.getFactory().createUserPersistenceHandler();
		this.users= new HashMap();
		this.userFactory = new UserFactory();
		this.currentUser = null;
	}
	public boolean login(String id, String pwd){
		
		boolean result = false;
		result = checkPassword(id, pwd);
		if (result){
			 loadUser(id);
			 currentUser=users.get(id);
			 
		 }
		 
		 return result;
	}
	public boolean checkPassword(String id, String pwd){
		try {
			return userPersistenceHandler.checkPassword(id, pwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
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
		 User user = userPersistenceHandler.selectUser(id);
		 System.out.println(user.getId());
		 users.put(id,user);
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
	    	 boolean result = false;
	 		
	 		try {
	 			result = this.userPersistenceHandler.updateUser(firstname, lastname, street, PC, city, phone, email, id, pwd);
	 		} catch (Exception e) {
	 			// TODO : Error Handling
	 		}
	 		
	 		return result;
	     } 

	     public boolean deleteProfile(User currentUser) {        
	    	 boolean result = false;
		 		
		 		try {
		 			result = this.userPersistenceHandler.deleteUser(currentUser.getId());
		 		} catch (Exception e) {
		 			// TODO : Error Handling
		 		}
		 		
		 		return result;
	     } 
	    public boolean isMember(User user) {
	 		return this.userPersistenceHandler.isMember(user.getId());
	 	}
	 	public boolean isContributor(User user) {
	 		return this.userPersistenceHandler.isContributor(user.getId());
	 	}
	 	public boolean isAdministrator(User user) {
	 		return this.userPersistenceHandler.isAdministrator(user.getId());
	 	}
	 	public boolean isSupervisor(User user) {
	 		return this.userPersistenceHandler.isSupervisor(user.getId());
	 	}
		public boolean isUser(String id) {
			return this.userPersistenceHandler.isUser(id);
		}
		public User getCurrentUser() {
			return currentUser;
			
		}
}
