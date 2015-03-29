package BL.TechnicalClasses;
import java.sql.SQLException;
import java.util.HashMap;

import BL.DataClasses.Notification;
import BL.DataClasses.Product;
import BL.DataClasses.User;
import ConnectionToPersistence.AbstractPersistenceHandlerFactory;
import ConnectionToPersistence.UserAbstractPersistenceHandler;
import ConnectionToPersistence.UserQueryHandler;


/**
 * Used to create instances of User
 * 
 * @author Elie GALLET
 * @version 1.0
 * @date March 2015
 * @see User
 * 
 */
public class UserManager {

	/*###########*/
	/* Attributs */
	/*###########*/

	private UserAbstractPersistenceHandler userPersistenceHandler;
	private UserExceptionHandler userExceptionHandler; // TODO : error handling

	protected HashMap<String,User> users;

	public User currentUser;

	/*#########*/
	/* Methods */
	/*#########*/

	/**
	 * Basic Consctructor
	 */
	public UserManager() {
		this.userPersistenceHandler = AbstractPersistenceHandlerFactory.getFactory().createUserPersistenceHandler();
		this.users= new HashMap();
		this.currentUser = null;
	}

	/**
	 * Tries to log in with the referred identifiers
	 * 
	 * @param id : specified user name 
	 * @param pwd : specified password 
	 * @return a boolean, whether the login worked or not
	 */
	public boolean login(String id, String pwd){

		boolean result = false;
		result = checkPassword(id, pwd);
		if (result){
			loadUser(id);
			currentUser=users.get(id);			 
		}

		return result;
	}
	/**
	 * Checks the validity of the password for an identifier given
	 * 
	 * @param id
	 * @param pwd
	 * @return a boolean, whether the password is valid or not
	 */
	public boolean checkPassword(String id, String pwd){
		try {
			return userPersistenceHandler.checkPassword(id, pwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	/**
	 * Registers a user
	 * 
	 * @param firstname
	 * @param lastname
	 * @param street
	 * @param PC
	 * @param city
	 * @param phone
	 * @param email
	 * @param id
	 * @param pwd
	 * @return a boolean, whether the user has been registered or not
	 */
	public boolean register(String firstname, String lastname, String street, String PC, String city, String phone, String email, String id, String pwd){

		boolean result = false;

		try {
			result = this.userPersistenceHandler.insertUser(firstname, lastname, street, PC, city, phone, email, id, pwd);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO : Error Handling
		}

		return result;
	}
	
	/**
	 * Loads the user and its attributes in memory
	 * 
	 * @param id : identifier of the user
	 */
	private void loadUser(String id){
		User user = userPersistenceHandler.selectUser(id);
		user.isAdministrator = this.userPersistenceHandler.isAdministrator(user.getId());
		user.isContributor = this.userPersistenceHandler.isContributor(user.getId());
		user.isSupervisor = this.userPersistenceHandler.isSupervisor(user.getId());
		user.isMember = this.userPersistenceHandler.isMember(user.getId());
		users.put(id,user);
	}

	/*Unused*/
	public User consultProfile(User currentUser) {
		return currentUser;        
		// your code here
	} 
	
	/**
	 * Modifies the profile of a user
	 * 
	 * @param firstname
	 * @param lastname
	 * @param street
	 * @param PC
	 * @param city
	 * @param phone
	 * @param email
	 * @param id : identifier of the user
	 * @param pwd
	 * @return a boolean, whether the user has been modified or not
	 */
	public boolean modifyProfile(String firstname, String lastname, String street, String PC, String city, String phone, String email, String id, String pwd) {        
		boolean result = false;

		try {
			result = this.userPersistenceHandler.updateUser(firstname, lastname, street, PC, city, phone, email, id, pwd);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO : Error Handling
		}

		return result;
	} 
	/**
	 * Deletes a user
	 * 
	 * @param currentUser : the current user
	 * @return a boolean, whether the user has been modified or not
	 */
	public boolean deleteProfile(User currentUser) {        
		boolean result = false;

		try {
			result = this.userPersistenceHandler.deleteUser(currentUser.getId());
		} catch (Exception e) {
			e.printStackTrace();
			// TODO : Error Handling
		}

		return result;
	} 
	/**
	 * Tells whether the identifier given corresponds to a user or not
	 * 
	 * @param id : an identifier
	 * @return a boolean, whether the identifier exists or not
	 */
	public boolean isUser(String id) {
		return this.userPersistenceHandler.isUser(id);
	}
	/**
	 * Returns the current user
	 * 
	 * @return the current user
	 */
	public User getCurrentUser() {
		return currentUser;

	}
}
