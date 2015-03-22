import java.awt.EventQueue;

import UI.SubscriptonUI;
import BL.Front.UserFacade;
import ConnectionToPersistence.ConnectionToMySQL;

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
					SubscriptonUI frame = new SubscriptonUI();
					frame.userFacade = new UserFacade();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
