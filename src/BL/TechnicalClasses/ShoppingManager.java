
package BL.TechnicalClasses;

import java.util.ArrayList;

import BL.DataClasses.*;
import ConnectionToPersistence.AbstractPersistenceHandlerFactory;
import ConnectionToPersistence.ShoppingAbstractPersistenceHandler;


public class ShoppingManager {

	ShoppingAbstractPersistenceHandler shoppingPersistenceHandler;
	ContainsFactory containsFactory;
	
	public ShoppingManager(){
		containsFactory = new ContainsFactory();
		shoppingPersistenceHandler = AbstractPersistenceHandlerFactory.getFactory().createShoppingPersistenceHandler();
	}
    public ArrayList<Product> searchProductsOfCategory(String category) {        
    	 return shoppingPersistenceHandler.selectProductOfCategory(category);
       
    }
    
    public ArrayList<Product> searchProductsOfSubcategory(String subcategory) {        
    	 return shoppingPersistenceHandler.selectProductOfSubcategory(subcategory);
    }
    
    public void addProduct(Product product, Cart cart) {
    	int index = -1;
    	for (int i = 0; i<cart.contains.size(); i++){
    		if (cart.contains.get(i).product.getId_product()==product.getId_product()){
    			index =i;
    			break;
    		}
    				
    	}
    	if (index == -1){
    		cart.contains.add(containsFactory.createContains(1, product));
    	}
    	else{
    		modifyQuantityProduct(cart.contains.get(index), cart.contains.get(index).getQuantity()+1);
    	}
    } 
    
    public void modifyQuantityProduct(Contains contains, int quantity) {        
    	contains.setQuantity(quantity);
    } 
    public void deleteProductFromCart(Product product , Cart cart) {        
    	int index = -1;
    	for (int i = 0; i<cart.contains.size(); i++){
    		if (cart.contains.get(i).product.getId_product()==product.getId_product()){
    			index =i;
    			break;
    		}
    				
    	}
    	if (index == -1){
    	}
    	else{
    		cart.contains.remove(index);
    	}
    } 
    
    public boolean orderValidation(User currentUser) {        
        // your code here
        return false;
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
