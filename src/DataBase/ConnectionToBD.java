package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class ConnectionToBD {
	
	Connection connect;
	PreparedStatement preparedStatement;
	ResultSet resultSet;
	String url = "zenitdatabase.cowyokdz4iwa.us-west-2.rds.amazonaws.com:3306";
	String user ="zenit";
	String password ="zenitdatabase";
	
	public ConnectionToBD(){
		
	}
	  
	public boolean checkPassword(String id, String psw) throws Exception{
		
		try{
		connect = DriverManager.getConnection(url, user, psw);
		preparedStatement = connect.prepareStatement("select * from user where id = ? and psw = ?");
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
	public void insertUser (String firstname, String lastname, String street, int PC, String city, String phone, String email, String id, String psw) throws Exception{
		try{
			connect = DriverManager.getConnection(url, user, psw);
			preparedStatement = connect.prepareStatement("insert into USER values(?,?,?,?,?,?,?,?,?)");
			preparedStatement.setString(1,firstname);
			preparedStatement.setString(2,lastname);
			preparedStatement.setString(3,street);
			preparedStatement.setInt(4,PC);
			preparedStatement.setString(5,city);
			preparedStatement.setString(6,phone);
			preparedStatement.setString(7,email);
			preparedStatement.setString(8,id);
			preparedStatement.setString(9,psw);		
			preparedStatement.executeUpdate();
			}
			catch (Exception e){
				throw e;
			}
			this.close();
	}
	  private void close() {
		    try {
		      if (resultSet != null) {
		        resultSet.close();
		      }

		      if (preparedStatement != null) {
		        preparedStatement.close();
		      }

		      if (connect != null) {
		        connect.close();
		      }
		    } catch (Exception e) {

		    }
		  }

}
