
package ConnectionToPersistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import BL.DataClasses.*;
import BL.TechnicalClasses.UserFactory;

/**
 * Makes and executes the queries relative to User
 * 
 * @author Elie GALLET
 * @version 1.0
 * @date March 2015
 * @see User
 * @see UserManager
 * 
 */
public abstract class UserAbstractPersistenceHandler {

	protected UserFactory userFactory;


	public abstract boolean checkPassword(String id,  String pwd) throws SQLException;

	/**
	 * Deletes a user
	 * 
	 * @param id : identifier of the user
	 * @return a boolean, whether the deletion worked or not
	 */
	public abstract boolean deleteUser(String id);

	/**
	 * Updates a user
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
	 * @return a boolean, whether the update worked or not
	 */
	public abstract boolean updateUser(String firstname, String lastname, String street, String PC, String city, String phone, String email, String id, String pwd);

	/**
	 * Looks for a user from the persistence
	 * 
	 * @param id : identifier of the user
	 * @return the user selected
	 */
	public abstract User selectUser(String id);   

	/**
	 * Inserts a user in the persistence
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
	 * @return a boolean, whether the insertion worked or not
	 */
	public abstract boolean insertUser(String firstname, String lastname, String street, String PC, String city, String phone, String email, String id, String pwd);
	public abstract boolean isMember(String id);
	public abstract boolean isContributor(String id);
	public abstract boolean isSupervisor(String id);
	public abstract boolean isAdministrator(String id);
	public abstract boolean isUser(String id);

}