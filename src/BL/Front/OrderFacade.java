
package BL.Front;
import java.util.ArrayList;

import BL.DataClasses.Order;
import BL.TechnicalClasses.AbstractPersistenceHandlerFactory;
import BL.TechnicalClasses.OrderManager;

/**
 * 
 * 
 * @poseidon-object-id [I7e6badf8m14c21c9ffdfmm7d9e]
 */
public class OrderFacade {

	private OrderManager orderManager;

	public OrderFacade (AbstractPersistenceHandlerFactory factory) {
		this.orderManager = new OrderManager(factory);
	}
	
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I7e6badf8m14c21c9ffdfmm7d3d]
 * @param Order 
 * @return 
 */
    public boolean cancelOrder(Order order) {        
        // your code here
        return this.orderManager.cancelOrder(order);
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I7e6badf8m14c21c9ffdfmm7cce]
 * @param Order 
 * @return 
 */
    public boolean acceptOrder(Order order) {        
        // your code here
        return this.orderManager.acceptOrder(order);
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I7e6badf8m14c21c9ffdfmm7ca9]
 * @return 
 */
    public ArrayList<Order> getOrders() {      
    	
		return this.orderManager.getOrders();
    } 
 }
