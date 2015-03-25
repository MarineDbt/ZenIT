package ConnectionToPersistence;
import java.sql.ResultSet;
import java.sql.SQLException;

import BL.DataClasses.User;
import BL.TechnicalClasses.UserFactory;
import BL.TechnicalClasses.UserPasswordEncryptionHandler;




/**
 * 
 * @author Elie
 *
 */
public class UserQueryHandler extends UserAbstractPersistenceHandler{
	

	public boolean checkPassword(String id, String pwd) throws SQLException{
		
		ResultSet resultSet = null;
		
		UserPasswordEncryptionHandler encryptionHandler = new UserPasswordEncryptionHandler();
		String encryptedPwd;
		encryptedPwd=encryptionHandler.encryptPassword(pwd);
		
		try {
			resultSet=ConnectionToMySQL.requestSelectQuery("select * from User where id = '"+id+"' and pwd = '"+encryptedPwd+"';");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println((resultSet.getRow()));
			resultSet.last();
			if (resultSet.getRow()== 0){
				return false;
			}
			else{
				return true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	public boolean isMember(String id){
			
			ResultSet resultSet = null;
			
			try {
				resultSet=ConnectionToMySQL.requestSelectQuery("select * from Member where id = '"+id+"';");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				System.out.println((resultSet.getRow()));
				resultSet.last();
				if (resultSet.getRow()== 0){
					return false;
				}
				else{
					return true;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
	}
	public boolean isSupervisor(String id){
		
		ResultSet resultSet = null;
		
		try {
			resultSet=ConnectionToMySQL.requestSelectQuery("select * from Supervisor where id = '"+id+"';");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println((resultSet.getRow()));
			resultSet.last();
			if (resultSet.getRow()== 0){
				return false;
			}
			else{
				return true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	public boolean isContributor(String id){
		
		ResultSet resultSet = null;
		
		try {
			resultSet=ConnectionToMySQL.requestSelectQuery("select * from Contributor where id = '"+id+"';");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println((resultSet.getRow()));
			resultSet.last();
			if (resultSet.getRow()== 0){
				return false;
			}
			else{
				return true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
}
	public boolean isAdministrator(String id){
		
		ResultSet resultSet = null;
		
		try {
			resultSet=ConnectionToMySQL.requestSelectQuery("select * from Administrator where id = '"+id+"';");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println((resultSet.getRow()));
			resultSet.last();
			if (resultSet.getRow()== 0){
				return false;
			}
			else{
				return true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
}
	
	public boolean insertUser(String firstname, String lastname, String street, String PC, String city, String phone, String email, String id, String pwd){
		
		UserPasswordEncryptionHandler encryptionHandler = new UserPasswordEncryptionHandler();
		String encryptedPwd;
		int result = 0;
		encryptedPwd=encryptionHandler.encryptPassword(pwd);
		
		result = ConnectionToMySQL.requestInsertQuery("insert into User (firstname,lastname,street,PC,city,phone,email,id,pwd) values('"+firstname+"','"+lastname+"','"+street+"','"+PC+"','"+city+"','"+phone+"','"+email+"','"+id+"','"+encryptedPwd+"');");
		
		return (result==1);
	}
	public void deleteUser (String id){
		// TODO
	}


    public boolean updateUser(String firstname, String lastname, String street, String PC, String city, String phone, String email, String id, String pwd) {        
    	UserPasswordEncryptionHandler encryptionHandler = new UserPasswordEncryptionHandler();
		String encryptedPwd;
		int result = 0;
		encryptedPwd=encryptionHandler.encryptPassword(pwd);
		
		result = ConnectionToMySQL.requestUpdateQuery("Update User SET firstname = '"+firstname+"', lastname = '"+lastname+"', street = '"+street+"', PC = '"+PC+"', city = '"+city+"', phone = '"+phone+"', email = '"+email+"', pwd = '"+encryptedPwd+"' WHERE id = '"+id+"';");
		
		return (result==1);
    }

	@Override
	public boolean deleteUser(User currentUser) {
		// TODO Auto-generated method stub
		return false;
	}

	public User selectUser(String id) {
		
		ResultSet resultSet = null;

		try {
			String query = "select * from User where id = '"+id+"';";
			resultSet=ConnectionToMySQL.requestSelectQuery(query);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			
			resultSet.first();
			String firstname = resultSet.getString(resultSet.findColumn("firstname"));
			System.out.println(firstname);
			String lastname = resultSet.getString(resultSet.findColumn("lastname"));
			System.out.println(lastname);
			String street = resultSet.getString(resultSet.findColumn("street"));
			System.out.println(street);
			String pc = resultSet.getString(resultSet.findColumn("PC"));
			System.out.println(pc);
			String city = resultSet.getString(resultSet.findColumn("city"));
			System.out.println(city);
			String phone = resultSet.getString(resultSet.findColumn("phone"));
			System.out.println(phone);
			String email = resultSet.getString(resultSet.findColumn("email"));
			System.out.println(email);
			String pwd = resultSet.getString(resultSet.findColumn("pwd"));
			System.out.println(pwd);
			UserFactory userFactory=new UserFactory();
			System.out.println("lol");
			User user = userFactory.createUser(firstname, lastname, street, pc, city, phone, email, id, pwd);
			System.out.println("lol2");
			return user;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
