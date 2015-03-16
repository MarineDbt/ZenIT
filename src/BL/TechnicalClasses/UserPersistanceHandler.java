
package BL.TechnicalClasses;

import BL.DataClasses.*;
/**
 * 
 * 
 * @poseidon-object-id [Im4bef336fm14c19425b18mm6a21]
 */
public abstract class UserPersistanceHandler {

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im4bef336fm14c19425b18mm69a1]
 * @param String 
 * @param String 
 * @return 
 */
    public abstract boolean checkPassword(String id,  String pwd);

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im4bef336fm14c19425b18mm699d]
 * @param User 
 * @return 
 */
    public abstract boolean deleteUser(User currentUser);

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im4bef336fm14c19425b18mm6999]
 * @param User 
 * @return 
 */
    public abstract boolean updateUser(User currentUser);

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im4bef336fm14c19425b18mm6995]
 * @param User 
 */
    public abstract  User lookForUserInfo(User currentUser);

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im4bef336fm14c19425b18mm6991]
 * @param String 
 * @param String 
 * @param .. 
 * @param boolean 
 */
    public abstract boolean register(String id, String pwd, ..);
 
}