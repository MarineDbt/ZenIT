
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
        // your code here
        return null;
    }
    public ArrayList<Product> searchProduct(Category caterory) {        
        // your code here
        return null;
    } 

    public void addProduct(Product selectedProduct , User currentUser) {        
        // your code here
    } 

    public void modifyQuantityProduct(Product selectedProduct , User currentUser, int newQuantity) {        
        // your code here
    } 

    public void deleteProduct(Product selectedProduct , User currentUser) {        
        // your code here
    } 

    public boolean orderValidation(User currentUser) {        
        // your code here
        return false;
    } 

    public Cart showCart(User currentUser) {        
    	return shoppingManager.showCart(currentUser);
    } 


    public boolean cancelOrder(User currentUser, Order selectedOrder) {        
        // your code here
        return false;
    } 


    public ArrayList<Order> consultOrder(User currentUser) {        
        // your code here
        return null;    } 
 }
