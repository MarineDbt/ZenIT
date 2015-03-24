import java.awt.EventQueue;

import UI.LoginUI;
import BL.Front.UserFacade;
import ConnectionToPersistence.DatabaseQueryHandlerFactory;

/**
 * Launch the application
 * 
 * @author Elie Gallet
 *
 */
public class Launcher {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DatabaseQueryHandlerFactory.createFactory();
					LoginUI frame = new LoginUI();
					frame.userFacade = new UserFacade();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
