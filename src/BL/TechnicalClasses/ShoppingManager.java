
package BL.TechnicalClasses;

import java.util.ArrayList;

import BL.DataClasses.*;
import ConnectionToPersistence.AbstractPersistenceHandlerFactory;
import ConnectionToPersistence.ShoppingAbstractPersistenceHandler;


public class ShoppingManager {

	ShoppingAbstractPersistenceHandler shoppingPersistenceHandler;
	
	public ShoppingManager(){
		shoppingPersistenceHandler = AbstractPersistenceHandlerFactory.getFactory().createShoppingPersistenceHandler();
	}
    public ArrayList<Product> searchProduct(SubCategory subCaterory) {        
        // your code here
        return null;
    }
    
    public ArrayList<Product> searchProduct(Category caterory) {        
        // your code here
        return null;
    } 
    
    public void addProduct(Product selectedProduct, User currentUser) {        
        // your code here
    } 
    
    public void modifyQuantityProduct(Product product, Cart cart, int quantity) {        
        shoppingPersistenceHandler.updateOrdersProduct(product, cart, quantity);
    } 
    public void deleteProductFromCart(Product product , Cart cart) {        
    	shoppingPersistenceHandler.deleteOrdersProduct(product, cart);
    } 
    
    public boolean orderValidation(User currentUser) {        
        // your code here
        return false;
    } 
    
    public Cart showCart(User currentUser) {        
    	return shoppingPersistenceHandler.lookForCart(currentUser);
    } 

    public boolean cancelOrder(User currentUser, Order selectedOrder) {        
        // your code here
        return false;
    } 

    public Object[] readCategories() {        
    	return shoppingPersistenceHandler.selectCategories();
    } 
    
    public Object[] readSubcategories(String category) {        
    	return shoppingPersistenceHandler.selectSubcategories(category);
    }
	public ArrayList<Order> consultOrder(User currentUser) {
		// TODO Auto-generated method stub
		return null;
	}
	public ArrayList<Product> readAllProducts() {
		return shoppingPersistenceHandler.selectAllProducts();
	} 
 }
