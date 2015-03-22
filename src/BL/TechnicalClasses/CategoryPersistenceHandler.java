
package BL.TechnicalClasses;

import BL.DataClasses.*;

/**
 * 
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm46b9]
 */
public abstract class CategoryPersistenceHandler {
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm46ba]
 * @param superCategory 
 * @param label 
 * @return 
 */
    public abstract boolean insertCategory(String label);
    
    /**
     * <p>Does ...</p>
     * 
     * @poseidon-object-id [I29f51818m14c28f165ddmm46ba]
     * @param superCategory 
     * @param label 
     * @return 
     */
     public abstract boolean insertSubCategory(Category superCategory, String label);
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm46c0]
 * @param category 
 * @return 
 */
    public abstract boolean deleteCategory(BL.DataClasses.Category category);
}


