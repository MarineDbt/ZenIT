
package BL.ModelClasses;

/**
 * 
 * 
 */
public class Accessory {

/**
 * <p>Represents ...</p>
 * 
 */
    private String nameAccessory;
/**
 * 
 * 
 * 
 * @poseidon-type BL.DataModel.Dispose
 */
    public java.util.Collection dispose = new java.util.TreeSet();
    
    
    /* Constructors */ 
    public Accessory(String name)
    {
    	nameAccessory = name;
    }
    
    /* Getters */
    public String getName()
    {
    	return nameAccessory;
    }
 }


