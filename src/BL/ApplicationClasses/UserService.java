package BL.ApplicationClasses;

import BL.DataClasses.User;

public class UserService {
	
	
	public void login(String id, String psw){
		 ConnectionToDB connect=new ConnectionToDB();
		 try {
			if (connect.checkPassword(id,psw)){
				 // TODO load relative persistance
			 }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	
	 public User register(String firstname, String lastname, String street, 
			 String PC, String city, String phone, String email, String id, String psw){
		 
		 ConnectionToDB connect=new ConnectionToDB();
		 User newUser = null;
		 try{
			 System.out.println(PC);
		
		 connect.insertUser(firstname, lastname, street,PC, city, phone, email, id, psw);
		 }
		 catch (Exception e){
			 e.printStackTrace();
		 }
		 finally {
			 UserFactory userFactory = new UserFactory();
			 userFactory.createUser(firstname, lastname, street, PC, city, phone, email, id, psw);
		 }
		return newUser;
		 
	 }
}
