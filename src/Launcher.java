import java.awt.EventQueue;
import java.sql.ResultSet;








import UI.DescActivityUI;
import UI.ErrorAddActivityUI;
import UI.UIActivity;
import UI.UISubscription;
import UI.UpdateActivityUI;
import BL.DataClasses.Activity;
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
					User user = new User();
					Activity act = new Activity("Yoga", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
					
					UIActivity frame = new UIActivity(factory, user);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
