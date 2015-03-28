
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
	private int id;
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







public Event(int id2, String name, User user, String description, Room room2,
		TimeSlot timeSlot2) {
	this.id = id2;
	this.nameEvent = name;
	this.contributor = user;
	this.eventDescription = description;
	this.room = room2;
	this.timeSlot = timeSlot2;
}


public Event() {
	// TODO Auto-generated constructor stub
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


public int getID() {
	
	return this.id;
}


public String getRoom() {

	return this.room.getid();
}

public String getContributor() {

	return this.contributor.getFirstname()+this.contributor.getLastname();
}









 }
