
package BL.DataClasses;

/**
 * 
 * 
 */
public class SubCategory {

/**
 * <p>Represents ...</p>
 * 
 */
    private String subCategoryName;
/**
 * 
 * 
 * 
 * @poseidon-type BL.DataModel.Product
 */
    public java.util.Collection product = new java.util.TreeSet();
/**
 * 
 * 
 */
    public Category category;
    
    /* Constructors */
    public SubCategory(String name)
    {
    	subCategoryName = name;
    }
 }
