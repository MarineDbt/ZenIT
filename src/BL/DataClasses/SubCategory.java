
package BL.DataClasses;

/**
 * 
 * 
 */
public class SubCategory {

public SubCategory(String string2,Category cat) {
		this.string=string;
		this.category=cat;
	}
/**
 * <p>Represents ...</p>
 * 
 */
    private String string;
/**
 * 
 * 
 * 
 * @poseidon-type BL.DataModel.Product
 */
    public java.util.Collection products = new java.util.TreeSet();
/**
 * 
 * 
 */
    public BL.DataClasses.Category category;
 }
