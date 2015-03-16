
package BL.TechnicalClasses;

import java.util.ArrayList;

import BL.DataClasses.*;

/**
 * 
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m325a]
 */
public class ActivityQueryHandler extends ActivityPersistanceHandler {

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m3259]
 * @param nameActivity 
 * @param currentSupervisor 
 * @return 
 */
    public ArrayList<Activity> lookForActivities(String nameActivity, Supervisor currentSupervisor) {        
        // your code here
        return null;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m3253]
 * @param currentActivity 
 * @return 
 */
    public ArrayList<Contributor> lookForContributors(Activity currentActivity) {        
        // your code here
        return null;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m324e]
 * @param oldActivity 
 * @param newName 
 * @param newShortDescription 
 * @param newDetailledDescription 
 * @return 
 */
    public boolean updateActivity(Activity oldActivity, String newName, String newShortDescription, String newDetailledDescription) {        
        // your code here
        return false;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m3246]
 * @param currentActivity 
 * @return 
 */
    public ArrayList<Member> lookForMembers(Activity currentActivity) {        
        // your code here
        return null;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m3241]
 * @param currentActivity 
 * @return 
 */
    public ArrayList<Event> lookForEvents(Activity currentActivity) {        
        // your code here
        return null;
    } 
 }
