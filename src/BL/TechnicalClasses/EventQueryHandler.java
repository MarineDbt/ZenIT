
package QueryHandler;

/**
 * 
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m323c]
 */
public class EventQueryHandler extends QueryHandler.EventPersistanceHandler {

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m323b]
 * @param selectedRoom 
 * @return 
 */
    public Facade.ArrayList_TimeSlot_ lookForAvailableTimeSlots(Room selectedRoom) {        
        // your code here
        return null;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m3236]
 * @return 
 */
    public Factory.ArrayList_Room_ lookForRooms() {        
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
    public Facade.ArrayList_Contributor_ lookForContributors(Facade.Event currentEvent) {        
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
    public QueryHandler.boon insertLesson(Facade.Activity currentActivity, String name, String description, Room selectedRoom, Factory.TimeSlot selectedTimeSlot, Day selectedDay) {        
        // your code here
        return null;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m3223]
 * @param selectedContributor 
 * @param currentEvent 
 * @return 
 */
    public boolean insertContributor(Facade.Contributor selectedContributor, Facade.Event currentEvent) {        
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
    public boolean insertOccasional(Facade.Activity currentActivity, String name, String description, Room selectedRoom, Factory.TimeSlot selectedTimeSlot, java.util.Date selectedDate, Factory.EventType selectedEventType) {        
        // your code here
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
    public boolean updateLesson(Factory.Lesson oldLesson, String newName, Room newRoom, Factory.TimeSlot newTimeSlot, Day newDay) {        
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
    public boolean updateOccasional(Facade.Ocassional oldOccasional, String newName, Room newRoom, Factory.TimeSlot newTimeSlot, java.util.Date newDate) {        
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
    public boolean deleteContributor(Facade.Contributor selectedContributor, Facade.Event currentEvent) {        
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
    public boolean deleteEvent(Facade.Event selectedEvent) {        
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
    public Facade.ArrayList_Member_ lookForMembers(Facade.Member currentEvent) {        
        // your code here
        return null;
    } 
 }
