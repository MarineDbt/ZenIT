
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
    private String nameProduct;

/**
 * <p>Represents ...</p>
 * 
 */
    private double price;

/**
 * <p>Represents ...</p>
 * 
 */
    private double discount;
/**
 * 
 * 
 */
    private String subCategory_name;
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
public Product(String string, double d, double d2, String sub) {
	this.nameProduct=string;
	this.price = d;
	this.discount = d2;
	this.subCategory_name=sub;
}
public String getNameProduct() {
	return nameProduct;
}
public void setNameProduct(String nameProduct) {
	this.nameProduct = nameProduct;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
 }
