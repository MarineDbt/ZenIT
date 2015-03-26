package BL.TechnicalClasses;

import java.util.ArrayList;

import BL.DataClasses.Cart;
import BL.DataClasses.Contains;

public class CartFactory {

	public Cart createCart(ArrayList<Contains> contains) {
		return new Cart(contains);
	}

}
