
package ConnectionToPersistence;

import java.util.ArrayList;

import BL.DataClasses.*;
/**
 * 
 * 
 * @poseidon-object-id [I395d852m14bf5118266mm66ad]
 */
public class ShoppingQueryHandler extends ShoppingAbstractPersistanceHandler {

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I395d852m14bf5118266mm6694]
 * @param User 
 */
    public  ArrayList<Order>lookForOrders(User currentUser) {
		return null;        
        // your code here
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I395d852m14bf5118266mm667c]
 * @param User 
 * @return 
 */
    public boolean cancelOrder(User currentUser) {        
        // your code here
        return false;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I395d852m14bf5118266mm6664]
 * @param User 
 * @return 
 */
    public boolean validateOrder(User currentUser) {        
        // your code here
        return false;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I395d852m14bf5118266mm664c]
 * @param String 
 * @param .. 
 * @return 
 */
    public ArrayList<Product> lookForProduct(String categoryName,  String subcategoryName) {        
        // your code here
        return null;    } 
 }
