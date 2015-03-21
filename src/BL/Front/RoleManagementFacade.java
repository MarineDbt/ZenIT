
package BL.Front;

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
    public boolean createContributor(User user) {        
        
    	/* Delegate method call to contributorManager */
    	
    	myContributor

    	return contributorManager.createContributor(user);
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm558d]
 * @param user 
 * @return 
 */
    public BL.ModelClasses.Accessory createSupervisor(BL.ModelClasses.User user) {        
        // your code here
        return null;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm5592]
 * @param contributor 
 * @return 
 */
    public boolean removeContributor(BL.ModelClasses.Contributor contributor) {        
        // your code here
        return false;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm5597]
 * @param supervisor 
 * @return 
 */
    public boolean removeSupervisor(BL.ModelClasses.Supervisor supervisor) {        
        // your code here
        return false;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm559c]
 * @return 
 */
    public Collection<BL.ModelClasses.Contributor> getAllContributors() {        
        // your code here
        return null;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm55a0]
 * @return 
 */
    public Collection<BL.ModelClasses.Supervisor> getAllSupervisors() {        
        // your code here
        return null;
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
