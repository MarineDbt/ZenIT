import java.awt.EventQueue;
import java.sql.ResultSet;

import UI.ContributorUI;
import UI.UISubscription;
import BL.Front.UserFacade;
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
					ContributorUI frame = new ContributorUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
