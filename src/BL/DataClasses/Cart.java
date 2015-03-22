
package BL.DataClasses;

/**
 * 
 * 
 */
public class Cart {
/**
 * 
 * 
 */
    public BL.DataClasses.User user;
/**
 * 
 * 
 */
    public BL.DataClasses.Order order;
/**
 * 
 * 
 * 
 * @poseidon-type BL.DataModel.Contains
 */
    public java.util.Collection contains = new java.util.TreeSet();

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
