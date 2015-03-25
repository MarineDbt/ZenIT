
package BL.TechnicalClasses;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import BL.DataClasses.*;
import ConnectionToDB.ConnectionToMySQL;

/**
 * 
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m323c]
 */
public class EventQueryHandler extends EventPersistenceHandler {

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m323b]
 * @param selectedRoom 
 * @return 
 */
    public ArrayList<TimeSlot> lookForAvailableTimeSlots(Room selectedRoom) {        
        // your code here
        return null;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m3236]
 * @return 
 */
    public ArrayList<Room> lookForRooms() {        
        // your code here
        return null;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m3232]
 * @param currentEvent 
 * @return 
 */
    public ArrayList<Contributor> lookForContributors(Event currentEvent) {        
        // your code here
        return null;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m322d]
 * @param currentActivity 
 * @param name 
 * @param description 
 * @param selectedRoom 
 * @param selectedTimeSlot 
 * @param selectedDay 
 * @return 
 */
    public boolean insertLesson(Activity currentActivity, String name, String description, Room selectedRoom, TimeSlot selectedTimeSlot, Day selectedDay) {        
        // your code here
        return false;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m3223]
 * @param selectedContributor 
 * @param currentEvent 
 * @return 
 */
    public boolean insertContributor(Contributor selectedContributor, Event currentEvent) {        
        // your code here
        return false;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m321d]
 * @param currentActivity 
 * @param name 
 * @param description 
 * @param selectedRoom 
 * @param selectedTimeSlot 
 * @param selectedDate 
 * @param selectedEventType 
 * @return 
 */
    public boolean insertOccasional(Activity currentActivity, String name, String description, Room selectedRoom, TimeSlot selectedTimeSlot, java.util.Date selectedDate, EventType selectedEventType) {        
        
    	String datesql = "to_date('"+selectedDate+"' 'dd/MM/yyyy')";
    	
        return false;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m3212]
 * @param oldLesson 
 * @param newName 
 * @param newRoom 
 * @param newTimeSlot 
 * @param newDay 
 * @return 
 */
    public boolean updateLesson(Lesson oldLesson, String newName, Room newRoom, TimeSlot newTimeSlot, Day newDay) {        
        // your code here
        return false;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m3209]
 * @param oldOccasional 
 * @param newName 
 * @param newRoom 
 * @param newTimeSlot 
 * @param newDate 
 * @return 
 */
    public boolean updateOccasional(Occasional oldOccasional, String newName, Room newRoom, TimeSlot newTimeSlot, java.util.Date newDate) {        
        // your code here
        return false;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m3200]
 * @param selectedContributor 
 * @param currentEvent 
 * @return 
 */
    public boolean deleteContributor(Contributor selectedContributor, Event currentEvent) {        
        // your code here
        return false;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m31fa]
 * @param selectedEvent 
 * @return 
 */
    public boolean deleteEvent(Event selectedEvent) {        
        // your code here
        return false;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m31f5]
 * @param currentEvent 
 * @return 
 */
    public ArrayList<User> lookForMembers(Event currentEvent) {        
    	/* Declarations and initializations */
    	ResultSet result;
    	ResultSet result2;
    	ResultSet result3;
    	ArrayList<User> users = new ArrayList<User>();
    	
    	result3 = ConnectionToMySQL.requestSelectQuery("Select * from Event where `event_name`='"+currentEvent.getName()+"';");
    	try {
			result3.next();
			int id_event = result3.getInt(1);
			
		
    	
    	/* Query execution delegated to ConnectionToMySQL */
    	result2 = ConnectionToMySQL.requestSelectQuery("Select * from MemberEvent where `id_event`='"+id_event+"';");

    	try {
			while (result2.next()) {
				
				String id_member = result2.getString(1);
				result = ConnectionToMySQL.requestSelectQuery("Select * from User where `id`='"+id_member+"';");
				result.next();
				 String id = result.getString(1);
				 String firstname = result.getString(2);
		    	 String lastname = result.getString(3);
		    	 String street = result.getString(4);
		    	 String pc = result.getString(5);
		    	 String city = result.getString(6);
		    	 String phone  = result.getString(7);
		    	 User user = new User(id, firstname, lastname, street, pc, city, phone);
			     users.add(user);
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }catch (SQLException e1) {
 			// TODO Auto-generated catch block
 			e1.printStackTrace();
 		}
    	
        return users;
    } 
    
    public ArrayList<User> allContributors() {
    	/* Declarations and initializations */
    	ResultSet result;
    	ResultSet result2;
    	ArrayList<User> contributors = new ArrayList<User>();
    	
    	/* Query execution delegated to ConnectionToMySQL */
    	result = ConnectionToMySQL.requestSelectQuery("Select * from Contributor;");
    	
    	try {
			while (result.next()) {
			String id_contributor = result.getString(1);
			result2 = ConnectionToMySQL.requestSelectQuery("Select * from User where `id`='"+id_contributor+"';");
			 result2.next();
			String id = result2.getString(1);
			 String firstname = result2.getString(2);
	    	 String lastname = result2.getString(3);
	    	 String street = result2.getString(4);
	    	 String pc = result2.getString(5);
	    	 String city = result2.getString(6);
	    	 String phone  = result2.getString(7);
	    	 User user = new User(id, firstname, lastname, street, pc, city, phone);
	    	 contributors.add(user);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	return contributors;
    }
    
    
   }
 
