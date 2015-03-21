import java.awt.EventQueue;
import java.sql.ResultSet;
import java.util.ArrayList;

import UI.AdminUI;
import UI.PanelRoom;
import UI.UISubscription;
import BL.Front.*;
import BL.ModelClasses.*;
import BL.TechnicalClasses.*;
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
		AbstractPersistenceHandlerFactory factory = DatabaseQueryHandlerFactory.createFactory();
		RoomFacade facade = new RoomFacade(factory);
		//Room myRoom = new Room("7",50);
		//Accessory myAccessory = new Accessory("Tapis");
		boolean requete;
		ArrayList<Room> myRooms = facade.getAllRooms();
		ArrayList<Accessory> myAccessories = facade.getAllAccessories();
		
		if(myAccessories != null) {
			
		System.out.println("tableau non null");
		
		for(Accessory myAccessory: myAccessories)
		{
			System.out.println("Nom de l'accessoire : "+myAccessory.getName());
		}
		
		}
		
		else 
		{
			System.out.println("tableau null");
		}
		/*if (requete) 
		{
			System.out.println("insert ok");
		}
		else
		{
			System.out.println("erreur");
		}

	}*/

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AbstractPersistenceHandlerFactory factory = DatabaseQueryHandlerFactory.createFactory();
					AdminUI UI = new AdminUI(factory);
					
					UI.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
