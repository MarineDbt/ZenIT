package BL.TechnicalClasses;

import BL.DataClasses.Contains;
import BL.DataClasses.Product;

/**
 * Used to create instances of Contains : a couple made by a product and its quantity
 * 
 * @author Elie GALLET
 * @version 1.0
 * @date March 2015
 * @see Contains
 * 
 */
public class ContainsFactory {
	
	/**
	 * creates a Contains
	 * 
	 * @param int quantity : the quantity assigned
	 * @param Product product : a product 
	 * @return the object containing a product and its quantity
	 */
	public Contains createContains(int quantity, Product product) {
		return new Contains(quantity,product);
	}

}
