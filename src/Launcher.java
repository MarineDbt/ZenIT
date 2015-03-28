import java.awt.EventQueue;
import java.sql.ResultSet;
import java.util.ArrayList;

import UI.UIAdhesionPayment;
import UI.UIOrderPayment;
import BL.DataClasses.Member;
import BL.DataClasses.User;
import BL.DataClasses.Product;
import BL.Front.UserFacade;
import BL.TechnicalClasses.AbstractPersistenceHandlerFactory;
import BL.TechnicalClasses.DatabaseQueryHandlerFactory;
import ConnectionToDB.ConnectionToMySQL;

/**
 * Launch the application
 * 
 * @author Elie Gallet
 *
 */
public class Launcher {

	/*test DB ok*/
	/*public static void main(String[] args) {
		ResultSet r= ConnectionToMySQL.requestSelectQuery("select * from User");
		System.out.println(r);

	}*/

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AbstractPersistenceHandlerFactory factory = DatabaseQueryHandlerFactory.createFactory();
					/*User currentUser = new User("1", "Jackie", "Chan", "20, rue de la paix", "75000", "Paris", "0606060606", "jackiechandu34@yahoo.fr", "356a192b7913b04c54574d18c28d46e6395428ab");
					Member member = new Member("BeCool");
					ArrayList<Product> products = new ArrayList<Product>();
					Product product1 = new Product(1, "Shinai Bambou 2.0", (double)35, (double)0, 10, member, "Shinai", "pour s\'entrainer");
					products.add(product1);
					Product product2 = new Product(2, "Shinai Bambou 2.0", (double)35, (double)0, 10, member, "Shinai", "pour s\'entrainer");
					products.add(product2);
					Product product3 = new Product(3, "Shinai Bambou 2.0", (double)35, (double)0, 10, member, "Shinai", "pour s\'entrainer");
					products.add(product3);
					UIOrderPayment frame = new UIOrderPayment(factory, currentUser, products);*/
					User currentUser = new User("Jules");
					UIAdhesionPayment frame = new UIAdhesionPayment(factory, currentUser);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
