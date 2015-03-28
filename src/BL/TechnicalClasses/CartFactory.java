package BL.TechnicalClasses;

import java.util.ArrayList;

import BL.DataClasses.Cart;
import BL.DataClasses.Contains;

public class CartFactory {

	public Cart createCart() {
		return new Cart();
	}

	
	public Cart createCart(ArrayList<Contains> contains, int id_order) {
		return new Cart(contains);
	}

}
