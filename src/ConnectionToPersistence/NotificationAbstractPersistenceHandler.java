
package ConnectionToPersistence;

import java.util.ArrayList;

import BL.DataClasses.*;

public abstract class NotificationAbstractPersistenceHandler {

    public abstract ArrayList<Notification> selectNotificationsFromUser(User currentUser);

    public abstract boolean deleteNotifications(User currentUser);
    
 }
