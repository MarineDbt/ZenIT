
package BL.TechnicalClasses;

import java.util.ArrayList;

import BL.DataClasses.Member;
import BL.DataClasses.Product;

/**
 * 
 * 
 * @poseidon-object-id [Im619706dm14c21d41ce6mm77fa]
 */
public class ProductQueryHandler extends ProductPersistanceHandler {

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im619706dm14c21d41ce6mm77e1]
 * @param String 
 * @param float 
 * @param float 
 * @param Member 
 * @param int 
 * @param String 
 * @return 
 */
    public boolean addProduct(String name, float price,float discount,Member currentMember,int quantity, String subcategory) {        
        // your code here
        return false;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im619706dm14c21d41ce6mm77bc]
 * @param Product 
 * @return 
 */
    public boolean modifyProduct(Product product) {        
        // your code here
        return false;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im619706dm14c21d41ce6mm7797]
 * @param Product 
 * @return 
 */
    public boolean deleteProduct(Product product) {        
        // your code here
        return false;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im619706dm14c21d41ce6mm7772]
 * @param Member 
 * @return 
 */
    public ArrayList<Product> getProducts(Member currentmember) {        
        // your code here
        return null;
    }


 }
