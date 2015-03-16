
package BL.Front;

import java.util.ArrayList;

import BL.DataClasses.*;

/**
 * 
 * 
 * @poseidon-object-id [I3921c69fm14bffe267fdmm49ea]
 */
public class ActivityFacade {

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I3921c69fm14bffe267fdmm497e]
 * @param nameActivity 
 * @param currentSupervisor 
 * @return 
 */
    public ArrayList<Activity> getActivities(String nameActivity, Supervisor currentSupervisor) {        
        // your code here
        return null;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I3921c69fm14bffe267fdmm497a]
 * @param currentActivity 
 * @return 
 */
    public ArrayList<Contributor> getContributors(Activity currentActivity) {        
        // your code here
        return null;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I3921c69fm14bffe267fdmm4976]
 * @param oldActivity 
 * @param newName 
 * @param newShortDescription 
 * @param newDetailledDescription 
 * @return 
 */
    public boolean modifyActivity(Activity oldActivity, String newName, String newShortDescription, String newDetailledDescription) {        
        // your code here
        return false;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I3921c69fm14bffe267fdmm4972]
 * @param currentActivity 
 * @return 
 */
    public ArrayList<Member> getMembers(Activity currentActivity) {        
        // your code here
        return null;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12mm1a24]
 * @param currentActivity 
 * @return 
 */
    public ArrayList<Event> getEvents(Activity currentActivity) {        
        // your code here
        return null;
    } 
 }
