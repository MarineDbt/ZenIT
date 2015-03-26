
package BL.DataClasses;

import java.util.ArrayList;

/**
 * 
 * 
 */
public class Cart {

	private int id_order;
	
	public ArrayList<Contains> contains;

	public Cart(ArrayList<Contains> contains2, int id_order) {
		this.contains=contains2;
		this.id_order=id_order;
	}

	/**
	 * <p>Does ...</p>
	 * 
	 */
	public void deleteProduct() {        
		// your code here
	} 

	/**
	 * <p>Does ...</p>
	 * 
	 */
	public void addProduct() {        
		// your code here
	} 

	/**
	 * <p>Does ...</p>
	 * 
	 */
	public void modifyQuantity() {        
		// your code here
	} 

	/**
	 * <p>Does ...</p>
	 * 
	 */
	public void validateCart() {        
		// your code here
	} 
	public int getId_order() {
		return id_order;
	}
}
