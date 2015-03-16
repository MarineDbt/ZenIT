
package BL.Front;

import java.util.ArrayList;

import BL.DataClasses.*;

/**
 * 
 * 
 * @poseidon-object-id [I395d852m14bf5118266mm6e8d]
 */
public class ShoppingFacade {

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I395d852m14bf5118266mm6e74]
 * @param String 
 * @param String 
 * @param .. 
 * @return 
 */
    public ArrayList<Product> searchProduct(String categoryName, String subcateoryName, ...) {        
        // your code here
        return null;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I395d852m14bf5118266mm6e4f]
 * @param Product 
 * @param User 
 */
    public void addProduct(Product selectedProduct , User currentUser) {        
        // your code here
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I395d852m14bf5118266mm6d4c]
 * @param Product 
 * @param User 
 * @param int 
 */
    public void modifyQuantityProduct(Product selectedProduct , User currentUser, int newQuantity) {        
        // your code here
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I395d852m14bf5118266mm6d27]
 * @param Product 
 * @param User 
 */
    public void deleteProduct(Product selectedProduct , User currentUser) {        
        // your code here
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I395d852m14bf5118266mm6d02]
 * @param User 
 * @return 
 */
    public boolean orderValidation(User currentUser) {        
        // your code here
        return false;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I395d852m14bf5118266mm6a72]
 * @param User 
 * @return 
 */
    public ArrayList<Product> showCart(User currentUser ) {        
        // your code here
        return null;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I395d852m14bf5118266mm6a4d]
 * @param User 
 * @param Order 
 * @return 
 */
    public boolean cancelOrder(User currentUser, Order selectedOrder) {        
        // your code here
        return false;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I395d852m14bf5118266mm6a28]
 * @param User 
 * @return 
 */
    public ArrayList<Order> consultOrder(User currentUser) {        
        // your code here
        return null;    } 
 }
