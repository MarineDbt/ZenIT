
package BL.Front;

import java.util.ArrayList;

import javax.swing.JLabel;

import BL.DataClasses.*;
import BL.TechnicalClasses.ShoppingManager;


public class ShoppingFacade {

	
	private ShoppingManager shoppingManager;

	public ShoppingFacade(){
		shoppingManager=new ShoppingManager();
	}
    public ArrayList<Product> searchProductsOfCategory(String category) {        
        return shoppingManager.searchProductsOfCategory(category);
    }
    public ArrayList<Product> searchProductsOfSubcategory(String subcategory) {        
        return shoppingManager.searchProductsOfSubcategory(subcategory);
    }

    public void addProduct(Product product , Cart cart) {        
    	shoppingManager.addProduct(product, cart);
    } 

    public void modifyQuantityProduct(Contains contains, int newQuantity) {        
    	shoppingManager.modifyQuantityProduct(contains, newQuantity);
    }

    public boolean orderValidation(User currentUser) {        
        return shoppingManager.orderValidation(currentUser);
    } 

    public boolean cancelOrder(User currentUser, Order selectedOrder) {        

        return shoppingManager.cancelOrder(currentUser, selectedOrder);
    } 

    public ArrayList<Order> consultOrder(User currentUser) {        
        return shoppingManager.consultOrder(currentUser);    
    }
    
	public void deleteProductFromCart(Product product, Cart cart) {
		shoppingManager.deleteProductFromCart(product, cart);	
	}
	public Object[] readCategories() {
		return shoppingManager.readCategories();
		
	}
	
	public Object[] readSubcategories(String category) {
		return shoppingManager.readSubcategories(category);
		
	}
	public ArrayList<Product> readAllProducts() {
		return shoppingManager.readAllProducts();
		
	} 
 }
