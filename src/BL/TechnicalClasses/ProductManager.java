
package BL.TechnicalClasses;

import java.util.ArrayList;

import BL.DataClasses.Member;
import BL.DataClasses.Product;

/**
 * 
 * 
 * @poseidon-object-id [Im619706dm14c21d41ce6mm78ce]
 */
public class ProductManager {

	private ProductPersistenceHandler myProductPersistenceHandler;
	
	public ProductManager(AbstractPersistenceHandlerFactory factory) {
		myProductPersistenceHandler = factory.createProductPersistenceHandler();
	}
	
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im619706dm14c21d41ce6mm78b3]
 * @param String 
 * @param float 
 * @param float 
 * @param Member 
 * @param int 
 * @param String 
 * @return 
 */
    public boolean addProduct(String name, double price, double discount,int quantity, Member currentMember, String subcategory, String description) {        
        boolean result = myProductPersistenceHandler.addProduct(name, price, discount, quantity, currentMember, subcategory, description);
        return result;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im619706dm14c21d41ce6mm788e]
 * @param Product 
 * @return 
 */
    public boolean modifyProduct(Product product, String name, double price, double discount, int quantity, String description) {        
        boolean result = myProductPersistenceHandler.modifyProduct(product, name, price, discount, quantity, description);
        return result;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im619706dm14c21d41ce6mm7869]
 * @param Product 
 * @return 
 */
    public boolean deleteProduct(Product product) {        
    	boolean result = myProductPersistenceHandler.deleteProduct(product);
        return result;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im619706dm14c21d41ce6mm7844]
 * @param Member 
 * @return 
 */
    public ArrayList<Product> getProducts(Member currentmember) {
    	return myProductPersistenceHandler.getProducts(currentmember);
    } 
 }
