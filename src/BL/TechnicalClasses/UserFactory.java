package BL.TechnicalClasses;

import BL.DataClasses.Product;
import BL.DataClasses.User;

/**
 * Used to create instances of User
 * 
 * @author Elie GALLET
 * @version 1.0
 * @date March 2015
 * @see User
 * 
 */
public class UserFactory {

	/**
	 * creates a User
	 * 
	 * @param firstname
	 * @param lastname
	 * @param street
	 * @param PC
	 * @param city
	 * @param phone
	 * @param email
	 * @param id : identifier of the user
	 * @param pwd : password of the user
	 * @return the user that have been created
	 */
	public User createUser(String firstname, String lastname, String street,
			String PC, String city, String phone, String email, String id,
			String pwd) {
		
		User newUser = new User(firstname,lastname, street, PC, city, phone, email, id, pwd);
		return newUser;
	}
}
