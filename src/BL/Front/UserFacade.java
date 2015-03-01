
package BL.Front;

import BL.DataModel.User;
import DataBase.ConnectionToBD;

/**
 * 
 * 
 */
public class UserFacade {
	
	User currentUser;
	
	public void login(String id, String psw){
		 ConnectionToBD connect=new ConnectionToBD();
		 try {
			if (connect.checkPassword(id,psw)){
				 this.loadData();
			 }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 public void register(String firstname, String lastname, String street, int PC, String city, String phone, String email, String id, String psw){
		 ConnectionToBD connect=new ConnectionToBD();
		 try{
		 connect.insertUser(firstname, lastname, street, PC, city, phone, email, id, psw);
		 }
		 catch (Exception e){
			 e.printStackTrace();
		 }
		 
	 }
	 
	 //charge la persistance
	 public void loadData(){
		 //TODO
	 }
 }
