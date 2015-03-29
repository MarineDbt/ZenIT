
package BL.DataClasses;

/**
 * 
 * 
 */
public class Order {

	private int id_order;
	
    private int paymentMean;
    
    private String id_user;
    
    public Order(int id_order, int paymentMean, String id_user) {
    	this.id_order = id_order;
    	this.paymentMean = paymentMean;
    	this.id_user = id_user;
    }
    
    public int getID() {
    	return this.id_order;
    }
    
    public int getPaymentMean() {
    	return this.paymentMean;
    }
    
    public String getUser() {
    	return this.id_user;
    }
    
 }
