
package BL.Front;
import java.util.ArrayList;

import BL.DataClasses.Member;
import BL.DataClasses.Product;
import BL.TechnicalClasses.ProductManager;

/**
 * 
 * 
 * @poseidon-object-id [Im619706dm14c21d41ce6mm79c8]
 */
public class ProductFacade {

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im619706dm14c21d41ce6mm79af]
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
 * @poseidon-object-id [Im619706dm14c21d41ce6mm798a]
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
 * @poseidon-object-id [Im619706dm14c21d41ce6mm7965]
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
 * @poseidon-object-id [Im619706dm14c21d41ce6mm7940]
 * @param Member 
 * @return 
 */
    public ArrayList<Product> getProducts(Member currentmember) {        
        // your code here
        return null;
    } 
 }