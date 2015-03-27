
package BL.DataClasses;

/**
 * 
 * 
 */
public class Product {


	private int id_product;

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
	private String subcategory_name;
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
	public Product(int id, String string, double d, double d2, String sub) {
		this.id_product=id;
		this.nameProduct=string;
		this.price = d;
		this.discount = d2;
		this.subcategory_name=sub;
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
	public int getId_product() {
		return id_product;
	}
	public double getDiscount() {
		return discount;
	}
	public String getSubcategory_name() {
		return subcategory_name;
	}


}
