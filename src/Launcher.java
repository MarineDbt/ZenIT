import java.awt.EventQueue;
import java.sql.ResultSet;
import java.util.ArrayList;

import UI.*;
import UI.AdminServiceUI;
import UI.AdminUI;
import UI.BaseUI;
import UI.PanelRoom;
import UI.UISubscription;
import BL.DataClasses.*;
import BL.Front.*;
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
					//AdminUI UI = new AdminUI(factory);
					//UI.setVisible(true);
					User user = new User();
					//AdminServiceUI UI2 = new AdminServiceUI(user,factory);
					//UI2.setVisible(true);
					
					AdminGestionSalle UI3 = new AdminGestionSalle(user,factory);
					UI3.setVisible(true);
					
					//AjouterSalleUI UI4 = new AjouterSalleUI(factory);
					//UI4.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
