
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
    private BL.DataClasses.SubCategory subCategory;
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
public Product(String string, double d, SubCategory sub) {
	this.nameProduct=string;
	this.price = d;
	this.subCategory=sub;
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
public BL.DataClasses.SubCategory getSubCategory() {
	return subCategory;
}
public void setSubCategory(BL.DataClasses.SubCategory subCategory) {
	this.subCategory = subCategory;
}
 }
