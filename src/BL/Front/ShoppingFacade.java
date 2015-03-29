
package BL.Front;

import java.util.ArrayList;

import javax.swing.JLabel;

import BL.DataClasses.*;
import BL.TechnicalClasses.NotificationManager;
import BL.TechnicalClasses.ShoppingManager;

/**
 * Used to access the functionalities about shopping in a more abstract way, hiding the data
 * 
 * @author Elie GALLET
 * @version 1.0
 * @date March 2015
 * 
 */
public class ShoppingFacade {
	
	/*###########*/
	/* Attributs */
	/*###########*/
	
	/**
	 * Unique delegate used by every methods of the facade
	 * 
	 * @see ShoppingManager
	 */
	private ShoppingManager shoppingManager;
	
	/**
	 * Basic constructor
	 */
	public ShoppingFacade(){
		shoppingManager=new ShoppingManager();
	}
	
	/**
	 * @see ShoppingManager
	 */
    public ArrayList<Product> searchProductsOfCategory(String category) {        
        return shoppingManager.searchProductsOfCategory(category);
    }
    
    /**
	 * @see ShoppingManager
	 */
    public ArrayList<Product> searchProductsOfSubcategory(String subcategory) {        
        return shoppingManager.searchProductsOfSubcategory(subcategory);
    }
    
    /**
	 * @see ShoppingManager
	 */
    public void addProduct(Product product , Cart cart) {        
    	shoppingManager.addProduct(product, cart);
    } 
    
    /**
	 * @see ShoppingManager
	 */
    public void modifyQuantityProduct(Contains contains, int newQuantity) {        
    	shoppingManager.modifyQuantityProduct(contains, newQuantity);
    }
    
    /**
   	 * @see ShoppingManager
   	 */
    public boolean orderValidation(User currentUser) {        
        return shoppingManager.orderValidation(currentUser);
    } 
    
    /**
	 * @see ShoppingManager
	 */
    public boolean cancelOrder(User currentUser, Order selectedOrder) {        

        return shoppingManager.cancelOrder(currentUser, selectedOrder);
    } 
    
    /**
     * 
	 * @see ShoppingManager
	 */
    public ArrayList<Order> consultOrder(User currentUser) {        
        return shoppingManager.consultOrder(currentUser);    
    }
    
    /**
	 * @see ShoppingManager
	 */
	public void deleteProductFromCart(Product product, Cart cart) {
		shoppingManager.deleteProductFromCart(product, cart);	
	}
	
	/**
	 * @see ShoppingManager
	 */
	public Object[] readCategories() {
		return shoppingManager.readCategories();
		
	}
	
	/**
	 * @see ShoppingManager
	 */
	public Object[] readSubcategories(String category) {
		return shoppingManager.readSubcategories(category);
		
	}
	
	/**
	 * @see ShoppingManager
	 */
	public ArrayList<Product> readAllProducts() {
		return shoppingManager.readAllProducts();
		
	} 
 }
