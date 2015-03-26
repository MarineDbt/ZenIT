
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
    public boolean insertLesson(Activity currentActivity, String contributor, String name, String description, String selectedRoom, TimeSlot selectedTimeSlot, String selectedDay) {        
     
    	System.out.println("je suis dans insert occasional");
    	int result=0;
  
    	int idTimeSlot = this.searchTimeSlot(selectedTimeSlot);
    	int idEvent = this.insertEvent(currentActivity, contributor, name, description, selectedRoom, idTimeSlot);
    	
    			
    	result= ConnectionToMySQL.requestInsertQuery("insert into Lesson (id_event,day) values('"+idEvent+"','"+selectedDay+"');");
       
    	
    	return (result==1);
    	
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
    private int searchTimeSlot(TimeSlot selectedTimeSlot) {
    	System.out.println("je suis dans insert timeslot");
    	int idTimeSlot = 0;
    	ResultSet result;
    	int result2 =0;
    	ResultSet result3;
    	
    	result = ConnectionToMySQL.requestSelectQuery("Select * from TimeSlot where startHour='"+selectedTimeSlot.getHDeb()+"' and startMinutes='"+selectedTimeSlot.getMDeb()+"' and endHour ='"+selectedTimeSlot.getHFin()+"' and endMinutes='"+selectedTimeSlot.getMFin()+"' ;");
    	try {
			
    	if (result.next()) {
    		
    		idTimeSlot = result.getInt(1);
    	}
    	
    	else {
    		result2 = ConnectionToMySQL.requestInsertQuery("insert into TimeSlot (startHour,startMinutes,endHour, endMinutes) values ('"+selectedTimeSlot.getHDeb()+"', '"+selectedTimeSlot.getMDeb()+"','"+selectedTimeSlot.getHFin()+"','"+selectedTimeSlot.getMFin()+"');");
    		System.out.println("le résultat de la requelle timslot est "+result2);
    		if (result2==1) {
    		
    			result3 = ConnectionToMySQL.requestSelectQuery("Select * from TimeSlot where startHour='"+selectedTimeSlot.getHDeb()+"' and startMinutes='"+selectedTimeSlot.getMDeb()+"' and endHour ='"+selectedTimeSlot.getHFin()+"' and endMinutes='"+selectedTimeSlot.getMFin()+"' ;");
    			if (result3.next()) {
    			idTimeSlot = result3.getInt(1);
    			}
    	}
    	}
    	
    	} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	System.out.println(idTimeSlot);
    	return idTimeSlot;
    }
    
    
    
    public int insertEvent(Activity currentActivity, String contributor, String name, String description, String selectedRoom, int idTimeSlot) {
    	System.out.println("je suis dans insert event");
    int idEvent=0;
    int result=0;
    ResultSet result2;
    
    result = ConnectionToMySQL.requestInsertQuery("insert into Event (event_name,id_contributor,event_description,id_room,id_timeslot,activity_name) values('"+name+"','"+contributor+"','"+description+"','"+selectedRoom+"','"+idTimeSlot+"','"+currentActivity.getName()+"');");
    if (result==1) {
    	result2 = ConnectionToMySQL.requestSelectQuery("Select * from Event Where event_name='"+name+"' and id_contributor='"+contributor+"' and event_description='"+description+"' and id_room='"+selectedRoom+"' and id_timeslot='"+idTimeSlot+"' and activity_name='"+currentActivity.getName()+"';");
    	try {
			if (result2.next()) {
			idEvent = result2.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println("l'idevent est "+idEvent);
    	return idEvent;
    }
    
    return idEvent;
}
    public boolean insertOccasional(Activity currentActivity, String contributor, String name, String description, String selectedRoom, TimeSlot selectedTimeSlot, String selectedDate, String selectedEventType) {        
    	System.out.println("je suis dans insert occasional");
    	int result=0;
    	String dateSql = "STR_TO_DATE('"+selectedDate+"', '%d/%m/%Y')";
    	int idTimeSlot = this.searchTimeSlot(selectedTimeSlot);
    	int idEvent = this.insertEvent(currentActivity, contributor, name, description, selectedRoom, idTimeSlot);
    	
    			
    	result= ConnectionToMySQL.requestInsertQuery("insert into Occasional (id_event,eventType_name,dateEvent) values('"+idEvent+"','"+selectedEventType+"',"+dateSql+");");
       
    	
    	return (result==1);
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
    
    
public ArrayList<Room> selectAllRooms() {        
       	
    	/* Declarations and initializations */
    	ResultSet result;
    	ArrayList<Room> myRooms = new ArrayList<Room>();

    	/* Query execution delegated to ConnectionToMySQL */
    	result = ConnectionToMySQL.requestSelectQuery("Select * from Room;");
    	
    	
    	try {
			while (result.next()) {
			     String id_room = result.getString(1);
			     float superficy = result.getFloat(2);
			     Room myRoom = new Room(id_room,superficy);
			     myRooms.add(myRoom);
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
        return myRooms;
    } 
    
   }
 
