
package BL.DataClasses;

/**
 * 
 * 
 */
public class Event {

/**
 * <p>Represents ...</p>
 * 
 */
    private String nameEvent;
    
    private String eventDescription;
    private TimeSlot timeSlot;

    public BL.DataClasses.Activity activity;

    public BL.DataClasses.Room room;

    public User contributor;
    
    
public Event(String string) {
	this.nameEvent = string;
}


public Event(String name, User contributor2, String description, Room room2,TimeSlot timeSlot2) {
	this.nameEvent = name;
	this.contributor = contributor2;
	this.eventDescription = description;
	this.room = room2;
	this.timeSlot = timeSlot2;
}





public String getName() {
	return this.nameEvent;
	
}


public String getEventDescription() {
	return eventDescription;
}


public TimeSlot getTimeSlot() {
	return timeSlot;
}






 }
