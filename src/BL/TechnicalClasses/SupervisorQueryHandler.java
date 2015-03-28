
package BL.TechnicalClasses;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import BL.ModelClasses.*;
import BL.TechnicalClasses.SupervisorFactory;
import ConnectionToDB.ConnectionToMySQL;

/**
 * 
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm4613]
 */
public class SupervisorQueryHandler extends SupervisorPersistenceHandler {

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm4614]
 * @param user 
 * @return 
 */
    public User insertSupervisor(User user) {        
    	
    	/* Declarations and initializations */
    	int result = 0;
		
    	/* Delegate query execution to ConnectionToMySQL */
    	
		result = ConnectionToMySQL.requestInsertQuery("insert into Supervisor (id) values('"+user.getId()+"');");
		
		/* Testing if query succeeded */
		
		if (result==1)
		{
			Supervisor mySupervisor = new Supervisor();
			Member myMember = new Member(mySupervisor);
			user.setMember(myMember);
			return user;
		}
		else
		{
			return null;
		}
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm4619]
 * @param supervisor 
 * @return 
 */
    public boolean deleteSupervisor(User supervisor) {        
    	
    	/* Declarations and initializations */
    	int result = 0;
		
    	/* Delegate query execution to ConnectionToMySQL */
    	
		result = ConnectionToMySQL.requestInsertQuery("delete from Supervisor where id = '"+supervisor.getId()+"';");
		
		/* Return value */
		
		return (result == 1);
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm461e]
 * @return 
 */
    public ArrayList<User> selectAllSupervisors() {        
    	
    	/* Declarations and initializations */
    	ResultSet result;
    	ArrayList<User> supervisors = new ArrayList<User>();
		
    	/* Delegate query execution to ConnectionToMySQL */
    	
		result = ConnectionToMySQL.requestSelectQuery("select s.id, firstname, lastname from Supervisor s, User u where s.id = u.id;");
		
		/* Creation of User list */
		
		try{
		while(result.next())
		{
				String id_user = result.getString(1);
				String firstname = result.getString(2);
				String lastname = result.getString(3);
				Supervisor mySupervisor = new Supervisor();
				Member myMember = new Member(mySupervisor);
				User myUser = new User(id_user, firstname, lastname, myMember);
				supervisors.add(myUser);
		}
				
		} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		
		/* Return value */	
		
		return supervisors;
    
    } 
 }
