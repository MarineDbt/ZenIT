package BL.TechnicalClasses;

import BL.DataClasses.Notification;

/**
 * Used to create instances of Contains
 * 
 * @author Elie GALLET
 * @version 1.0
 * @date March 2015
 * @see Notification
 * 
 */
public class NotificationFactory {
	
	/**
	 * Creates a Notification
	 * 
	 * @param sender_id : the identifier of the user who is the source of the notification
	 * @param receiver_id : the identifier of the use who received the notification
	 * @param label : description of the notification
	 * @return the notification that has been created
	 */
	public Notification createNotification(String sender_id,String receiver_id, String label) {
		
		Notification newNot = new Notification(sender_id, receiver_id, label);
		
		return newNot;
		
	}
}
