
package BL.DataModel;

/**
 * 
 * 
 */
public class TimeSlot {

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
    public BL.DataModel.Day day;
/**
 * 
 * 
 * 
 * @poseidon-type BL.DataModel.Lesson
 */
    public java.util.Collection lesson = new java.util.TreeSet();
 }
