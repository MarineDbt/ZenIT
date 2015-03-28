
package BL.TechnicalClasses;
import java.util.ArrayList;
import java.util.Collection;

import BL.ModelClasses.User;
import BL.TechnicalClasses.SupervisorPersistenceHandler;

/**
 * 
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm45c8]
 */
public class SupervisorManager {

/**
 * <p>Represents ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm45c9]
 */
    private ArrayList<User> supervisors;

    private SupervisorPersistenceHandler mySupervisorPersistenceHandler;
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm45ca]
 * @param user 
 * @return 
 */
    
    /* Constructors */
    public SupervisorManager(AbstractPersistenceHandlerFactory factory)
    {
    	mySupervisorPersistenceHandler = factory.createSupervisorPersistenceHandler();
    	supervisors = new ArrayList <User>();
    }
    
    public boolean createSupervisor(User user) {        

    	/* Declarations and initializations */
    	
    	User mySupervisor = mySupervisorPersistenceHandler.insertSupervisor(user);
    	    	
    	/* Adding to contributors */
    	if (mySupervisor !=null)
    	{
    		supervisors.add(mySupervisor);
    	}
    	
    	/* Return value */
    	return (mySupervisor != null);
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm45cf]
 * @param supervisor 
 * @return 
 */
    public boolean removeSupervisor(User supervisor) {        
    	
    	/* Declarations and initializations */
    	
    	return mySupervisorPersistenceHandler.deleteSupervisor(supervisor);
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm45d4]
 * @return 
 */
    public ArrayList<User> readAllSupervisors() {        
    	
    	/* Declarations and initializations */
    	
    	return mySupervisorPersistenceHandler.selectAllSupervisors();
    	
    } 
 }
