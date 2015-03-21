
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
    public Contributor insertContributor(User user) {        
        
    	/* Declarations and initializations */
    	int result = 0;
		
    	/* Delegate query execution to ConnectionToMySQL */
    	
		result = ConnectionToMySQL.requestInsertQuery("insert into User (firstname,lastname,street,PC,city,phone,email,id,pwd) values('"+firstname+"','"+lastname+"','"+street+"','"+PC+"','"+city+"','"+phone+"','"+email+"','"+id+"','"+encryptedPwd+"');");
		
		if (result==1)
		{
			Contributor
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
