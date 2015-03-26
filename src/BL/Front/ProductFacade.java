
package BL.Front;
import java.util.ArrayList;

import BL.DataClasses.Member;
import BL.DataClasses.Product;
import BL.TechnicalClasses.*;

/**
 * 
 * 
 * @poseidon-object-id [Im619706dm14c21d41ce6mm79c8]
 */
public class ProductFacade {

	protected ProductManager productManager;
	
	public ProductFacade(AbstractPersistenceHandlerFactory factory) {
		this.productManager = new ProductManager(factory);
	}
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im619706dm14c21d41ce6mm79af]
 * @param String 
 * @param float 
 * @param float 
 * @param Member 
 * @param int 
 * @param String 
 * @return 
 */
	
    public boolean addProduct(String name, double price, double discount, int quantity, Member currentMember, String subcategory, String description) {        
        return this.productManager.addProduct(name, price, discount, quantity, currentMember, subcategory, description);
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im619706dm14c21d41ce6mm798a]
 * @param Product 
 * @return 
 */
    public boolean modifyProduct(Product product, String name, double price, double discount, int quantity, String description) {        
        return this.productManager.modifyProduct(product, name, price, discount, quantity, description);
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im619706dm14c21d41ce6mm7965]
 * @param Product 
 * @return 
 */
    public boolean deleteProduct(Product product) {        
        return this.productManager.deleteProduct(product);
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im619706dm14c21d41ce6mm7940]
 * @param Member 
 * @return 
 */
    public ArrayList<Product> getProducts(Member currentmember) {        
        return this.productManager.getProducts(currentmember);
    } 
 }
