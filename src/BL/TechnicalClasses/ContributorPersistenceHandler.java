
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
	
    public abstract Contributor getProfile(User currentContributor);

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im4bef336fm14c19425b18mm4577]
 * @param Contributor 
 * @return 
 */
    public abstract boolean modifyDescription(Contributor currentContributor);

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im4bef336fm14c19425b18mm446b]
 * @param Contributor 
 * @return 
 */
    public abstract ArrayList<Event> getPlanning(Contributor currentContributor );

 }
