
package BL.TechnicalClasses;

import java.util.ArrayList;

import BL.DataClasses.*;

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
    public ArrayList<Member> lookForMembers(Member currentEvent) {        
        // your code here
        return null;
    } 
 }
