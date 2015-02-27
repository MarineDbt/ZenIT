
package BL.DataModel;

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
/**
 * 
 * 
 */
    public BL.DataModel.Activity activity;
/**
 * 
 * 
 */
    public BL.DataModel.Room room;
/**
 * 
 * 
 * 
 * @poseidon-type BL.DataModel.Contributor
 */
    public java.util.Collection contributor = new java.util.TreeSet();
 }
