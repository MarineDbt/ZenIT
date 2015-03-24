
package BL.TechnicalClasses;
import java.util.ArrayList;

import BL.DataClasses.*;
import ConnectionToPersistence.AbstractPersistenceHandlerFactory;
import ConnectionToPersistence.NotificationAbstractPersistenceHandler;
/**
 * 
 * 
 * @poseidon-object-id [I395d852m14bf5118266mm6878]
 */
public class NotificationManager {

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I395d852m14bf5118266mm685f]
 * @param User 
 * @return 
 */
    public ArrayList<Notification> readNotifications(User currentUser) {        
    	NotificationAbstractPersistenceHandler notificationPersistenceHandler = AbstractPersistenceHandlerFactory.getFactory().createNotificationPersistenceHandler();
    	return notificationPersistenceHandler.selectNotificationsFromUser(currentUser);
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I395d852m14bf5118266mm683a]
 * @param User 
 * @return 
 */
    public boolean deleteNotifications(User currentUser) {        
        // your code here
        return false;
    } 
 }
