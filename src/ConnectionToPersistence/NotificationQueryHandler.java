
package ConnectionToPersistence;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import BL.DataClasses.*;
import BL.TechnicalClasses.NotificationFactory;
import BL.TechnicalClasses.UserFactory;


public class NotificationQueryHandler extends NotificationAbstractPersistenceHandler {


    public ArrayList<Notification> selectNotificationsFromUser(User currentUser) {        
    	ResultSet resultSet = null;

		try {
			String query ="select * from Notification where id_user_receive = '"+currentUser.getId()+"';";
			System.out.println(query);
			resultSet=ConnectionToMySQL.requestSelectQuery(query);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			resultSet.beforeFirst();
			ArrayList<Notification> notifications = new ArrayList<Notification>();
			String label;
			String sender_id;
			NotificationFactory notificationFactory = new NotificationFactory();
			if (resultSet.isBeforeFirst()){
				while (!resultSet.isAfterLast()){
					resultSet.next();
					System.out.println(resultSet.isAfterLast());
					System.out.println(resultSet.isBeforeFirst());
					label = resultSet.getString(resultSet.findColumn("label"));
					sender_id = resultSet.getString(resultSet.findColumn("id_user_send"));
					notifications.add(notificationFactory.createNotification(sender_id,currentUser.getId(),label));
				}
			}
			return notifications;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
    } 


    public boolean deleteNotifications(User currentUser) {        
        // your code here
        return false;
    }
 
 }
