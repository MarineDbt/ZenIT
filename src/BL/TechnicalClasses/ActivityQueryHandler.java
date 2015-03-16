
package QueryHandler;

/**
 * 
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m325a]
 */
public class ActivityQueryHandler extends QueryHandler.ActivityPersistanceHandler {

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m3259]
 * @param nameActivity 
 * @param currentSupervisor 
 * @return 
 */
    public Facade.ArrayList_Activity_ lookForActivities(String nameActivity, Factory.Supervisor currentSupervisor) {        
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
    public Facade.ArrayList_Contributor_ lookForContributors(Facade.Activity currentActivity) {        
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
    public boolean updateActivity(Facade.Activity oldActivity, String newName, String newShortDescription, String newDetailledDescription) {        
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
    public Facade.ArrayList_Member_ lookForMembers(Facade.Activity currentActivity) {        
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
    public Facade.ArrayList_Event_ lookForEvents(Facade.Activity currentActivity) {        
        // your code here
        return null;
    } 
 }
