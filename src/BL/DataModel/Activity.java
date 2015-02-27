
package BL.DataModel;

/**
 * 
 * 
 */
public class Activity {

/**
 * <p>Represents ...</p>
 * 
 */
    private String nameActivity;

/**
 * <p>Represents ...</p>
 * 
 */
    private String shortDescription;

/**
 * <p>Represents ...</p>
 * 
 */
    private String detailledDescription;
/**
 * 
 * 
 * 
 * @poseidon-type BL.DataModel.Event
 */
    public java.util.Collection event = new java.util.TreeSet();
/**
 * 
 * 
 * 
 * @poseidon-type BL.DataModel.Member
 */
    public java.util.Collection member = new java.util.TreeSet();
/**
 * 
 * 
 */
    public BL.DataModel.Manager manager;
 }
