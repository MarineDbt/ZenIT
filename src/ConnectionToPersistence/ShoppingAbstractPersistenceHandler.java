
package ConnectionToPersistence;

import java.util.ArrayList;

import BL.DataClasses.*;
import BL.TechnicalClasses.CartFactory;
import BL.TechnicalClasses.ContainsFactory;
import BL.TechnicalClasses.ProductFactory;

/**
 * 
 * 
 * @poseidon-object-id [Im4bef336fm14c19425b18mm67dc]
 */
public abstract class ShoppingAbstractPersistenceHandler {

	protected CartFactory cartFactory;
	protected ContainsFactory containsFactory;
	protected ProductFactory productFactory;

    public abstract  ArrayList<Order> lookForOrders(User currentUser);

    public abstract boolean cancelOrder(User currentUser);

    public abstract boolean validateOrder(User currentUser);

    public abstract ArrayList<Product> lookForProduct(String categoryName, String subcategoryName);
    
    public abstract Object[] selectCategories();
    
    public abstract Object[] selectSubcategories(String category);

	public abstract ArrayList<Product> selectAllProducts();

	public abstract ArrayList<Product> selectProductOfCategory(String category);
	
	public abstract ArrayList<Product> selectProductOfSubcategory(String subcategory);

	
 }
