
package BL.TechnicalClasses;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import BL.DataClasses.*;
import ConnectionToDB.ConnectionToMySQL;

/**
 * 
 * 
 * @poseidon-object-id [Im4bef336fm14c19425b18mm45d0]
 */
public class ContributorQueryHandler extends ContributorPersistenceHandler {

	/**
	 * <p>Does ...</p>
	 * 
	 * @param String
	 * @return Contributor
	 */
	
    public Contributor getProfile(String id_contributor) {        
        
    	/* Declarations and initializations */
    	ResultSet result;
    	String description = new String();
    	
   	 	/* Query execution delegated to ConnectionToMySQL */
    	result = ConnectionToMySQL.requestSelectQuery("Select description from Contributor where id = '" + id_contributor +"';");
    	
    	
		try {
    		while (result.next()) {
    			description = result.getString(result.findColumn("description"));
    		}
    		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		Contributor contrib = new Contributor(id_contributor,description);
    	
		return contrib;
    } 

	/**
	 * <p>Does ...</p>
	 * 
	 * @param User
	 * @param String
	 * @return boolean
	 */
    public boolean modifyDescription(User currentUser, String newDescription) {        
    	
    	/* Declarations and initializations */
    	int result = 0;
    	
    	/* Query execution delegated to ConnectionToMySQL */
    	result = ConnectionToMySQL.requestInsertQuery( "update Contributor set description = '" + newDescription + "' where id = "+ currentUser.getID() +";");
    	
    	/* Return value */
    	return (result == 1);
    } 

	/**
	 * <p>Does ...</p>
	 * 
	 * @param User
	 * @return ArrayList<ArrayList<String>>
	 */
    public ArrayList<ArrayList<String>> getPlanning(String id_contributor) {  
    	
    	 /* Declarations and initializations */
    	ResultSet result;
    	ArrayList<ArrayList<String>> myEvents = new ArrayList<ArrayList<String>>();
    	
    	 /* Query execution delegated to ConnectionToMySQL */
    	result = ConnectionToMySQL.requestSelectQuery("Select event_name, activity_name, id_room, day, startHour, startMinutes, endHour, endMinutes from Event, Lesson, TimeSlot where Event.id_event = Lesson.id_event AND Event.id_timeslot = TimeSlot.id_timeslot AND Event.id_contributor = '" + id_contributor + "' UNION " + "Select event_name, activity_name, id_room, dateEvent, startHour, startMinutes, endHour, endMinutes From Event, Occasional, TimeSlot where Event.id_event = Occasional.id_event AND Event.id_timeslot = TimeSlot.id_timeslot AND Event.id_contributor = '" + id_contributor + "';");

    	 try {
    		 while (result.next()) {

    			 // Create ArrayList for currentEvent
    			 ArrayList<String> currentEvent = new ArrayList<String>();
    			 
    			 // Get event_name
    			 String event_name = result.getString(result.findColumn("event_name"));
    			 currentEvent.add(event_name);
    			 // Get activity_name
    			 String activity_name = result.getString(result.findColumn("activity_name"));
    			 currentEvent.add(activity_name);
    			 // Get id_room
    			 String id_room = result.getString(result.findColumn("id_room"));
    			 currentEvent.add(id_room);
    			 // Get day
    			 String day = result.getString(result.findColumn("day"));
    			 currentEvent.add(day);
    			 // Get startHour
    			 String startHour = result.getString(result.findColumn("startHour"));
    			 String startMinutes = result.getString(result.findColumn("startMinutes"));
    			 String startTime = new String(startHour + ":" + startMinutes);
    			 currentEvent.add(startTime);
    			 // Get startMinutes
    			 String endHour = result.getString(result.findColumn("endHour"));
    			 String endMinutes = result.getString(result.findColumn("endMinutes"));
    			 String endTime = new String(endHour + ":" + endMinutes);
    			 currentEvent.add(endTime);
    			 
    			 // Add currentEvent to ArrayList
    			 myEvents.add(currentEvent);

    		 }
    	 } catch (SQLException e) {
    		 // TODO Auto-generated catch block
    		 e.printStackTrace();
    	 }
    		 return myEvents;
    }

 }
