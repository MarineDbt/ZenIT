
package BL.DataClasses;

/**
 * 
 * 
 */
public class Notification {
	
	private String id_user_send;
	String id_user_receive;
	private String label;
	
	public Notification(String sender_id,String string, String label) {
		this.setId_user_send(sender_id);
		this.id_user_receive=string;
		this.setLabel(label);
		
	}
public String getId_user_send() {
		return id_user_send;
	}
	public void setId_user_send(String id_user_send) {
		this.id_user_send = id_user_send;
	}
public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
/**
 * 
 * 
 */
    public BL.DataClasses.User user;
/**
 * 
 * 
 */
    public BL.DataClasses.NotificationCenter notificationCenter;
    
    
    
 }
