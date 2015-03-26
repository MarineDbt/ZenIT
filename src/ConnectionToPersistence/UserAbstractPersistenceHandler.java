
package ConnectionToPersistence;

import java.sql.SQLException;

import BL.DataClasses.*;
/**
 * 
 * 
 * @poseidon-object-id [Im4bef336fm14c19425b18mm6a21]
 */
public abstract class UserAbstractPersistenceHandler {

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im4bef336fm14c19425b18mm69a1]
 * @param String 
 * @param String 
 * @return 
 * @throws SQLException 
 */
    public abstract boolean checkPassword(String id,  String pwd) throws SQLException;

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im4bef336fm14c19425b18mm699d]
 * @param User 
 * @return 
 */
    public abstract boolean deleteUser(String id);

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im4bef336fm14c19425b18mm6999]
 * @param User 
 * @return 
 */
    public abstract boolean updateUser(String firstname, String lastname, String street, String PC, String city, String phone, String email, String id, String pwd);

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im4bef336fm14c19425b18mm6995]
 * @param User 
 * @return
 */
    public abstract User selectUser(String id);   

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im4bef336fm14c19425b18mm6991]
 * @param String 
 * @param String 
 * @param .. 
 * @param boolean 
 */
    public abstract boolean insertUser(String firstname, String lastname, String street, String PC, String city, String phone, String email, String id, String pwd);
	public abstract boolean isMember(String id);
	public abstract boolean isContributor(String id);
	public abstract boolean isSupervisor(String id);
	public abstract boolean isAdministrator(String id);
	public abstract boolean isUser(String id);
 
}