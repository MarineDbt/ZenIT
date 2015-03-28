
package BL.Front;

import java.util.ArrayList;
import java.util.Date;

import BL.TechnicalClasses.AbstractPersistenceHandlerFactory;
import BL.TechnicalClasses.EventManager;
import BL.DataClasses.*;

/**
 * 
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12mm2009]
 */
public class EventFacade {

	public EventManager eventmanager;
	
	public EventFacade(AbstractPersistenceHandlerFactory factory) {
		this.eventmanager = new EventManager(factory);
	}
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12mm1f66]
 * @param selectedRoom 
 * @return 
 */
    public ArrayList<TimeSlot> getAvailableTimeSlots(Room selectedRoom) {        
        return eventmanager.getAvailableTimeSlots(selectedRoom);
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12mm1f62]
 * @return 
 */
    public ArrayList<Room> getRooms() {        
        return eventmanager.getRooms();
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12mm1f58]
 * @param currentEvent 
 * @return 
 */
    public ArrayList<Contributor> getContributors(Event currentEvent) {        
        
        return eventmanager.getContributors(currentEvent);
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12mm1e64]
 * @param currentActivity 
 * @param name 
 * @param description 
 * @param selectedRoom 
 * @param selectedTimeSlot 
 * @param selectedDay 
 * @return 
 */
    public boolean addLesson(Activity currentActivity, String contributor, String name, String description, String selectedRoom, TimeSlot selectedTimeSlot, String selectedDay) {        
        return eventmanager.addLesson(currentActivity, contributor, name, description, selectedRoom, selectedTimeSlot, selectedDay);
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12mm1e5e]
 * @param selectedContributor 
 * @param currentEvent 
 * @return 
 */
    public boolean addContributor(Contributor selectedContributor, Event currentEvent) {        
        
        return eventmanager.addContributor(selectedContributor, currentEvent);
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12mm1e53]
 * @param currentActivity 
 * @param name 
 * @param description 
 * @param chosenRoom 
 * @param selectedTimeSlot 
 * @param date 
 * @param chosenType 
 * @return 
 */
    public boolean addOccasional(Activity currentActivity, String chosenContrib, String name, String description, String chosenRoom, TimeSlot selectedTimeSlot, String date, String chosenType) {        
     
        return eventmanager.addOccasional(currentActivity, chosenContrib, name, description, chosenRoom, selectedTimeSlot, date, chosenType);
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12mm1dae]
 * @param oldLesson 
 * @param newName 
 * @param newRoom 
 * @param newTimeSlot 
 * @param newDay 
 * @return 
 */
    public boolean updateLesson(Event currentEvent, String contributor, String name, String description, String selectedRoom, TimeSlot selectedTimeSlot, String selectedDay) {
    	return this.eventmanager.updateLesson(currentEvent, contributor, name, description, selectedRoom, selectedTimeSlot, selectedDay);
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12mm1da5]
 * @param oldOccasional 
 * @param newName 
 * @param newRoom 
 * @param newTimeSlot 
 * @param newDate 
 * @return 
 */
public boolean modifyOccasional(Event currentEvent, String contributor, String name, String description, String selectedRoom, TimeSlot selectedTimeSlot, String selectedDate, String selectedEventType) {        
        
        return eventmanager.modifyOccasional(currentEvent, contributor, name, description, selectedRoom, selectedTimeSlot, selectedDate,selectedEventType);
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12mm1d57]
 * @param selectedContributor 
 * @param currentEvent 
 * @return 
 */
    public boolean removeContributor(Contributor selectedContributor, Event currentEvent) {        
        return eventmanager.removeContributor(selectedContributor, currentEvent);
 
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12mm1d52]
 * @param selectedEvent 
 * @return 
 */
    public boolean removeEvent(Event selectedEvent) {        
        
        return eventmanager.removeEvent(selectedEvent);
    } 


    public boolean deleteOccasional(Event selectedEvent) {        
        // your code here
    	return eventmanager.deleteOccasional(selectedEvent);
    }
    
    public boolean deleteLesson(Event selectedEvent) {        
        // your code here
    	return eventmanager.deleteLesson(selectedEvent);
    } 
    
    public String getEventType(Event selectedEvent) {
    	return this.eventmanager.getEventType(selectedEvent);
    }
    
    public Date getEventDate(Event selectedEvent) {
    	return this.eventmanager.getEventDate(selectedEvent);
    }
    
    public String getEventDay(Event selectedEvent) {
    	return this.eventmanager.getEventDay(selectedEvent);
    }
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12mm1d2f]
 * @param currentEvent 
 * @return 
 */
    public ArrayList<User> getMembers(Event currentEvent) {        
        
        return eventmanager.getMembers(currentEvent);
    }
    
    public ArrayList<User> allContributors() {
    	return eventmanager.allContributors();
    }
    
    public ArrayList<Room> selectAllRooms() {      
    	return eventmanager.selectAllRooms();
    }
    
    public boolean isOccasional(Event selectedEvent){
    	return this.eventmanager.isOccasional(selectedEvent);
    }
    
    public boolean isLesson(Event selectedEvent){
    	return this.eventmanager.isLesson(selectedEvent);
    }

    
 }
