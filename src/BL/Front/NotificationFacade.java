
package BL.Front;

import java.util.ArrayList;


import BL.DataClasses.User;
import BL.DataClasses.Notification;
import BL.TechnicalClasses.NotificationManager;

/**
 * Used to access to functionalities about notifications in a more abstract way, hiding the data
 * 
 * @author Elie GALLET
 * @version 1.0
 * @date march 2015
 * 
 *
 */
public class NotificationFacade {

	/**
	 * Unique delegate used by every methods of the facade
	 * @see NotificationManager
	 */
	private NotificationManager notificationManager;
	
	/**
	 * Basic constructor
	 * initializes the notification manager
	 */
	public NotificationFacade(){
		this.notificationManager = new NotificationManager();
	}
	
	/**
	 * @see NotificationManager
	 */
    public ArrayList<Notification> readNotifications(User currentUser) {        
        return notificationManager.readNotifications(currentUser);
    } 
    
    /**
	 * @see NotificationManager
	 */
    public boolean deleteNotifications (User currentUser) {        
        return notificationManager.deleteNotifications(currentUser);
    } 
 }
