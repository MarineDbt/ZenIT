
package BL.DataClasses;

/**
 * 
 * 
 */
public class Contributor extends BL.DataClasses.UserRole {

/**
 * <p>Represents ...</p>
 * 
 */
    private String id;
	
	private String description;
/**
 * 
 * 
 * 
 * @poseidon-type BL.DataModel.Event
 */
    public java.util.Collection event = new java.util.TreeSet();
    
    public Contributor(String id, String description) {
    	this.id = id;
    	this.description = description;
    }
    
    public String getID() {
    	return this.id;
    }
    
    public String getDescription() {
    	return this.description;
    }
}
