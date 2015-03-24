
package BL.TechnicalClasses;

import java.util.ArrayList;
import java.util.Collection;

import BL.ModelClasses.*;

/**
 * 
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm4689]
 */
public abstract class ContributorPersistenceHandler {
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm468a]
 * @param user 
 * @return 
 */
	
	
	
	
    public abstract User insertContributor(User user, String myDescription);
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm468f]
 * @param contributor 
 * @return 
 */
    public abstract boolean deleteContributor(User contributor);
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm4694]
 * @return 
 */
    public abstract ArrayList<User> selectAllContributors();
}


