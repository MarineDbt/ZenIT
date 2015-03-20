import java.awt.EventQueue;
import java.sql.ResultSet;

import UI.UIOrderManagement;
import BL.Front.OrderFacade;
import ConnectionToDB.ConnectionToMySQL;

import BL.TechnicalClasses.*;

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
					
					UIOrderManagement frame = new UIOrderManagement(factory);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
