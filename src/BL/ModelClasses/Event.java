
package BL.ModelClasses;

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
    public BL.ModelClasses.Activity activity;
/**
 * 
 * 
 */
    public BL.ModelClasses.Room room;
/**
 * 
 * 
 * 
 * @poseidon-type BL.DataModel.Contributor
 */
    public java.util.Collection contributor = new java.util.TreeSet();
 }
