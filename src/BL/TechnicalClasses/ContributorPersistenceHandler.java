
package BL.TechnicalClasses;

import java.util.ArrayList;

import BL.DataClasses.Contributor;
import BL.DataClasses.Event;
import BL.DataClasses.User;

/**
 * 
 * 
 * @poseidon-object-id [Im4bef336fm14c19425b18mm4063]
 */
public abstract class ContributorPersistenceHandler {

	/**
	 * <p>Does ...</p>
	 * 
	 * @param String
	 * @return Contributor
	 */
	public abstract Contributor getProfile(String id_contributor);

	/**
	 * <p>Does ...</p>
	 * 
	 * @param User
	 * @param String
	 * @return boolean
	 */
	public abstract boolean modifyDescription(User currentUser, String newDescription);

	/**
	 * <p>Does ...</p>
	 * 
	 * @param User 
	 * @return ArrayList<ArrayList<String>>
	 */
	public abstract ArrayList<ArrayList<String>> getPlanning(String id_contributor);

}
