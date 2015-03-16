
package BL.TechnicalClasses;

import java.util.ArrayList;

import BL.DataClasses.*;

/**
 * 
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m2ea0]
 */
public class EventManager {

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m2e9f]
 * @param selectedRoom 
 * @return 
 */
    public ArrayList<TimeSlot> getAvailableTimeSlots(Room selectedRoom) {        
        // your code here
        return null;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m2e9a]
 * @return 
 */
    public ArrayList<Room> getRooms() {        
        // your code here
        return null;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m2e96]
 * @param currentEvent 
 * @return 
 */
    public ArrayList<Contributor> getContributors(Event currentEvent) {        
        // your code here
        return null;
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
    public boolean addLesson(Activity currentActivity, String name, String description, Room selectedRoom, TimeSlot selectedTimeSlot, Day selectedDay) {        
        // your code here
        return false;
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
        // your code here
        return false;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m2e81]
 * @param currentActivity 
 * @param name 
 * @param description 
 * @param selectedRoom 
 * @param selectedTimeSlot 
 * @param selectedDate 
 * @param selectedEventType 
 * @return 
 */
    public boolean addOccasional(Activity currentActivity, String name, String description, Room selectedRoom, TimeSlot selectedTimeSlot, java.util.Date selectedDate, EventType selectedEventType) {        
        // your code here
        return false;
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
        // your code here
        return false;
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
        // your code here
        return false;
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
        // your code here
        return false;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m2e5e]
 * @param selectedEvent 
 * @return 
 */
    public boolean removeEvent(Event selectedEvent) {        
        // your code here
        return false;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12m2e59]
 * @param currentEvent 
 * @return 
 */
    public ArrayList<Member> getMembers(Member currentEvent) {        
        // your code here
        return null;
    } 
 }
