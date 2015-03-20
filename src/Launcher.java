import java.awt.EventQueue;
import java.sql.ResultSet;

import UI.ActivityUI;
import UI.UISubscription;
import UI.UISupervisor;
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
					
					UISupervisor frame = new UISupervisor(factory);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
