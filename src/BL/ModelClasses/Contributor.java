
package BL.ModelClasses;

/**
 * 
 * 
 */
public class Contributor extends User {

/**
 * <p>Represents ...</p>
 * 
 */
    private String descriptionContributor;
/**
 * 
 * 
 * 
 * @poseidon-type BL.DataModel.Event
 */
    public java.util.Collection event = new java.util.TreeSet();
    
    /* Constructors */
    
    public Contributor(String id_user, String maDescription)
    {
    	super(id_user);
    	descriptionContributor = maDescription;   	
    }

    /* Getters */
    
    public String getDescriptionContributor()
    {
    	return descriptionContributor;
    }

}

