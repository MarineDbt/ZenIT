
package BL.TechnicalClasses;

import java.util.ArrayList;

import BL.DataClasses.Order;

/**
 * 
 * 
 * @poseidon-object-id [Im619706dm14c21d41ce6mm7b03]
 */
public abstract class OrderPersistenceHandler {

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im619706dm14c21d41ce6mm7ab4]
 * @param Order 
 * @return 
 */
    public abstract boolean cancelOrder(Order order);

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im619706dm14c21d41ce6mm7a45]
 * @param Order 
 * @return 
 */
    public abstract boolean acceptOrder(Order order);

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im619706dm14c21d41ce6mm7a20]
 * @return 
 */
    public abstract ArrayList<Order> getOrders();
 }
