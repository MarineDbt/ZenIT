
package BL.DataModel;

/**
 * 
 * 
 */
public class Cart {
/**
 * 
 * 
 */
    public BL.DataModel.User user;
/**
 * 
 * 
 */
    public BL.DataModel.Order order;
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
    public BL.DataModel.Member member;
 }
