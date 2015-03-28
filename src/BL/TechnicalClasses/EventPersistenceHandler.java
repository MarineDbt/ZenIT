
package BL.TechnicalClasses;

import java.util.ArrayList;
import java.util.Date;

import BL.DataClasses.*;

/**
 * 
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m435f]
 */
public abstract class EventPersistenceHandler {

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m435e]
 * @param selectedRoom 
 * @return 
 */
	public ArrayList<TimeSlot> lookForAvailableTimeSlots(Room selectedRoom) {        
        // your code here
        return null;
    } 

	
	public boolean deleteOccasional(Event selectedEvent) {        
        // your code here
        return false;
    }
    
    public boolean deleteLesson(Event selectedEvent) {        
        // your code here
        return false;
    } 
    
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m4359]
 * @return 
 */
    public ArrayList<Room> lookForRooms() {        
        // your code here
        return null;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m4355]
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
 * @poseidon-object-id [I97bf540m14c21da4a12m4350]
 * @param currentActivity 
 * @param name 
 * @param description 
 * @param selectedRoom 
 * @param selectedTimeSlot 
 * @param selectedDay 
 * @return 
 */
    public boolean insertLesson(Activity currentActivity, String contributor, String name, String description, String selectedRoom, TimeSlot selectedTimeSlot, String selectedDay) {        
        // your code here
        return false;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m4346]
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
 * @poseidon-object-id [I97bf540m14c21da4a12m4340]
 * @param currentActivity 
 * @param name 
 * @param description 
 * @param chosenRoom 
 * @param selectedTimeSlot 
 * @param selectedDate 
 * @param selectedEventType 
 * @return 
 */
    public boolean insertOccasional(Activity currentActivity, String chosenContrib, String name, String description, String chosenRoom, TimeSlot selectedTimeSlot, String selectedDate, String selectedEventType) {        
        // your code here
        return false;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m4335]
 * @param oldLesson 
 * @param newName 
 * @param newRoom 
 * @param newTimeSlot 
 * @param newDay 
 * @return 
 */
    public boolean updateLesson(Event currentEvent, String contributor, String name, String description, String selectedRoom, TimeSlot selectedTimeSlot, String selectedDay) {
    	return false;
    }

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m432c]
 * @param oldOccasional 
 * @param newName 
 * @param newRoom 
 * @param newTimeSlot 
 * @param newDate 
 * @return 
 */
    public boolean updateOccasional(Event currentEvent, String contributor, String name, String description, String selectedRoom, TimeSlot selectedTimeSlot, String selectedDate, String selectedEventType) {        
        // your code here
        return false;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m4323]
 * @param selectedContributor 
 * @param currentEvent 
 * @return 
 */
    public boolean deleteContributor(Contributor selectedContributor, Event currentEvent) {        
        // your code here
        return false;
    } 

    public String getEventDay(Event selectedEvent) {
    	return null;
    }
    
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m431d]
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
 * @poseidon-object-id [I97bf540m14c21da4a12m4318]
 * @param currentEvent 
 * @return 
 */
    public ArrayList<User> lookForMembers(Event currentEvent) {        
        // your code here
        return null;
    } 
    
    public ArrayList<User> allContributors() {
    	return null;
    }
    
public ArrayList<Room> selectAllRooms() {        
       	
return null;
    }


public String getEventType(Event selectedEvent) {
	// TODO Auto-generated method stub
	return null;
}


public Date getEventDate(Event selectedEvent) {
	// TODO Auto-generated method stub
	return null;
}


public boolean isOccasional(Event selectedEvent) {
	// TODO Auto-generated method stub
	return false;
}


public boolean isLesson(Event selectedEvent) {
	// TODO Auto-generated method stub
	return false;
} 
  }
 
