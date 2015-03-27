
package BL.Front;

import java.util.ArrayList;

import BL.DataClasses.*;
import BL.TechnicalClasses.ShoppingManager;


public class ShoppingFacade {

	
	private ShoppingManager shoppingManager;

	public ShoppingFacade(){
		shoppingManager=new ShoppingManager();
	}
    public ArrayList<Product> searchProduct(SubCategory subCaterory) {        
        return shoppingManager.searchProduct(subCaterory);
    }
    public ArrayList<Product> searchProduct(Category caterory) {        
    	return shoppingManager.searchProduct(caterory);
    } 

    public void addProduct(Product selectedProduct , User currentUser) {        
    	shoppingManager.addProduct(selectedProduct, currentUser);
    } 

    public void modifyQuantityProduct(Product selectedProduct , Cart cart, int newQuantity) {        
    	shoppingManager.modifyQuantityProduct(selectedProduct, cart, newQuantity);
    }

    public boolean orderValidation(User currentUser) {        
        return shoppingManager.orderValidation(currentUser);
    } 

    public Cart showCart(User currentUser) {        
    	return shoppingManager.showCart(currentUser);
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
