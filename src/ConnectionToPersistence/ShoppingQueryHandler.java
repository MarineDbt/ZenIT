
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
import BL.TechnicalClasses.UserPasswordEncryptionHandler;
/**
 * 
 * 
 * @poseidon-object-id [I395d852m14bf5118266mm66ad]
 */
public class ShoppingQueryHandler extends ShoppingAbstractPersistenceHandler {

	public ShoppingQueryHandler(){
		this.containsFactory = new ContainsFactory();
		this.productFactory = new ProductFactory();
		this.cartFactory = new CartFactory();
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

	public Object[] selectCategories() {

		ResultSet resultSet = null;

		try {
			String query ="select * from Category;";
			System.out.println(query);
			resultSet=ConnectionToMySQL.requestSelectQuery(query);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			resultSet.beforeFirst();
			ArrayList<String> categories = new ArrayList<String>();
			String category_name;
			if (resultSet.isBeforeFirst()){
				resultSet.next();
				while (!resultSet.isAfterLast()){
					category_name = resultSet.getString(resultSet.findColumn("category_name"));
					categories.add(category_name);
					resultSet.next();
				}
			}
			return categories.toArray();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public Object[] selectSubcategories(String category) {

		ResultSet resultSet = null;

		try {
			String query ="select * from Subcategory where category_name = '"+category+"';";
			System.out.println(query);
			resultSet=ConnectionToMySQL.requestSelectQuery(query);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			resultSet.beforeFirst();
			ArrayList<String> subcategories = new ArrayList<String>();
			String subcategory_name;
			if (resultSet.isBeforeFirst()){
				resultSet.next();
				while (!resultSet.isAfterLast()){
					subcategory_name = resultSet.getString(resultSet.findColumn("subcategory_name"));
					subcategories.add(subcategory_name);
					resultSet.next();
				}
			}
			return subcategories.toArray();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public ArrayList<Product> selectAllProducts() {
		ResultSet resultSet = null;

		try {
			String query = ""
					+ "select * from Product";
			resultSet=ConnectionToMySQL.requestSelectQuery(query);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			resultSet.beforeFirst();
			ArrayList<Product> products = new ArrayList<Product>();
			String name;
			double price;
			double discount;
			String subCategory_name;
			int id_product;

			if (resultSet.isBeforeFirst()){
				resultSet.next();
				while (!resultSet.isAfterLast()){
					name = resultSet.getString(resultSet.findColumn("nameProduct"));
					price = resultSet.getDouble(resultSet.findColumn("price"));
					discount = resultSet.getDouble(resultSet.findColumn("discount"));
					subCategory_name = resultSet.getString(resultSet.findColumn("subcategory_name"));
					id_product = resultSet.getInt(resultSet.findColumn("id_product"));
					products.add(productFactory.createProduct(id_product,name,price,discount,subCategory_name));
					resultSet.next();
				}
			}
			return products;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public ArrayList<Product> selectProductOfCategory(String category) {
		ResultSet resultSet = null;

		try {
			String query = ""
					+ "select * from Product,Subcategory where Product.subcategory_name=Subcategory.subcategory_name and Subcategory.category_name = '"+category+"';";
			resultSet=ConnectionToMySQL.requestSelectQuery(query);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			resultSet.beforeFirst();
			ArrayList<Product> products = new ArrayList<Product>();
			String name;
			double price;
			double discount;
			String subCategory_name;
			int id_product;

			if (resultSet.isBeforeFirst()){
				resultSet.next();
				while (!resultSet.isAfterLast()){
					name = resultSet.getString(resultSet.findColumn("nameProduct"));
					price = resultSet.getDouble(resultSet.findColumn("price"));
					discount = resultSet.getDouble(resultSet.findColumn("discount"));
					subCategory_name = resultSet.getString(resultSet.findColumn("subcategory_name"));
					id_product = resultSet.getInt(resultSet.findColumn("id_product"));
					products.add(productFactory.createProduct(id_product,name,price,discount,subCategory_name));
					resultSet.next();
				}
			}
			return products;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public ArrayList<Product> selectProductOfSubcategory(String subcategory) {
		ResultSet resultSet = null;

		try {
			String query = ""
					+ "select * from Product where subcategory_name = +'"+subcategory+"';";
			resultSet=ConnectionToMySQL.requestSelectQuery(query);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			resultSet.beforeFirst();
			ArrayList<Product> products = new ArrayList<Product>();
			String name;
			double price;
			double discount;
			String subCategory_name;
			int id_product;

			if (resultSet.isBeforeFirst()){
				resultSet.next();
				while (!resultSet.isAfterLast()){
					name = resultSet.getString(resultSet.findColumn("nameProduct"));
					price = resultSet.getDouble(resultSet.findColumn("price"));
					discount = resultSet.getDouble(resultSet.findColumn("discount"));
					subCategory_name = resultSet.getString(resultSet.findColumn("subcategory_name"));
					id_product = resultSet.getInt(resultSet.findColumn("id_product"));
					products.add(productFactory.createProduct(id_product,name,price,discount,subCategory_name));
					resultSet.next();
				}
			}
			return products;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
