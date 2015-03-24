package BL.TechnicalClasses;

import BL.DataClasses.Notification;

public class NotificationFactory {
	
	public Notification createNotification(String sender_id,String string, String label) {
		
		Notification newNot = new Notification(sender_id,string, label);
		
		return newNot;
		
	}
}
