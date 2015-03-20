package BL.TechnicalClasses;

import BL.DataClasses.User;

public class UserFactory {

	
	public User createUser(String firstname, String lastname, String street,
			String PC, String city, String phone, String email, String id,
			String pwd) {
		
		User newUser = new User(firstname,lastname, street, PC, city, phone, email, id, pwd);
		return newUser;
		
		
	}

}
