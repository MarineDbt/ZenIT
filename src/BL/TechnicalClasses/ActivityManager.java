
package BL.TechnicalClasses;

import java.util.ArrayList;

import BL.DataClasses.*;


/**
 * 
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m2c00]
 */
public class ActivityManager {

	public ActivityPersistenceHandler activityPH;
	
	//Constructeur
	
	public ActivityManager(AbstractPersistenceHandlerFactory factory) {
	
		activityPH = factory.createActivityPersistenceHandler();
		
	}
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m2bff]
 * @param nameActivity 
 * @param currentSupervisor 
 * @return 
 */
    public ArrayList<Activity> getActivities(String nameActivity, Supervisor currentSupervisor) {        
 
		return activityPH.lookForActivities(nameActivity, currentSupervisor);
      
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m2bf9]
 * @param currentActivity 
 * @return 
 */
    public ArrayList<Contributor> getContributors(Activity currentActivity) {        
       
        return activityPH.lookForContributors(currentActivity);
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m2bf4]
 * @param oldActivity 
 * @param newName 
 * @param newShortDescription 
 * @param newDetailledDescription 
 * @return 
 */
    public boolean modifyActivity(Activity oldActivity, String newName, String newShortDescription, String newDetailledDescription) {        
        
        return activityPH.updateActivity(oldActivity, newName, newShortDescription, newDetailledDescription);
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m2bec]
 * @param currentActivity 
 * @return 
 */
    public ArrayList<Member> getMembers(Activity currentActivity) {        
        
        return activityPH.lookForMembers(currentActivity);
    } 
    
    public boolean addActivity(String nameActivity, User currentUser, String shortDescription, String detailledDescription) {
		return this.activityPH.addActivity(nameActivity, currentUser, shortDescription, detailledDescription);
	}

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m2be7]
 * @param currentActivity 
 * @return 
 */
    public ArrayList<Event> getEvents(Activity currentActivity) {        
        
        return activityPH.lookForEvents(currentActivity);
    } 
 }
