package BL.DataClasses;

/**
 * 
 * 
 */
public class Room {

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
    public java.util.Collection dispose = new java.util.ArrayList<Accessory>();
   
 
	/* Constructors */

	public Room(String numero, float maSuperficie)
	{
		numRoom = numero;
		superficie = maSuperficie;
	}

	/* Getters */
	
	public Room(String text) {
		numRoom = text;
	}

	public String getId()
	{
		return numRoom;
	}
	
	public float getSuperficy()
	{
		return superficie;
	}
}