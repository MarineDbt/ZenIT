package BL.TechnicalClasses;

import java.util.ArrayList;

import BL.DataClasses.Cart;
import BL.DataClasses.Contains;


/**
 * Used to create instances of Cart
 * 
 * @author Elie GALLET
 * @version 1.0
 * @date march 2015
 * @see Cart
 * 
 */
public class CartFactory {
	
	/**
	 * creates a cart
	 * 
	 * @return an empty cart
	 */
	public Cart createCart() {
		return new Cart();
	}
	/**
	 * creates a cart from a list of products and their corresponding quantity
	 * 
	 * @param arraylist of products and their quantity
	 * @return a cart
	 */
	public Cart createCart(ArrayList<Contains> contains, int id_order) {
		return new Cart(contains);
	}

}
