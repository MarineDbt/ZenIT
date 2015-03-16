
package Facade;

/**
 * 
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12mm2009]
 */
public class EventFacade {

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12mm1f66]
 * @param selectedRoom 
 * @return 
 */
    public Facade.ArrayList_TimeSlot_ getAvailableTimeSlots(Room selectedRoom) {        
        // your code here
        return null;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12mm1f62]
 * @return 
 */
    public Factory.ArrayList_Room_ getRooms() {        
        // your code here
        return null;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12mm1f58]
 * @param currentEvent 
 * @return 
 */
    public Facade.ArrayList_Contributor_ getContributors(Facade.Event currentEvent) {        
        // your code here
        return null;
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
    public boolean addLesson(Facade.Activity currentActivity, String name, String description, Room selectedRoom, Factory.TimeSlot selectedTimeSlot, Day selectedDay) {        
        // your code here
        return false;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12mm1e5e]
 * @param selectedContributor 
 * @param currentEvent 
 * @return 
 */
    public boolean addContributor(Facade.Contributor selectedContributor, Facade.Event currentEvent) {        
        // your code here
        return false;
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
    public boolean addOccasional(Facade.Activity currentActivity, String name, String description, Room selectedRoom, Factory.TimeSlot selectedTimeSlot, java.util.Date selectedDate, Factory.EventType selectedEventType) {        
        // your code here
        return false;
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
    public boolean modifyLesson(Factory.Lesson oldLesson, String newName, Room newRoom, Factory.TimeSlot newTimeSlot, Day newDay) {        
        // your code here
        return false;
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
    public boolean modifyOccasional(Facade.Ocassional oldOccasional, String newName, Room newRoom, Factory.TimeSlot newTimeSlot, java.util.Date newDate) {        
        // your code here
        return false;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12mm1d57]
 * @param selectedContributor 
 * @param currentEvent 
 * @return 
 */
    public boolean removeContributor(Facade.Contributor selectedContributor, Facade.Event currentEvent) {        
        // your code here
        return false;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12mm1d52]
 * @param selectedEvent 
 * @return 
 */
    public boolean removeEvent(Facade.Event selectedEvent) {        
        // your code here
        return false;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12mm1d2f]
 * @param currentEvent 
 * @return 
 */
    public Facade.ArrayList_Member_ getMembers(Facade.Member currentEvent) {        
        // your code here
        return null;
    } 
 }
