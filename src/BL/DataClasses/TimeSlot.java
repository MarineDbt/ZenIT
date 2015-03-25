
package BL.DataClasses;

/**
 * 
 * 
 */
public class TimeSlot {

public TimeSlot(int hdeb, int mindeb, int hfin, int minfin) {
		this.startHour = hdeb;
		this.startMinutes = mindeb;
		this.endingHour = hfin;
		this.enfingMinutes = minfin;
	}
/**
 * <p>Represents ...</p>
 * 
 */
    private int startHour;

/**
 * <p>Represents ...</p>
 * 
 */
    private int startMinutes;

/**
 * <p>Represents ...</p>
 * 
 */
    private int endingHour;

/**
 * <p>Represents ...</p>
 * 
 */
    private int enfingMinutes;
/**
 * 
 * 
 */
    public BL.DataClasses.Day day;
/**
 * 
 * 
 * 
 * @poseidon-type BL.DataModel.Lesson
 */
    public java.util.Collection lesson = new java.util.TreeSet();
 }
