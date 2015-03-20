
package ConnectionToPersistance.DB.UserUseCases;
import java.util.ArrayList;

import BL.DataClasses.*;
import ConnectionToPersistance.UserUseCases.NotificationAbstractPersistenceHandler;

/**
 * 
 * 
 * @poseidon-object-id [I395d852m14bf5118266mm660f]
 */
public class NotificationQueryHandler extends NotificationAbstractPersistenceHandler {

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I395d852m14bf5118266mm65f6]
 * @param User 
 * @return 
 */
    public ArrayList<Notification> lookForNotifications(User currentUser) {        
        // your code here
        return null;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I395d852m14bf5118266mm65de]
 * @param User 
 * @return 
 */
    public boolean deleteNotifications(User currentUser) {        
        // your code here
        return false;
    } 
 }
