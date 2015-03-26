package BL.TechnicalClasses;

import BL.DataClasses.Product;
import BL.DataClasses.SubCategory;

public class ProductFactory {

	public Product createProduct(String nom, double price, SubCategory subCategory){
		return new Product(nom, price, subCategory);
	}
}
