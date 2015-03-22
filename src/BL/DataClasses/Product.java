
package BL.DataClasses;

/**
 * 
 * 
 */
public class Product {

/**
 * <p>Represents ...</p>
 * 
 */
    private int nameProduct;

/**
 * <p>Represents ...</p>
 * 
 */
    private float price;

/**
 * <p>Represents ...</p>
 * 
 */
    private float discount;
/**
 * 
 * 
 */
    public BL.DataClasses.SubCategory subCategory;
/**
 * 
 * 
 * 
 * @poseidon-type BL.DataModel.Contains
 */
    public java.util.Collection contains = new java.util.TreeSet();
/**
 * 
 * 
 */
    public BL.DataClasses.Sells sells;
 }
