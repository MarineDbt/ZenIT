
package BL.TechnicalClasses;

import java.util.ArrayList;
import java.util.Collection;

import BL.ModelClasses.*;

/**
 * 
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm469a]
 */
public abstract class SupervisorPersistenceHandler {
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm469b]
 * @param user 
 * @return 
 */
    public abstract User insertSupervisor(User user);
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm46a0]
 * @param supervisor 
 * @return 
 */
    public abstract boolean deleteSupervisor(User supervisor);
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm46a5]
 * @return 
 */
    public abstract ArrayList<User> selectAllSupervisors();
}


