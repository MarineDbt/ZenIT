
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
    private string nameActivity;

/**
 * <p>Represents ...</p>
 * 
 */
    private string shortDescription;

/**
 * <p>Represents ...</p>
 * 
 */
    private string detailledDescription;
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
