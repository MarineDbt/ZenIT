
package BL.TechnicalClasses;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import BL.DataClasses.*;
import ConnectionToDB.ConnectionToMySQL;

/**
 * 
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m325a]
 */
public class ActivityQueryHandler extends ActivityPersistenceHandler {

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m3259]
 * @param nameActivity 
 * @param currentSupervisor 
 * @return 
 */
    public ArrayList<Activity> lookForActivities(String nameActivity, Supervisor currentSupervisor) {  
    	
    	/* Declarations and initializations */
    	ResultSet result;
    	ArrayList<Activity> myActivities = new ArrayList<Activity>();
    	
    	/* Query execution delegated to ConnectionToMySQL */
    	result = ConnectionToMySQL.requestSelectQuery("Select * from Activity;");
    	
    	try {
			while (result.next()) {
			     String name = result.getString(1);
			     String shortDescription = result.getString(2);
			     String detailledDescription = result.getString(3);
			     Activity activity = new Activity(name, shortDescription, detailledDescription);
			     myActivities.add(activity);
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
        return myActivities;
    } 
    
    public boolean addActivity(String nameActivity, User currentUser, String shortDescription, String detailledDescription) {
    	int result = 0;
    	result = ConnectionToMySQL.requestInsertQuery("insert into Activity (activity_name,short_description,detailled_description,id_supervisor) values('"+nameActivity+"','"+shortDescription+"','"+detailledDescription+"','1');");
    	return (result == 1);
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
    	oldActivity = new Activity("Yogas"); // a enlever
    	
    	int result = 0;
    	result = ConnectionToMySQL.requestInsertQuery("update Activity set activity_name= '"+newName+"', short_description = '"+newShortDescription+"',detailled_description = '"+newDetailledDescription+"' where `activity_name` = '"+oldActivity.getName()+"');");
    	return (result == 1);

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
