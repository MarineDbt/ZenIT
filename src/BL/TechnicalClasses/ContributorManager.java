
package BL.TechnicalClasses;
import java.util.ArrayList;
import java.util.Collection;

import BL.ModelClasses.*;
import BL.TechnicalClasses.ContributorPersistenceHandler;

/**
 * 
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm45b8]
 */
public class ContributorManager {

/**
 * <p>Represents ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm45b9]
 */
    private ArrayList<User> contributors;
    
    private ContributorPersistenceHandler contributorPersistenceHandler;

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm45ba]
 * @param user 
 * @return 
 */
    /* Constructors */
    
    public ContributorManager(AbstractPersistenceHandlerFactory factory)
    {
    	contributorPersistenceHandler = factory.createContributorPersistenceHandler();
    	contributors = new ArrayList<User>();
    }
    
    public boolean createContributor(User user, String myDescription) {        
    	
    	/* Declarations and initializations */
    	
    	User myContributor = contributorPersistenceHandler.insertContributor(user, myDescription);
    	    	
    	/* Adding to contributors */
    	if (myContributor !=null)
    	{
    		contributors.add(myContributor);
    	}
    	
    	/* Return value */
    	return (myContributor != null);
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm45bf]
 * @param contributor 
 * @return 
 */
    public boolean removeContributor(User contributor) {        
    	
    	/* Declarations and initializations */
    	
    	return contributorPersistenceHandler.deleteContributor(contributor);
    	    	
    } 
    

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm45c4]
 * @return 
 */
    public ArrayList<User> readAllContributors() {        
       
    	/* Declarations and initializations */
    	
    	return contributorPersistenceHandler.selectAllContributors();
    }


 }
