import java.awt.EventQueue;
import java.sql.ResultSet;

import UI.UIProduct;
import UI.UIAddProduct;
import BL.Front.*;
import BL.DataClasses.*;
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


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AbstractPersistenceHandlerFactory factory = DatabaseQueryHandlerFactory.createFactory();
					UIAddProduct frame = new UIAddProduct(factory);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
