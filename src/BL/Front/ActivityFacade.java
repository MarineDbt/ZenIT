
package BL.Front;

import java.util.ArrayList;

import BL.TechnicalClasses.AbstractPersistenceHandlerFactory;
import BL.TechnicalClasses.ActivityManager;
import BL.DataClasses.*;

/**
 * 
 * 
 * @poseidon-object-id [I3921c69fm14bffe267fdmm49ea]
 */
public class ActivityFacade {
	
	public ActivityManager activitymanager;

	
	//Constructeur
	
	public ActivityFacade(AbstractPersistenceHandlerFactory factory){
		this.activitymanager = new ActivityManager(factory);
	}
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I3921c69fm14bffe267fdmm497e]
 * @param nameActivity 
 * @param currentSupervisor 
 * @return 
 */
	
	public boolean addActivity(String nameActivity, User currentUser, String shortDescription, String detailledDescription) {
		return this.activitymanager.addActivity(nameActivity, currentUser, shortDescription, detailledDescription);
		
	}
	
			
    public ArrayList<Activity> getActivities(User currentUser) {        
        return activitymanager.getActivities(currentUser);
  
    }
    
    public boolean deleteActivity(Activity currentActivity) {
    	return this.activitymanager.deleteActivity(currentActivity);
    }

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I3921c69fm14bffe267fdmm497a]
 * @param currentActivity 
 * @return 
 */
    public ArrayList<Contributor> getContributors(Activity currentActivity) {        
       return activitymanager.getContributors(currentActivity);
        
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
        return activitymanager.modifyActivity(oldActivity, newName, newShortDescription, newDetailledDescription);
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I3921c69fm14bffe267fdmm4972]
 * @param currentActivity 
 * @return 
 */
    public ArrayList<User> getMembers(Activity currentActivity) {        
        return activitymanager.getMembers(currentActivity);
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12mm1a24]
 * @param currentActivity 
 * @return 
 */
    public ArrayList<Event> getEvents(Activity currentActivity) {        
        return activitymanager.getEvents(currentActivity);
    } 
 }
