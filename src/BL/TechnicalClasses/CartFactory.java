package BL.TechnicalClasses;

import java.util.ArrayList;

import BL.DataClasses.Cart;
import BL.DataClasses.Contains;


/**
 * Used to create instances of Cart
 * 
 * @author Elie GALLET
 * @version 1.0
 * @date March 2015
 * @see Cart
 * 
 */
public class CartFactory {
	
	
	/**
	 * Creates a Cart
	 * 
	 * @return Cart : an empty cart
	 */
	public Cart createCart() {
		return new Cart();
	}
	/**
	 * Creates a Cart from a list of products and their corresponding quantity
	 * 
	 * @param contains : list of products and their quantity
	 * @return the cart the has been created
	 */
	public Cart createCart(ArrayList<Contains> contains) {
		return new Cart(contains);
	}

}
