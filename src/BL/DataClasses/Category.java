
package BL.DataClasses;

/**
 * 
 * 
 */
public class Category {

/**
 * <p>Represents ...</p>
 * 
 */
    private String nameCategory;
/**
 * 
 * 
 */
    public BL.DataClasses.SubCategory subCategory;
    
    /* Constructors */
    
    public Category(String name)
    {
    	nameCategory = name;
    }
    
    /* Getters */
    
    public String getName()
    {
    	return nameCategory;
    }
 }


