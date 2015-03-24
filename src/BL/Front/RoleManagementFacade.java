
package BL.Front;

import java.util.ArrayList;
import java.util.Collection;

import BL.ModelClasses.*;
import BL.TechnicalClasses.*;

/**
 * 
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm5585]
 */
public class RoleManagementFacade {
	
/**
 * <p>Represents ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm5586]
 */
    private ContributorManager contributorManager;

/**
 * <p>Represents ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm5587]
 */
    private SupervisorManager supervisorManager;

/**
 * <p>Represents ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm55a4]
 */
    private UserManager userManager;

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm5588]
 * @param user 
 * @return 
 */
    /* Constructors */
    
    public RoleManagementFacade(AbstractPersistenceHandlerFactory factory)
    {
    	contributorManager = new ContributorManager(factory);
    	supervisorManager = new SupervisorManager(factory);    	
    }
    
    public boolean createContributor(User user, String myDescription) {        
        
    	/* Delegate method call to contributorManager */

    	return contributorManager.createContributor(user, myDescription);
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm558d]
 * @param user 
 * @return 
 */
    public boolean createSupervisor(User user) {        
        
    	/* Delegate method call to contributorManager */

    	return supervisorManager.createSupervisor(user);
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm5592]
 * @param contributor 
 * @return 
 */
    public boolean removeContributor(User contributor) {        
    	
    	/* Delegate method call to contributorManager */

    	return contributorManager.removeContributor(contributor);
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm5597]
 * @param supervisor 
 * @return 
 */
    public boolean removeSupervisor(User supervisor) {        
    	
    	/* Delegate method call to contributorManager */

    	return supervisorManager.removeSupervisor(supervisor);
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm559c]
 * @return 
 */
    public ArrayList<User> getAllContributors() {        
    	
    	/* Delegate method call to contributorManager */

    	return contributorManager.readAllContributors();
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm55a0]
 * @return 
 */
    public ArrayList<User> getAllSupervisors() {        
    	
    	/* Delegate method call to contributorManager */

    	return supervisorManager.readAllSupervisors();
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm55a5]
 * @return 
 */
    public Collection<BL.ModelClasses.User> getAllUsers() {        
        // your code here
        return null;
    } 
 }
