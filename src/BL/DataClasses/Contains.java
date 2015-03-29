

package BL.DataClasses;
/**
 * 
 * 
 */
public class Contains {

public Contains(int i, Product product2) {
		this.setQuantity(i);
		this.product=product2;
	}

public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
/**
 * <p>Represents ...</p>
 * 
 */
    private int quantity;
/**
 * 
 * 
 * 
 * @poseidon-type BL.DataModel.Cart
 */
    public BL.DataClasses.Cart cart;
/**
 * 
 * 
 * 
 * @poseidon-type BL.DataModel.Product
 */
    public BL.DataClasses.Product product;
 }
