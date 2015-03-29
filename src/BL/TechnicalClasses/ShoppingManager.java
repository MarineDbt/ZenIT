
package BL.TechnicalClasses;

import java.util.ArrayList;

import BL.DataClasses.*;
import ConnectionToPersistence.AbstractPersistenceHandlerFactory;
import ConnectionToPersistence.ShoppingAbstractPersistenceHandler;

/**
 * Manages objects relative to shopping
 * 
 * @author Elie GALLET
 * @version 1.0
 * @date March 2015
 * @see Contains
 * @see Product
 * 
 */
public class ShoppingManager {

	
	/*###########*/
	/* Attributs */
	/*###########*/
	
	ShoppingAbstractPersistenceHandler shoppingPersistenceHandler;
	ContainsFactory containsFactory;
	
	/*#########*/
	/* Methods */
	/*#########*/
	
	/**
	 * Basic Constructor
	 */
	public ShoppingManager(){
		containsFactory = new ContainsFactory();
		shoppingPersistenceHandler = AbstractPersistenceHandlerFactory.getFactory().createShoppingPersistenceHandler();
	}
	
	/**
	 * Looks in persistence for products corresponding to a specific category
	 * 
	 * @param category : category of products
	 * @return list of products
	 */
	public ArrayList<Product> searchProductsOfCategory(String category) {        
		return shoppingPersistenceHandler.selectProductOfCategory(category);

	}
	
	/**
	 * Looks in persistence for products corresponding to a specific subcategory
	 * 
	 * @param category : subcategory of products
	 * @return list of products
	 */
	public ArrayList<Product> searchProductsOfSubcategory(String subcategory) {        
		return shoppingPersistenceHandler.selectProductOfSubcategory(subcategory);
	}

	/**
	 * Adds a product to a cart
	 * 
	 * @param product : a product you want to add
	 * @param cart : the cart where you want to add the product
	 */
	public void addProduct(Product product, Cart cart) {
		

		/*### Declarations and initializations */

		int index = -1; /*corresponds to the index of the product in the cart if it already exists*/

		
		/*### Processing */
		
		for (int i = 0; i<cart.contains.size(); i++){ /* scans the content of the cart */
			if (cart.contains.get(i).product.getId_product()==product.getId_product()){
				index =i;
				break; /*breaks the loop when the product we want to add is found */
			}

		}
		if (index == -1){ /* if the product is not in the cart already */
			cart.contains.add(containsFactory.createContains(1, product)); /* add one of this new product in the cart */
		}

		else{ /* else just increments the quantity */
			modifyQuantityProduct(cart.contains.get(index), cart.contains.get(index).getQuantity()+1);
		}
	} 
	
	/**
	 * Modifies the quantity of a contains
	 * 
	 * @param contains
	 * @param quantity
	 */
	public void modifyQuantityProduct(Contains contains, int quantity) {        
		contains.setQuantity(quantity);
	} 
	
	/**
	 * Removes a product from a cart
	 * 
	 * @param product
	 * @param cart
	 */
	public void deleteProductFromCart(Product product , Cart cart) {     
		
		/*### Declarations and initializations */

		int index = -1; /*corresponds to the index of the product in the cart if it already exists*/

		
		/*### Processing */
		
		for (int i = 0; i<cart.contains.size(); i++){ /* scans the content of the cart */
			if (cart.contains.get(i).product.getId_product()==product.getId_product()){
				index=i;
				break; /*breaks the loop when the product we want to add is found */
			}

		}
		
		if (index == -1){/* if the product is not in the cart already */
			/* do nothing */
		}
		else{ /* else ... */
			cart.contains.remove(index); /* remove the product from the cart thanks to its index */
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
	/**
	 * Looks in the persistence for all the existing categories
	 * 
	 * @return the categories
	 */
	public Object[] readCategories() {        
		return shoppingPersistenceHandler.selectCategories();
	} 
	
	/**
	 * Looks in the persistence for all the subcategories corresponding to a category
	 * 
	 * @param a category of products
	 * @return the corresponding subcategories
	 */
	public Object[] readSubcategories(String category) {        
		return shoppingPersistenceHandler.selectSubcategories(category);
	}
	public ArrayList<Order> consultOrder(User currentUser) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * Looks in the persistence for all the existing products
	 * 
	 * @return list of products
	 */
	public ArrayList<Product> readAllProducts() {
		return shoppingPersistenceHandler.selectAllProducts();
	} 
}
