
package BL.Front;

import java.util.ArrayList;


import BL.DataClasses.User;
import BL.DataClasses.Notification;
import BL.TechnicalClasses.NotificationManager;


public class NotificationFacade {


	public NotificationManager notificationManager;
	
	
	public NotificationFacade(){
		this.notificationManager = new NotificationManager();
	}
    public ArrayList<Notification> readNotifications(User currentUser) {        
        return notificationManager.readNotifications(currentUser);
    } 


    public boolean deleteNotifications (User currentUser) {        
        return notificationManager.deleteNotifications(currentUser);
    } 
 }
