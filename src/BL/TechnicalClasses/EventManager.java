
package BL.TechnicalClasses;

import java.util.ArrayList;
import java.util.Date;

import BL.DataClasses.*;

/**
 * 
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m2ea0]
 */
public class EventManager {

public EventPersistenceHandler eventPH;
	
	//Constructeur
	
	public EventManager(AbstractPersistenceHandlerFactory factory) {
		
		this.eventPH = factory.createEventPersistenceHandler();
	}
	
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m2e9f]
 * @param selectedRoom 
 * @return 
 */
    public ArrayList<TimeSlot> getAvailableTimeSlots(Room selectedRoom) {        
       
        return eventPH.lookForAvailableTimeSlots(selectedRoom);
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m2e9a]
 * @return 
 */
    public ArrayList<Room> getRooms() {        

        return eventPH.lookForRooms();
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m2e96]
 * @param currentEvent 
 * @return 
 */
    public ArrayList<Contributor> getContributors(Event currentEvent) {        
        
        return eventPH.lookForContributors(currentEvent);
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m2e91]
 * @param currentActivity 
 * @param name 
 * @param description 
 * @param selectedRoom 
 * @param selectedTimeSlot 
 * @param selectedDay 
 * @return 
 */
    public boolean addLesson(Activity currentActivity, String contributor, String name, String description, String selectedRoom, TimeSlot selectedTimeSlot, String selectedDay) {        
        
        return eventPH.insertLesson(currentActivity, contributor, name, description, selectedRoom, selectedTimeSlot, selectedDay);
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m2e87]
 * @param selectedContributor 
 * @param currentEvent 
 * @return 
 */
    public boolean addContributor(Contributor selectedContributor, Event currentEvent) {        
       
        return eventPH.insertContributor(selectedContributor, currentEvent);
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m2e81]
 * @param currentActivity 
 * @param name 
 * @param description 
 * @param chosenRoom 
 * @param selectedTimeSlot 
 * @param selectedDate 
 * @param selectedEventType 
 * @return 
 */
    public boolean addOccasional(Activity currentActivity, String chosenContrib, String name, String description, String chosenRoom, TimeSlot selectedTimeSlot, String selectedDate, String selectedEventType) {        
       
        return eventPH.insertOccasional(currentActivity, chosenContrib, name, description, chosenRoom, selectedTimeSlot, selectedDate, selectedEventType);
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m2e76]
 * @param oldLesson 
 * @param newName 
 * @param description  
 * @param newRoom 
 * @param newTimeSlot 
 * @param newDay 
 * @return 
 */
    public boolean modifyLesson(Lesson oldLesson, String newName, String description, Room newRoom, TimeSlot newTimeSlot, Day newDay) {        
       
        return eventPH.updateLesson(oldLesson, newName, newRoom, newTimeSlot, newDay);
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m2e6d]
 * @param oldOccasional 
 * @param newName 
 * @param description
 * @param newRoom 
 * @param newTimeSlot 
 * @param newDate 
 * @return 
 */
    public boolean modifyOccasional(Occasional oldOccasional, String newName, String description, Room newRoom, TimeSlot newTimeSlot, java.util.Date newDate) {        
        
        return eventPH.updateOccasional(oldOccasional, newName, newRoom, newTimeSlot, newDate);
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m2e64]
 * @param selectedContributor 
 * @param currentEvent 
 * @return 
 */
    public boolean removeContributor(Contributor selectedContributor, Event currentEvent) {        
       
        return eventPH.deleteContributor(selectedContributor, currentEvent);
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m2e5e]
 * @param selectedEvent 
 * @return 
 */
    public boolean removeEvent(Event selectedEvent) {        
     
        return eventPH.deleteEvent(selectedEvent);
    } 

    public boolean deleteOccasional(Event selectedEvent) {        
        // your code here
    	return eventPH.deleteOccasional(selectedEvent);
    }
    
    public boolean deleteLesson(Event selectedEvent) {        
        // your code here
    	return eventPH.deleteLesson(selectedEvent);
    } 
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m2e59]
 * @param currentEvent 
 * @return 
 */
    public ArrayList<User> getMembers(Event currentEvent) {        
     
        return eventPH.lookForMembers(currentEvent);
    } 
    
    public ArrayList<User> allContributors() {
    	return eventPH.allContributors();
    }
    
    public ArrayList<Room> selectAllRooms() {      
    	return eventPH.selectAllRooms();
    }

	public String getEventType(Event selectedEvent) {
		return this.eventPH.getEventType(selectedEvent);
		
	}

	public Date getEventDate(Event selectedEvent) {
	   	return this.eventPH.getEventDate(selectedEvent);
	}

	public boolean isOccasional(Event selectedEvent) {
    	return this.eventPH.isOccasional(selectedEvent);
	}

	public boolean isLesson(Event selectedEvent) {
    	return this.eventPH.isLesson(selectedEvent);
	}
  }
 
