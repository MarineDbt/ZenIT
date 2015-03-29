
package BL.TechnicalClasses;
import java.util.ArrayList;
import BL.DataClasses.*;
import ConnectionToPersistence.AbstractPersistenceHandlerFactory;
import ConnectionToPersistence.NotificationAbstractPersistenceHandler;

/**
 * Manages Notification objects
 * 
 * @author Elie GALLET
 * @version 1.0
 * @date March 2015
 * @see Notification
 * 
 */
public class NotificationManager {

/**
 * Looks in persistence for the notifications of the current user
 * 
 * @param currentUser : current user
 * @return list of notification received by the current user
 * @see NotificationAbstractPersistenceHandler
 */
    public ArrayList<Notification> readNotifications(User currentUser) {        
    	NotificationAbstractPersistenceHandler notificationPersistenceHandler = AbstractPersistenceHandlerFactory.getFactory().createNotificationPersistenceHandler();
    	return notificationPersistenceHandler.selectNotificationsFromUser(currentUser);
    } 

/**
 * Deletes in persistence notifications of the current user
 * 
 * @param  currentUser : current user logged
 * @return boolean, whether the deletion worked or not
 * @see NotificationAbstractPersistenceHandler
 */
    public boolean deleteNotifications(User currentUser) {
    	NotificationAbstractPersistenceHandler notificationPersistenceHandler = AbstractPersistenceHandlerFactory.getFactory().createNotificationPersistenceHandler();
    	return notificationPersistenceHandler.deleteNotifications(currentUser);       
    } 
 }
