
package BL.TechnicalClasses;
import BL.DataClasses.Category;
import BL.TechnicalClasses.CategoryFactory;
import ConnectionToDB.ConnectionToMySQL;

/**
 * 
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm4622]
 */
public class CategoryQueryHandler extends CategoryPersistenceHandler {

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm4623]
 * @param superCategory 
 * @param label 
 * @return 
 */
    public boolean insertCategory(String label) {        
    	
    	/* Declarations and initializations */
    	int result = 0;

    	/* Query execution delegated to ConnectionToMySQL */
    	result = ConnectionToMySQL.requestInsertQuery( "insert into Category (category_name) values('"+label+"');");
    	
    	/* Return value */
    	
    	return (result == 1);
    } 
    
    /**
     * <p>Does ...</p>
     * 
     * @poseidon-object-id [I29f51818m14c28f165ddmm4623]
     * @param superCategory 
     * @param label 
     * @return 
     */
        public boolean insertSubCategory(Category superCategory, String label) {        
        	
        	/* Declarations and initializations */
        	int result = 0;

        	/* Query execution delegated to ConnectionToMySQL */
        	result = ConnectionToMySQL.requestInsertQuery( "insert into Subcategory (subcategory_name,category_name) values('"+label+"','"+superCategory.getName()+"');");
        	
        	/* Return value */
        	
        	return (result == 1);
        } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm4629]
 * @param category 
 * @return 
 */
    public boolean deleteCategory(Category category) {        
    	
    	/* Declarations and initializations */
    	int result = 0;

    	/* Query execution delegated to ConnectionToMySQL */
    	result = ConnectionToMySQL.requestInsertQuery( "delete from Category where category_name = '"+category.getName()+"');");
    	
    	/* Return value */
    	
    	return (result == 1 );
    } 
 }
