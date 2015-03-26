
package BL.DataClasses;

import java.util.ArrayList;

/**
 * 
 * 
 */
public class Cart {
	/**
	 * 
	 * 
	 */
	//public BL.DataClasses.User user;
	/**
	 * 
	 * 
	 */
	//public BL.DataClasses.Order order;
	/**
	 * 
	 * 
	 * 
	 * @poseidon-type BL.DataModel.Contains
	 */
	public ArrayList<Contains> contains;

	public Cart(ArrayList<Contains> contains2) {
		this.contains=contains2;
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
	/**
	 * 
	 * 
	 */
	public BL.DataClasses.Member member;
}
