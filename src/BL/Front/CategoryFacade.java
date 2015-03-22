package BL.Front;

import BL.DataClasses.*;
import BL.TechnicalClasses.*;

/**
 * 
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm55aa]
 */
public class CategoryFacade {

/**
 * <p>Represents ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm55ab]
 */
    private CategoryManager categoryManager;

    /* Constructors */
    
    public CategoryFacade(AbstractPersistenceHandlerFactory factory)
    {
    	categoryManager = new CategoryManager(factory);
    }
    
    
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm55ac]
 * @param label 
 * @return 
 */
    public boolean createCategory(String label) {        
    	
    	/* Delegate method call to CategoryManager */
    	
    	return categoryManager.createCategory(label);
    } 
    
    public boolean createSubCategory(Category superCategory, String label) {        
    	
    	/* Delegate method call to CategoryManager */
    	
    	return categoryManager.createSubCategory(superCategory,label);
    } 
    

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm55b2]
 * @param category 
 * @return 
 */
    public boolean removeCategory(Category category) {        
        
    	/* Delegate method call to CategoryManager */
    	
    	return categoryManager.removeCategory(category);
        
    } 
    
/**
* <p>Does ...</p>
* 
* * @poseidon-object-id [I29f51818m14c28f165ddmm55b2]
* @param category 
* @return 
*/
    public boolean deleteSubCategory(SubCategory subCategory) {        
            // your code here
       return false;
    } 
    
    /**
     * <p>Does ...</p>
     * 
     * @poseidon-object-id [I29f51818m14c28f165ddmm55b2]
     * @param category 
     * @return 
     */
        public boolean modifyCategory(Category category) {        
            // your code here
            return false;
        } 
        
    /**
    * <p>Does ...</p>
    * 
    * * @poseidon-object-id [I29f51818m14c28f165ddmm55b2]
    * @param category 
    * @return 
    */
        public boolean modifySubCategory(SubCategory subCategory) {        
                // your code here
           return false;
        } 
 }
