
package ConnectionToPersistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import BL.DataClasses.*;
import BL.TechnicalClasses.CartFactory;
import BL.TechnicalClasses.ContainsFactory;
import BL.TechnicalClasses.NotificationFactory;
import BL.TechnicalClasses.ProductFactory;
import BL.TechnicalClasses.UserFactory;
/**
 * 
 * 
 * @poseidon-object-id [I395d852m14bf5118266mm66ad]
 */
public class ShoppingQueryHandler extends ShoppingAbstractPersistenceHandler {

	private ContainsFactory containsFactory;
	private ProductFactory productFactory;
	private CartFactory cartFactory;
	
	public ShoppingQueryHandler(){
		containsFactory = new ContainsFactory();
		productFactory = new ProductFactory();
		cartFactory = new CartFactory();
	}
	/**
	 * <p>Does ...</p>
	 * 
	 * @poseidon-object-id [I395d852m14bf5118266mm6694]
	 * @param User 
	 */
	public  ArrayList<Order>lookForOrders(User currentUser) {
		return null;        
		// your code here
	} 

	/**
	 * <p>Does ...</p>
	 * 
	 * @poseidon-object-id [I395d852m14bf5118266mm667c]
	 * @param User 
	 * @return 
	 */
	public boolean cancelOrder(User currentUser) {        
		// your code here
		return false;
	} 

	public boolean validateOrder(User currentUser) {        
		// your code here
		return false;
	} 

	public ArrayList<Product> lookForProduct(String categoryName,  String subcategoryName) {        
		// your code here
		return null;    }

	@Override
	public Cart lookForCart(User user) {
		ResultSet resultSet = null;

		try {
			String query = ""
					+ "select * from Orders, OrdersProduct, Product, SubCategory"
					+ "where Orders.id_order = OrdersProduct.id_order"
					+ "and OrdersProduct.id_product = Product.id_product "
					+ "and Orders.id_user = '"+user.getId()+"' "
					+ "and state = 'cart'"
					+ "and Product.subCategory_name = SubCategory.subCategory_name;";
			resultSet=ConnectionToMySQL.requestSelectQuery(query);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			resultSet.beforeFirst();
			ArrayList<Contains> cart = new ArrayList<Contains>();
			String name;
			int quantity;
			double price;
			double discount;
			String subCategory_name;
			String category_name;
			if (resultSet.isBeforeFirst()){
				resultSet.next();
				while (!resultSet.isAfterLast()){
					name = resultSet.getString(resultSet.findColumn("nameProduct"));
					price = resultSet.getDouble(resultSet.findColumn("price"));
					discount = resultSet.getDouble(resultSet.findColumn("discount"));
					subCategory_name = resultSet.getString(resultSet.findColumn("subCategory_name"));
					category_name = resultSet.getString(resultSet.findColumn("nameProduct"));
					quantity = resultSet.getInt(resultSet.findColumn("id_user_send"));
					notifications.add(notificationFactory.createNotification(sender_id,currentUser.getId(),label));
					resultSet.next();
				}
			}
			return cart;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	} 
}
