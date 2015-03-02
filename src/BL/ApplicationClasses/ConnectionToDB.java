package BL.ApplicationClasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionToDB {
	
	Connection connection;
	PreparedStatement preparedStatement;
	ResultSet resultSet;
	String url;
	String user;
	String password;
	
	public ConnectionToDB(){
		url = "zenitdatabase.cowyokdz4iwa.us-west-2.rds.amazonaws.com:3306";
		user ="zenit";
		password ="zenitdatabase";
	}
	public Boolean connect() {
	        try {
	            Class.forName("com.mysql.jdbc.Driver").newInstance();
	            this.connection = DriverManager.getConnection("jdbc:mysql//" + this.url, this.user, this.password);
	            return true;
	        } catch (SQLException ex) {
	            Logger.getLogger(ConnectionToDB.class.getName()).log(Level.SEVERE, null, ex);
	        } catch (ClassNotFoundException ex) {
	            Logger.getLogger(ConnectionToDB.class.getName()).log(Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            Logger.getLogger(ConnectionToDB.class.getName()).log(Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            Logger.getLogger(ConnectionToDB.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        return false;
	    }
	public boolean checkPassword(String id, String psw) throws Exception{
		
		try{
		this.connect();
		preparedStatement = connection.prepareStatement("select * from user where id = ? and psw = ?");
		preparedStatement.setString(1,id);
		preparedStatement.setString(2,psw);
		resultSet = preparedStatement.executeQuery();
		}
		catch (Exception e){
			throw e;
		}
		this.close();
		resultSet.last();
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
	public void readUser(String id){
		// TODO
	}
	public void insertUser (String firstname, String lastname, String street, int PC, String city, String phone, String email, String id, String psw) throws Exception{
		EncryptionHandler encryptionHandler = new EncryptionHandler();
		try{
			connection = DriverManager.getConnection(url, user, psw);
			preparedStatement = connection.prepareStatement("insert into USER values(?,?,?,?,?,?,?,?,?)");
			preparedStatement.setString(1,firstname);
			preparedStatement.setString(2,lastname);
			preparedStatement.setString(3,street);
			preparedStatement.setInt(4,PC);
			preparedStatement.setString(5,city);
			preparedStatement.setString(6,phone);
			preparedStatement.setString(7,email);
			preparedStatement.setString(8,encryptionHandler.encryptPassword(id));
			preparedStatement.setString(9,psw);		
			preparedStatement.executeUpdate();
			}
			catch (Exception e){
				throw e;
			}
			this.close();
	}
	public void deleteUser (String id){
		// TODO
	}
	  private void close() {
		    try {
		      if (resultSet != null) {
		        resultSet.close();
		      }

		      if (preparedStatement != null) {
		        preparedStatement.close();
		      }

		      if (connection != null) {
		        connection.close();
		      }
		    } catch (Exception e) {

		    }
		  }

}
