
package BL.TechnicalClasses;
import java.util.Collection;

import BL.ModelClasses.*;
import BL.TechnicalClasses.ContributorFactory;
import ConnectionToDB.ConnectionToMySQL;

/**
 * 
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm4604]
 */
public class ContributorQueryHandler implements ContributorPersistenceHandler {

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm4605]
 * @param user 
 * @return 
 */
    public Contributor insertContributor(User user, String myDescription) {        
        
    	/* Declarations and initializations */
    	int result = 0;
		
    	/* Delegate query execution to ConnectionToMySQL */
    	
		result = ConnectionToMySQL.requestInsertQuery("insert into Contributor (description,id_user) values('"+myDescription+"','"+user.getId()+"';");
		
		/* Testing if query succeeded */
		
		if (result==1)
		{
			Contributor myContributor = new Contributor(user.getId(), myDescription);
			return myContributor;
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
    public boolean updateContributor(BL.ModelClasses.Contributor contributor) {        
        // your code here
        return false;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm460f]
 * @return 
 */
    public Collection<BL.ModelClasses.Contributor> selectAllContributors() {        
        // your code here
        return null;
    } 
 }
