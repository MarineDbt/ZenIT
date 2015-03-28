
package BL.Front;
import java.util.ArrayList;

import BL.DataClasses.*;
import BL.TechnicalClasses.AbstractPersistenceHandlerFactory;
import BL.TechnicalClasses.ContributorManager;

/**
 * 
 * 
 * @poseidon-object-id [I395d852m14bf5118266mm5f5c]
 */
public class ContributorFacade {

	protected ContributorManager contributorManager;
	

	public ContributorFacade(AbstractPersistenceHandlerFactory factory, User currentUser) {
		this.contributorManager = new ContributorManager(factory, currentUser);
	}
	
	/**
	 * <p>Does ...</p>
	 * 
	 * @param User 
	 * @return Contributor
	 */
	
    public Contributor getProfile(String id_contributor) {        
        return this.contributorManager.getProfile(id_contributor);
    } 
	
/**
 * <p>Does ...</p>
 * 
 * @param Contributor 
 * @param String 
 * @return boolean
 */
    public boolean modifyDescription(User currentUser, String newDescription) {        
        return this.contributorManager.modifyDescription(currentUser, newDescription);
    } 

/**
 * <p>Does ...</p>
 * 
 * @param String 
 * @return ArrayList<ArrayList<String>>
 */
    public ArrayList<ArrayList<String>> getPlanning(String id_contributor) {        
        return this.contributorManager.getPlanning(id_contributor);
    } 
 }
