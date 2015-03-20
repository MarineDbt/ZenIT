
package ConnectionToPersistance;

import java.util.ArrayList;

import BL.DataClasses.*;

/**
 * 
 * 
 * @poseidon-object-id [Im5b0428a3m14c21f9b331mm5e2f]
 */
public abstract class NotificationAbstractPersistenceHandler {

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im5b0428a3m14c21f9b331mm5e30]
 * @param User 
 * @return 
 */
    public abstract ArrayList<Notification> lookForNotifications(User currentUser);

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im5b0428a3m14c21f9b331mm5e35]
 * @param User 
 * @return 
 */
    public abstract boolean deleteNotifications(User currentUser);
 }
