
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
    public boolean addLesson(Activity currentActivity, String name, String description, Room selectedRoom, TimeSlot selectedTimeSlot, Day selectedDay) {        
        return eventmanager.addLesson(currentActivity, name, description, selectedRoom, selectedTimeSlot, selectedDay);
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
 * @param selectedRoom 
 * @param selectedTimeSlot 
 * @param selectedDate 
 * @param selectedEventType 
 * @return 
 */
    public boolean addOccasional(Activity currentActivity, String name, String description, Room selectedRoom, TimeSlot selectedTimeSlot, Date selectedDate, EventType selectedEventType) {        
     
        return eventmanager.addOccasional(currentActivity, name, description, selectedRoom, selectedTimeSlot, selectedDate, selectedEventType);
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
    public boolean modifyLesson(Lesson oldLesson, String newName, String newDescription,Room newRoom, TimeSlot newTimeSlot, Day newDay) {        
        return eventmanager.modifyLesson(oldLesson, newName, newDescription, newRoom, newTimeSlot, newDay);
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
    public boolean modifyOccasional(Occasional oldOccasional, String newName, String newDescription, Room newRoom, TimeSlot newTimeSlot, Date newDate) {        
        return eventmanager.modifyOccasional(oldOccasional, newName, newDescription, newRoom, newTimeSlot, newDate) ;
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

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12mm1d2f]
 * @param currentEvent 
 * @return 
 */
    public ArrayList<Member> getMembers(Member currentEvent) {        
        
        return eventmanager.getMembers(currentEvent);
    } 
 }
