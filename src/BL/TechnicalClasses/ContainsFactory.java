package BL.TechnicalClasses;

import BL.DataClasses.Contains;
import BL.DataClasses.Product;

public class ContainsFactory {

	public Contains createContains(int quantity, Product product) {
		return new Contains(quantity,product);
	}

}
