
package BL.TechnicalClasses;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import BL.DataClasses.Order;
import ConnectionToDB.ConnectionToMySQL;

/**
 * 
 * 
 * @poseidon-object-id [Im619706dm14c21d41ce6mm7bfa]
 */
public class OrderQueryHandler extends OrderPersistenceHandler {

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im619706dm14c21d41ce6mm7be1]
 * @param Order 
 * @return 
 */
    public boolean cancelOrder(Order order) {    
    	
    	/* Declarations and initializations */
    	int result1 = 0;
    	int result2 = 0;
    	
    	/* Query execution delegated to ConnectionToMySQL */
    	result1 = ConnectionToMySQL.requestInsertQuery( "update Orders set state = 'refused' where id_order = " + order.getID() + ";");
    	
    	result2 = ConnectionToMySQL.requestInsertQuery( "insert into Notification (id_user_send, id_user_receive, message) values ('Admin', '" + order.getUser() + "','Votre commande n°" + order.getID() +" viens d'être annulée. Nous vous prions de vous excuser pour le désagrément encouru.');");
    	
    	/* Return value */
    	return (result1 == 1 && result2 == 1);
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im619706dm14c21d41ce6mm7b72]
 * @param Order 
 * @return 
 */
    public boolean acceptOrder(Order order) {        
    	
    	/* Declarations and initializations */
    	int result1 = 0;
    	int result2 = 0;
    	
    	/* Query execution delegated to ConnectionToMySQL */
    	result1 = ConnectionToMySQL.requestInsertQuery( "update Orders set state = 'accepted' where id_order = " + order.getID() + ";");
    	
    	result2 = ConnectionToMySQL.requestInsertQuery( "insert into Notification (id_user_send, id_user_receive, message) values ('Admin', '" + order.getUser() + "','Votre commande n°" + order.getID() +" viens d'être acceptée. Elle vous sera envoyée dans les plus brefs délais.');");
 
    	/* Return value */
    	return (result1 == 1 && result2 == 1);
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im619706dm14c21d41ce6mm7b4d]
 * @return 
 */
    public ArrayList<Order> getOrders() {        
    	
    	/* Declarations and initializations */
    	ResultSet result;
    	ArrayList<Order> myOrders = new ArrayList<Order>();
    	
    	/* Query execution delegated to ConnectionToMySQL */
    	result = ConnectionToMySQL.requestSelectQuery("Select * from Orders where state = 'cart';");
    	
    	try {
    	while (result.next()) {
    	int id_order = result.getInt(result.findColumn("id_order"));
    	int id_paymentMean = result.getInt(result.findColumn("id_paymentMean"));
    	String id_user = result.getString(result.findColumn("id_user"));
    	
    	Order order = new Order(id_order, id_paymentMean, id_user);
    	myOrders.add(order);
    	}
    	} catch (SQLException e) {
    	// TODO Auto-generated catch block
    	e.printStackTrace();
    	}
    	return myOrders;
    } 
 }
