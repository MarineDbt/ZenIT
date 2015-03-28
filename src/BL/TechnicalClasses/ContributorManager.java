
package BL.TechnicalClasses;
import java.util.ArrayList;

import BL.DataClasses.*;
import BL.TechnicalClasses.AbstractPersistenceHandlerFactory;
import BL.TechnicalClasses.ContributorManager;

/**
 * 
 * 
 * @poseidon-object-id [I395d852m14bf5118266mm5f5c]
 */
public class ContributorManager {
	
	private ContributorPersistenceHandler myContributorPersistenceHandler;
	

	public ContributorManager(AbstractPersistenceHandlerFactory factory, User currentUser) {
		myContributorPersistenceHandler = factory.createContributorPersistenceHandler();
	}

	/**
	 * <p>Does ...</p>
	 * 
	 * @param String
	 * @return Contributor
	 */
	public Contributor getProfile(String id_contributor) {
		return this.myContributorPersistenceHandler.getProfile(id_contributor);
	}
	
	
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I395d852m14bf5118266mm5f0f]
 * @param User 
 * @param String
 * @return boolean
 */
    public boolean modifyDescription(User currentUser, String newDescription) {        
        return this.myContributorPersistenceHandler.modifyDescription(currentUser, newDescription);
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I395d852m14bf5118266mm5eea]
 * @param String
 * @return ArrayList<ArrayList<String>>
 */
    public ArrayList<ArrayList<String>> getPlanning(String id_contributor) {        
        // your code here
        return this.myContributorPersistenceHandler.getPlanning(id_contributor);
    } 
 }