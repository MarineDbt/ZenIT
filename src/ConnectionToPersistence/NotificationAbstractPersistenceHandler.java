
package ConnectionToPersistence;

import java.util.ArrayList;

import BL.DataClasses.*;
import BL.TechnicalClasses.NotificationFactory;

public abstract class NotificationAbstractPersistenceHandler {

	protected NotificationFactory notificationFactory;
	
    public abstract ArrayList<Notification> selectNotificationsFromUser(User currentUser);

    public abstract boolean deleteNotifications(User currentUser);
    
 }
