package BL.TechnicalClasses;

import BL.DataClasses.Product;
import BL.DataClasses.SubCategory;

public class ProductFactory {

	public Product createProduct(String nom, double price,double discount, String subCategory_name){
		return new Product(nom, price,discount, subCategory_name);
	}
}
