import java.awt.EventQueue;
import java.sql.ResultSet;

import UI.UIAdhesion;
import UI.UIPayment;
import BL.DataClasses.User;
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
					User currentUser = new User("1");
					UIPayment frame = new UIPayment(factory, currentUser);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
