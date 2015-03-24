
package BL.TechnicalClasses;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import BL.ModelClasses.*;
import BL.TechnicalClasses.ContributorFactory;
import ConnectionToDB.ConnectionToMySQL;

/**
 * 
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm4604]
 */
public class ContributorQueryHandler extends ContributorPersistenceHandler {

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm4605]
 * @param user 
 * @return 
 */
    public User insertContributor(User user, String myDescription) {        
        
    	/* Declarations and initializations */
    	int result = 0;
		
    	/* Delegate query execution to ConnectionToMySQL */
    	
		result = ConnectionToMySQL.requestInsertQuery("insert into Contributor (description,id_user) values('"+myDescription+"','"+user.getId()+"');");
		
		/* Testing if query succeeded */
		
		if (result==1)
		{
			Contributor myContributor = new Contributor(myDescription);
			user.setContributor(myContributor);
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
 * @poseidon-object-id [I29f51818m14c28f165ddmm460a]
 * @param contributor 
 * @return 
 */
    public boolean deleteContributor(User contributor) {        
    	
    	/* Declarations and initializations */
    	int result = 0;
		
    	/* Delegate query execution to ConnectionToMySQL */
    	
		result = ConnectionToMySQL.requestInsertQuery("delete from Contributor where id_user = '"+contributor.getId()+"';");
		
		/* Return value */
		
		return (result == 1);
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm460f]
 * @return 
 */
    public ArrayList<User> selectAllContributors() {        
    	
    	/* Declarations and initializations */
    	ResultSet result;
    	ArrayList<User> contributors = new ArrayList<User>();
		
    	/* Delegate query execution to ConnectionToMySQL */
    	
		result = ConnectionToMySQL.requestSelectQuery("select id, firstname, lastname, description from Contributor, User where id = id_user;");
		
		/* Creation of User list */
		
		try{
		while(result.next())
		{
				String id_user = result.getString(1);
				String firstname = result.getString(2);
				String lastname = result.getString(3);
				String description = result.getString(4);
				Contributor myContributor = new Contributor(description);
				User myUser = new User(id_user, firstname, lastname, myContributor);
				contributors.add(myUser);
		}
				
		} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		/* Return value */	
		
		return contributors;
    } 
 }
