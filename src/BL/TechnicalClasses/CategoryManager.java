
package BL.TechnicalClasses;
import java.util.ArrayList;
import java.util.Collection;

import BL.DataClasses.*;
import BL.TechnicalClasses.*;

/**
 * 
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm45de]
 */
public class CategoryManager {

/**
 * <p>Represents ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm45df]
 */
    private Collection<Category> categoryManager;

    private CategoryPersistenceHandler myCategoryPersistenceHandler;
    
    /* Constructors */
    
    public CategoryManager(AbstractPersistenceHandlerFactory factory)
    {
    	myCategoryPersistenceHandler = factory.createCategoryPersistenceHandler();
    }
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm45e0]
 * @param superCategory 
 * @param label 
 * @return 
 */
    public boolean createCategory(String label) {        
        
    	/* Delegate method call to CategoryPersistenceHandler */
    	
        return myCategoryPersistenceHandler.insertCategory(label);
    } 

    
    /**
     * <p>Does ...</p>
     * 
     * @poseidon-object-id [I29f51818m14c28f165ddmm45e0]
     * @param superCategory 
     * @param label 
     * @return 
     */
        public boolean createSubCategory(Category superCategory, String label) {        
            
        	/* Delegate method call to CategoryPersistenceHandler */
        	
            return myCategoryPersistenceHandler.insertSubCategory(superCategory,label);
        } 
    
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm45e6]
 * @param category 
 * @return 
 */
    public boolean removeCategory(Category category) {        
    	
    	/* Delegate method call to CategoryPersistenceHandler */
    	
        return myCategoryPersistenceHandler.deleteCategory(category);
    } 
    
 public boolean removeSubCategory(SubCategory subCategory) {        
    	
    	/* Delegate method call to CategoryPersistenceHandler */
    	
        return myCategoryPersistenceHandler.deleteSubCategory(subCategory);
    } 
 
 public boolean modifyCategory(Category category, String newName) {        
 	
 	/* Delegate method call to CategoryPersistenceHandler */
 	
     return myCategoryPersistenceHandler.updateCategory(category, newName);
 } 
 
 public boolean modifySubCategory(SubCategory subCategory, String newName) {        
 	
 	/* Delegate method call to CategoryPersistenceHandler */
 	
     return myCategoryPersistenceHandler.updateSubCategory(subCategory, newName);
 }
public ArrayList<Category> selectAllCategories() {
	
	/* Delegate method call to CategoryPersistenceHandler */
 	
    return myCategoryPersistenceHandler.selectAllCategories();
}
public ArrayList<SubCategory> selectSubCategories(Category category) {
	
	/* Delegate method call to CategoryPersistenceHandler */
 	
    return myCategoryPersistenceHandler.selectSubCategories(category);
} 
 }
