
package BL.TechnicalClasses;

import java.util.Collection;

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
    public BL.DataClasses.Contributor insertContributor(BL.DataClasses.User user);
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm468f]
 * @param contributor 
 * @return 
 */
    public boolean updateContributor(BL.DataClasses.Contributor contributor);
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm4694]
 * @return 
 */
    public Collection<BL.DataClasses.Contributor> selectAllContributors();
}

