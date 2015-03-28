
package BL.DataClasses;

import java.util.ArrayList;

/**
 * 
 * 
 */
public class Cart {
	
	public ArrayList<Contains> contains;

	public Cart() {
		this.contains= new ArrayList<Contains>();
	}
	
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

}
