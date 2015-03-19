
package BL.TechnicalClasses;

import java.util.ArrayList;

import BL.DataClasses.*;

/**
 * 
 * 
 * @poseidon-object-id [I395d852m14bf5118266mm69de]
 */
public class ShoppingManager {

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I395d852m14bf5118266mm69c5]
 * @param String 
 * @param String 
 * @param .. 
 * @return 
 */
    public ArrayList<Product> searchProduct(SubCategory subCaterory) {        
        // your code here
        return null;
    }
    public ArrayList<Product> searchProduct(Category caterory) {        
        // your code here
        return null;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I395d852m14bf5118266mm69a0]
 * @param Product 
 * @param User 
 */
    public void addProduct(Product selectedProduct, User currentUser) {        
        // your code here
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I395d852m14bf5118266mm696e]
 * @param Product 
 * @param User 
 * @param int 
 */
    public void modifyQuantityProduct(Product selectedProduct, User currentUser, int newQuantity) {        
        // your code here
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I395d852m14bf5118266mm6949]
 * @param Product 
 * @param User 
 */
    public void deleteProduct(Product selectedProduct , User currentUser) {        
        // your code here
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I395d852m14bf5118266mm6924]
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
 * @poseidon-object-id [I395d852m14bf5118266mm68ff]
 * @param User 
 * @return 
 */
    public ArrayList<Product> showCart(User currentUser) {        
        // your code here
        return null;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I395d852m14bf5118266mm68da]
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
 * @poseidon-object-id [I395d852m14bf5118266mm68b5]
 * @param User 
 * @return 
 */
    public ArrayList<Order> consultOrder(User currentUser) {        
        // your code here
        return null;
    } 
 }
