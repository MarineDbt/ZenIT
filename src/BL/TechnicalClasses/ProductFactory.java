package BL.TechnicalClasses;

import BL.DataClasses.Contains;
import BL.DataClasses.Product;

/**
 * Used to create instances of Product
 * 
 * @author Elie GALLET
 * @version 1.0
 * @date March 2015
 * @see Product
 * 
 */
public class ProductFactory {

	/**
	 * Creates a Product
	 * 
	 * @param id_product : the identifier of the product
	 * @param name : name of the product
	 * @param price : price of the product
	 * @param discount : discount of the product
	 * @param subCategory_name : name of the subcategory of the product
	 * @return
	 */
	public Product createProduct(int id_product, String name, double price,double discount, String subCategory_name){
		return new Product(id_product, name, price,discount, subCategory_name);
	}
}
