
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
    public ArrayList<Activity> lookForActivities(User currentUser) {  
    	
    	/* Declarations and initializations */
    	ResultSet result;
    	ArrayList<Activity> myActivities = new ArrayList<Activity>();
    	
    	/* Query execution delegated to ConnectionToMySQL */
    	result = ConnectionToMySQL.requestSelectQuery("Select * from Activity where `id_supervisor`='"+1+"';");
    	
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
    	result = ConnectionToMySQL.requestInsertQuery("insert into Activity (activity_name,short_description,detailled_description,id_supervisor) values('"+nameActivity+"','"+shortDescription+"','"+detailledDescription+"','"+1+"');");
    	return (result == 1);
	}
    
    
    public boolean deleteActivity(Activity currentActivity) {
    	/* Declarations and initializations */
    	int result = 0;

    	/* Query execution delegated to ConnectionToMySQL */
    	result = ConnectionToMySQL.requestInsertQuery( "delete from Activity where activity_name = '"+currentActivity.getName()+"';");
    	
    	/* Return value */
    	return (result == 1);
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
    	
    	int result = 0;
    	result = ConnectionToMySQL.requestInsertQuery("update Activity set activity_name= '"+newName+"', short_description = '"+newShortDescription+"',detailled_description = '"+newDetailledDescription+"' where activity_name = '"+oldActivity.getName()+"';");
    	return (result == 1);

    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m3246]
 * @param currentActivity 
 * @return 
 */
    public ArrayList<User> lookForMembers(Activity currentActivity) {        

    	/* Declarations and initializations */
    	ResultSet result;
    	ResultSet result2;
    	ArrayList<User> userlist = new ArrayList<User>();
    	
    	/* Query execution delegated to ConnectionToMySQL */
    	result = ConnectionToMySQL.requestSelectQuery("Select * from MemberActivity where `activity_name`= '"+currentActivity.getName()+"';");
    	
    	try {
			while (result.next()) {
			     String id_user = result.getString(1);
			     result2 = ConnectionToMySQL.requestSelectQuery("Select * from User where `id`= '"+id_user+"';");
			     while (result2.next()) {
			    	 String firstname = result2.getString(2);
			    	 String lastname = result2.getString(3);
			    	 String street = result2.getString(4);
			    	 String pc = result2.getString(5);
			    	 String city = result2.getString(6);
			    	 String phone  = result2.getString(7);
			    	 User user = new User(id_user, firstname, lastname, street, pc, city, phone);
			    	 userlist.add(user);
			     }
			     
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
        return userlist;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m3241]
 * @param currentActivity 
 * @return 
 */
    public ArrayList<Event> lookForEvents(Activity currentActivity) {        
    	/* Declarations and initializations */
    	ResultSet result;
    	ResultSet result2;
    	ResultSet result3;
    	
    	ArrayList<Event> myEvents = new ArrayList<Event>();
    	
    	/* Query execution delegated to ConnectionToMySQL */
  
    	result = ConnectionToMySQL.requestSelectQuery("Select * from Event where activity_name='"+currentActivity.getName()+"';");
    	try {
			while (result.next()) {
			     String name = result.getString(2);
			     String id_contributor = result.getString(3);
			     String description = result.getString(4);
			     String id_room = result.getString(5);
			     int id_timeSlot = result.getInt(6);
			     
			     result2 = ConnectionToMySQL.requestSelectQuery("Select * from TimeSlot where id_timeslot='"+id_timeSlot+"';");
			     result2.next();
			     int hdeb = result2.getInt(2);
			     int mindeb = result2.getInt(3);
			     int hfin = result2.getInt(4);
			     int minfin = result2.getInt(5);
			     TimeSlot timeSlot = new TimeSlot(hdeb,mindeb,hfin,minfin);
			     Room room = new Room(id_room);
			     
			     result3 = ConnectionToMySQL.requestSelectQuery("Select * from User where `id`='"+id_contributor+"';");
			     result3.next();
			     String firstname = result3.getString(2);
		    	 String lastname = result3.getString(3);
		    	 String street = result3.getString(4);
		    	 String pc = result3.getString(5);
		    	 String city = result3.getString(6);
		    	 String phone  = result3.getString(7);
	
		    	 User user = new User(id_contributor, firstname, lastname, street, pc, city, phone);
			     Event event = new Event(name, user, description,room,timeSlot);
			     myEvents.add(event);
			 }
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
        return myEvents;
    } 
 }
