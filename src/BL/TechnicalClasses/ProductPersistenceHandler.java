package BL.TechnicalClasses;

import java.util.ArrayList;

import BL.DataClasses.Member;
import BL.DataClasses.Product;



/**
 * 
 * 
 * @poseidon-object-id [Im619706dm14c21d41ce6mm7735]
 */
public abstract class ProductPersistenceHandler {

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im619706dm14c21d41ce6mm771c]
 * @param String 
 * @param float 
 * @param float 
 * @param Member 
 * @param int 
 * @param String 
 * @param description
 * @return 
 */
    public abstract boolean addProduct(String name, double price, double discount, int quantity, Member currentMember, String subcategory, String description);

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im619706dm14c21d41ce6mm76f7]
 * @param Product 
 * @return 
 */
    public abstract boolean modifyProduct(Product product, String name, double price, double discount, int quantity, String description);

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im619706dm14c21d41ce6mm76b8]
 * @param Product 
 * @return 
 */
    public abstract boolean deleteProduct(Product product);

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im619706dm14c21d41ce6mm7693]
 * @param Member 
 * @return 
 */
    public abstract ArrayList<Product> getProducts(Member currentMember);
 }
