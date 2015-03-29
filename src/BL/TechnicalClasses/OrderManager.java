
package BL.TechnicalClasses;

import java.util.ArrayList;

import BL.DataClasses.Order;

/**
 * 
 * 
 * @poseidon-object-id [Im619706dm14c21d41ce6mm7d02]
 */
public class OrderManager {
	
	private OrderPersistenceHandler MyOrderPersistenceHandler;
	
	public OrderManager(AbstractPersistenceHandlerFactory factory) {
		MyOrderPersistenceHandler = factory.createOrderPersistenceHandler();
	}
	
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im619706dm14c21d41ce6mm7ce9]
 * @param Order 
 * @return 
 */
    public boolean cancelOrder(Order order) {        
        return this.MyOrderPersistenceHandler.cancelOrder(order);
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im619706dm14c21d41ce6mm7c7a]
 * @param Order 
 * @return 
 */
    public boolean acceptOrder(Order order) {        
        return this.MyOrderPersistenceHandler.acceptOrder(order);
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im619706dm14c21d41ce6mm7c55]
 * @return 
 */
    public ArrayList<Order> getOrders() {        
        return this.MyOrderPersistenceHandler.getOrders();
    } 
 }
