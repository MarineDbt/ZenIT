
package BL.TechnicalClasses;

import java.util.Collection;

import BL.ModelClasses.*;

/**
 * 
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm4689]
 */
public interface ContributorPersistenceHandler {
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm468a]
 * @param user 
 * @return 
 */
	
	
	
	
    public Contributor insertContributor(User user, String myDescription);
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm468f]
 * @param contributor 
 * @return 
 */
    public boolean updateContributor(BL.ModelClasses.Contributor contributor);
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm4694]
 * @return 
 */
    public Collection<BL.ModelClasses.Contributor> selectAllContributors();
}


