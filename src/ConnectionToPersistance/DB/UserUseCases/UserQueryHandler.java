package ConnectionToPersistance.DB.UserUseCases;
import java.sql.ResultSet;

import BL.DataClasses.User;
import BL.TechnicalClasses.PasswordEncryptionHandler;
import ConnectionToPersistance.DB.MySQL.ConnectionToMySQL;




/**
 * 
 * @author Elie
 *
 */
public class UserQueryHandler {
	

	public boolean checkPassword(String id, String pwd) throws Exception{
		
		ResultSet resultSet;
		
		resultSet=ConnectionToMySQL.requestSelectQuery("select * from user where id = '"+id+"' and pwd = "+pwd);
		
		if (resultSet.getRow()== 0){
			return false;
		}
		else if (resultSet.getRow()==1){
			return true;
		}
		else{
		 throw new Exception();
		}
	}
	
	public boolean insertUser (String firstname, String lastname, String street, String PC, String city, String phone, String email, String id, String pwd) throws Exception{
		
		PasswordEncryptionHandler encryptionHandler = new PasswordEncryptionHandler();
		String encryptedPwd;
		int result = 0;
		encryptedPwd=encryptionHandler.encryptPassword(pwd);
		
		result = ConnectionToMySQL.requestInsertQuery("insert into User (firstname,lastname,street,PC,city,phone,email,id,pwd) values('"+firstname+"','"+lastname+"','"+street+"','"+PC+"','"+city+"','"+phone+"','"+email+"','"+id+"','"+encryptedPwd+"');");
		
		return (result==1);
	}
	public void deleteUser (String id){
		// TODO
	}

	/**
	 * <p>Does ...</p>
	 * 
	 * @poseidon-object-id [I395d852m14bf5118266mm6734]
	 * @param User 
	 */
	    public User selectUser(User currentUser) {
			return currentUser;        
	        // your code here
	    } 

	/**
	 * <p>Does ...</p>
	 * 
	 * @poseidon-object-id [I395d852m14bf5118266mm670f]
	 * @param User 
	 * @return 
	 */
	    public boolean updateUser(User currentUser) {        
	        // your code here
	        return false;
	    } 
}
