
package BL.ModelClasses;

/**
 * 
 * 
 */
public class Contributor {

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
    
    public Contributor(String maDescription)
    {
    	descriptionContributor = maDescription;   	
    }

    /* Getters */
    
    public String getDescriptionContributor()
    {
    	return descriptionContributor;
    }

}

