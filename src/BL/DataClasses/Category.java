
package BL.DataClasses;

import java.util.ArrayList;

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
    private ArrayList<SubCategory> subCategories;
    
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


