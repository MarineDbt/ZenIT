
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
    public boolean addProduct(String name, double price, double discount,int quantity, Member currentMember, String subcategory, String description) {        
		
    	/* Declarations and initializations */
		int result = 0;
		
		/* Query execution delegated to ConnectionToMySQL */
		result = ConnectionToMySQL.requestInsertQuery("insert into Product (nameProduct, price, discount, quantity, id_member, subcategory_name, description) values ('"+name+"',"+price+","+discount+","+quantity+","+currentMember.getID()+",'"+subcategory+"','"+description+"');");

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
    public boolean modifyProduct(Product product, String name, double price, double discount, int quantity, String description) {        
    	
    	/* Declarations and initializations */
    	int result = 0;
    	
    	/* Query execution delegated to ConnectionToMySQL */
    	result = ConnectionToMySQL.requestInsertQuery( "update Product set nameProduct = '" + name + "', price = " + price + ", discount = " + discount + ", quantity = " + quantity + ", description = '"+ description + "' where id_product = "+ product.getID() +";");

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
    	result = ConnectionToMySQL.requestInsertQuery( "delete from Product where id_product = "+product.getID()+";");

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
    	ArrayList<Product> myProducts = new ArrayList<Product>();
    	
    	/* Query execution delegated to ConnectionToMySQL */
    	result = ConnectionToMySQL.requestSelectQuery("Select * from Product where id_member = '" + 1 + "';");
    	
    	try {
    		while (result.next()) {
    			int id_product = result.getInt(result.findColumn("id_product"));
    			String nameProduct = result.getString(result.findColumn("nameProduct"));
    			double price = result.getDouble(result.findColumn("price"));
    			double discount = result.getDouble(result.findColumn("discount"));
    			int quantity = result.getInt(result.findColumn("quantity"));
    			String subcategory_name = result.getString(result.findColumn("subcategory_name"));
    			String description = result.getString(result.findColumn("description"));
    			Product product = new Product(id_product, nameProduct, price, discount, quantity, currentMember, subcategory_name, description);
    			myProducts.add(product);
    		}
    	} catch (SQLException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	}
    	return myProducts;
    }
}
