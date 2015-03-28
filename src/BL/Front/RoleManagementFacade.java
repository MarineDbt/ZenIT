
package BL.Front;

import java.util.ArrayList;
import java.util.Collection;

import BL.ModelClasses.*;
import BL.TechnicalClasses.*;

/**
 * Facade used for all methods concerning rights management 
 * @author Mégane Martinez
 * 
 * 
 *
 */
public class RoleManagementFacade {
	
/**
 * <p>Represents the manager called to do the business logic for contributors rights</p>
 * 
 * 
 */
    private ContributorManager contributorManager;

/**
 * <p>Represents the manager called to do the business logic for supervisors rights</p>
 * 
 * 
 */
    private SupervisorManager supervisorManager;


/**
 * <p>Constructor of the class need an AbstractPersistenceHandlerFactory to give to the manager</p>
 * 
 * @param factory need by the ContributorManager 
 *
 */
    /* Constructors */
    
    public RoleManagementFacade(AbstractPersistenceHandlerFactory factory)
    {
    	contributorManager = new ContributorManager(factory);
    	supervisorManager = new SupervisorManager(factory);    	
    }
    
/**
* <p> Gives the role of contributor to a user and added the contributor's description</p>
* 
* @param the user that will became contributor
* @return true if giving the role succeeded, false otherwise
*/ 
    
    
    public boolean createContributor(User user, String myDescription) {        
        
    	/* Delegate method call to contributorManager */

    	return contributorManager.createContributor(user, myDescription);
    } 

/**
 * <p>Gives the role of supervisor to a user that is a member</p>
 * 
 * 
 * @param user, the user that will became a supervisor 
 * @return true if giving the role succeeded, false otherwise
 */
    public boolean createSupervisor(User user) {        
        
    	/* Delegate method call to contributorManager */

    	return supervisorManager.createSupervisor(user);
    } 

/**
 * <p>Remove the right of being a contributor</p>
 * 
 *
 * @param contributor, the user that will no longer be a contributor
 * @return true if removing the role succeeded, false otherwise
 */
    public boolean removeContributor(User contributor) {        
    	
    	/* Delegate method call to contributorManager */

    	return contributorManager.removeContributor(contributor);
    } 

/**
 * <p>Remove the right of being a supervisor</p>
 * 
 * 
 * @param supervisor, the user that will no longer be a supervisor
 * @return true if removing the role succeeded, false otherwise
 */
    public boolean removeSupervisor(User supervisor) {        
    	
    	/* Delegate method call to contributorManager */

    	return supervisorManager.removeSupervisor(supervisor);
    } 

/**
 * <p>Get all users that have contributors role</p>
 * 
 * 
 * @return An array list of all the users that have the contributor role
 */
    public ArrayList<User> getAllContributors() {        
    	
    	/* Delegate method call to contributorManager */

    	return contributorManager.readAllContributors();
    } 

/**
 * <p>Get all the users that have the supervisor role</p>
 * 
 * 
 * @return an arraylist of all the users that have the supervisor role
 */
    public ArrayList<User> getAllSupervisors() {        
    	
    	/* Delegate method call to contributorManager */

    	return supervisorManager.readAllSupervisors();
    } 
 }
