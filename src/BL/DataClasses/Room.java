
package BL.DataClasses;

/**
 * 
 * 
 */
public class Room {

public Room(String id_room) {
		this.numRoom=id_room;
	}
/**
 * <p>Represents ...</p>
 * 
 */
    private float superficie;

/**
 * <p>Represents ...</p>
 * 
 */
    private String numRoom;
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
 * @poseidon-type BL.DataModel.Dispose
 */
    public java.util.Collection dispose = new java.util.TreeSet();
 }
