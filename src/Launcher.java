import java.awt.EventQueue;
import java.sql.ResultSet;











import UI.AddEventTypeUI;
import UI.DescActivityUI;
import UI.ErrorAddActivityUI;
import UI.SupervisorUI;
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
					User user = new User("MarineDbt", "Marine", "Dubédat");
					Activity act = new Activity();

					AddEventTypeUI frame = new AddEventTypeUI(factory, user,act);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
