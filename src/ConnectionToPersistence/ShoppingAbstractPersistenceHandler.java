
package ConnectionToPersistence;

import java.util.ArrayList;

import BL.DataClasses.*;
import BL.TechnicalClasses.CartFactory;
import BL.TechnicalClasses.ContainsFactory;
import BL.TechnicalClasses.ProductFactory;

/**
 * 
 * 
 * @poseidon-object-id [Im4bef336fm14c19425b18mm67dc]
 */
public abstract class ShoppingAbstractPersistenceHandler {

	
	protected CartFactory cartFactory;
	protected ContainsFactory containsFactory;
	protected ProductFactory productFactory;
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im4bef336fm14c19425b18mm67dd]
 * @param User 
 * @return 
 */
    public abstract  ArrayList<Order> lookForOrders(User currentUser);

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im4bef336fm14c19425b18mm67e1]
 * @param User 
 * @return 
 */
    public abstract boolean cancelOrder(User currentUser);

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im4bef336fm14c19425b18mm67e5]
 * @param User 
 * @return 
 */
    public abstract boolean validateOrder(User currentUser);

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im4bef336fm14c19425b18mm67e9]
 * @param String 
 * @param String 
 * @param .. 
 * @return 
 */
    public abstract ArrayList<Product> lookForProduct(String categoryName, String subcategoryName);

    public abstract Cart lookForCart(User currentUser);
 }
