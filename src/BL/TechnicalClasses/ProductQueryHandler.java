
package BL.TechnicalClasses;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import BL.DataClasses.Member;
import BL.DataClasses.Product;
import ConnectionToDB.ConnectionToMySQL;

/**
 * 
 * 
 * @poseidon-object-id [Im619706dm14c21d41ce6mm77fa]
 */
public class ProductQueryHandler extends ProductPersistenceHandler {

	//Constructors
	
	public ProductQueryHandler(){
		super();
	}
	
	
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im619706dm14c21d41ce6mm77e1]
 * @param String 
 * @param float 
 * @param float 
 * @param Member 
 * @param int 
 * @param String 
 * @param String description
 * @return 
 */
    public boolean addProduct(String name, float price,float discount,Member currentMember,int quantity, String subcategory, String description) {        
		
    	/* Declarations and initializations */
		int result = 0;
		
		/* Query execution delegated to ConnectionToMySQL */
		result = ConnectionToMySQL.requestInsertQuery("insert into Product (nameProduct, price, discount, quantity, id_member, subcategory_name, product_description) values ('"+name+"',"+price+","+discount+","+currentMember.getID()+","+quantity+",'"+subcategory+"','"+description+"');");
		
		/* Return value */
		return (result == 1);
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im619706dm14c21d41ce6mm77bc]
 * @param Product 
 * @return 
 */
    public boolean modifyProduct(Product product, String name, float price, float discount, int quantity, String description) {        
    	
    	/* Declarations and initializations */
    	int result = 0;
    	
    	/* Query execution delegated to ConnectionToMySQL */
    	result = ConnectionToMySQL.requestInsertQuery( "update product set nameProduct = '" + name + "', price = " + price + ", discount = " + discount + ", quantity = " + quantity + ", description = '"+ description + " where id_product = '"+ product.getID() +"';");
    	
    	/* Return value */
    	return (result == 1);
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im619706dm14c21d41ce6mm7797]
 * @param Product 
 * @return 
 */
    public boolean deleteProduct(Product product) {        
    	
    	/* Declarations and initializations */
    	int result = 0;
    	
    	/* Query execution delegated to ConnectionToMySQL */
    	result = ConnectionToMySQL.requestInsertQuery( "delete from Product where id_product = '"+Integer.toString(product.getID())+"';");
    	
    	/* Return value */
    	return (result == 1);
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im619706dm14c21d41ce6mm7772]
 * @param Member 
 * @return 
 */
    public ArrayList<Product> getProducts(Member currentMember) {        
    	
    	/* Declarations and initializations */
    	ResultSet result;
    	ArrayList<Product> myProducts = new ArrayList<>();
    	
    	/* Query execution delegated to ConnectionToMySQL */
    	result = ConnectionToMySQL.requestSelectQuery("Select * from Product where id_member = '" + Integer.toString(currentMember.getID()) + "';");
    	try {
    		while (result.next()) {
    			int id_product = result.getInt(1);
    			String nameProduct = result.getString(2);
    			float price = result.getFloat(3);
    			float discount = result.getFloat(4);
    			int quantity = result.getInt(5);
    			String subcategory_name = result.getString(7);
    			String product_description = result.getString(8);
    			Product myProduct = new Product(id_product, nameProduct, price, discount, quantity, subcategory_name, product_description);
    			myProducts.add(myProduct);
    	}
    	} catch (SQLException e) {
    	// TODO Auto-generated catch block
    	e.printStackTrace();
    	}
    	return myProducts;
    }
}
