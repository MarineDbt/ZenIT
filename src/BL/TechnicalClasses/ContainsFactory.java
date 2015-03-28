package BL.TechnicalClasses;

import BL.DataClasses.Contains;
import BL.DataClasses.Product;

/**
 * Used to create instances of Contains
 * 
 * @author Elie GALLET
 * @version 1.0
 * @date march 2015
 * @see Cart
 * 
 */
public class ContainsFactory {

	/**
	 * create Factory
	 * 
	 * @param quantity
	 * @param product
	 * @return
	 */
	public Contains createContains(int quantity, Product product) {
		return new Contains(quantity,product);
	}

}
