import java.awt.EventQueue;
import java.sql.ResultSet;

import UI.UISubscription;
import BL.Front.*;
import BL.ModelClasses.*;
import BL.TechnicalClasses.*;
import ConnectionToDB.ConnectionToMySQL;

/**
 * Launch the application
 * 
 * @author Mégane Martinez
 *
 */
public class Launcher {

	/*test DB ok*/
	public static void main(String[] args) {
		//ResultSet r= ConnectionToMySQL.requestSelectQuery("select * from User");
		//System.out.println(r);
		AbstractPersistenceHandlerFactory factory = DatabaseQueryHandlerFactory.createFactory();
		RoleManagementFacade facade = new RoleManagementFacade(factory);
		User myUser = new User("2");
		boolean result = facade.createContributor(myUser,"Conférencier zumba");
		if(result)
		{
			System.out.println("insertion ok");
		}
		else
		{
			System.out.println("echec");
		}
		
		
	}

	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UISubscription frame = new UISubscription();
					frame.userFacade = new UserFacade();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

}
