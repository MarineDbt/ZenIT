
package BL.DataClasses;

/**
 * 
 * 
 */
public class Product {

    public int id_product;

	private String nameProduct;

    private float price;

    private float discount;

    public String subcategory_name;

    public int quantity;
    
    public String product_description;
	
    public Product(int id_product2, String nameProduct2, float price2, float discount2, int quantity2, String subcategory_name2, String product_description2) {
    	this.id_product = id_product2;
    	this.nameProduct = nameProduct2;
		this.price = price2;
		this.discount = discount2;
		this.quantity = quantity2;
		this.subcategory_name = subcategory_name2;
		this.product_description = product_description2;
	}

	public int getID() {
		return this.id_product;
	}
 }
