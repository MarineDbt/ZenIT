
package BL.TechnicalClasses;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import BL.DataClasses.*;
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
    	result = ConnectionToMySQL.requestInsertQuery("delete from Category where category_name = '"+category.getName()+"';");
    	
    	/* Return value */
    	
    	return (result == 1 );
    } 
    
 public boolean deleteSubCategory(SubCategory subCategory) {        
    	
    	/* Declarations and initializations */
    	int result = 0;

    	/* Query execution delegated to ConnectionToMySQL */
    	result = ConnectionToMySQL.requestInsertQuery( "delete from Subcategory where subcategory_name = '"+subCategory.getName()+"';");
    	
    	/* Return value */
    	
    	return (result == 1 );
    } 
 
 public boolean updateCategory(Category category, String newName) {        
 	
 	/* Declarations and initializations */
 	int result = 0;

 	/* Query execution delegated to ConnectionToMySQL */
 	result = ConnectionToMySQL.requestInsertQuery("update Category set category_name = '"+newName+"' where category_name = '"+category.getName()+"';");
 	
 	/* Return value */
 	
 	return (result == 1 );
 } 
 
 public boolean updateSubCategory(SubCategory subCategory, String newName) {        
 	
 	/* Declarations and initializations */
 	int result = 0;

 	/* Query execution delegated to ConnectionToMySQL */
 	result = ConnectionToMySQL.requestInsertQuery( "update Subcategory set subcategory_name = '"+newName+"' where subcategory_name = '"+subCategory.getName()+"';");
 	
 	/* Return value */
 	
 	return (result == 1 );
 } 
 
 public ArrayList<Category> selectAllCategories(){
	 
	/* Declarations and initializations */
 	ResultSet result;
 	ArrayList<Category> myCategories = new ArrayList<Category>();

 	/* Query execution delegated to ConnectionToMySQL */
 	result = ConnectionToMySQL.requestSelectQuery("Select * from Category;");
 	
 	
 	try {
			while (result.next()) {
			     String categoryName = result.getString(1);
			     Category myCategory = new Category(categoryName);
			     myCategories.add(myCategory);
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 	
     return myCategories;
	 
 }
 
 public ArrayList<SubCategory> selectSubCategories(Category category){
	 
		/* Declarations and initializations */
	 	ResultSet result;
	 	ArrayList<SubCategory> mySubCategories = new ArrayList<SubCategory>();

	 	/* Query execution delegated to ConnectionToMySQL */
	 	result = ConnectionToMySQL.requestSelectQuery("Select * from Subcategory where category_name = '"+category.getName()+"';");
	 	
	 	
	 	try {
				while (result.next()) {
				     String SubCategoryName = result.getString(1);
				     SubCategory mySubCategory = new SubCategory(SubCategoryName);
				     mySubCategories.add(mySubCategory);
				 }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 	
	     return mySubCategories;
		 
	 }
 }
