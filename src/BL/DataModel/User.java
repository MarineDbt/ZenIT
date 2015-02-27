
package BL.DataModel;

/**
 * 
 * 
 */
public class User {

/**
 * <p>Represents ...</p>
 * 
 */
    private String firstname;

/**
 * <p>Represents ...</p>
 * 
 */
    private String surname;

/**
 * <p>Represents ...</p>
 * 
 */
    private String street;

/**
 * <p>Represents ...</p>
 * 
 */
    private String PC;

/**
 * <p>Represents ...</p>
 * 
 */
    private String city;

/**
 * <p>Represents ...</p>
 * 
 */
    private String phone;

/**
 * <p>Represents ...</p>
 * 
 */
    private String id;

/**
 * <p>Represents ...</p>
 * 
 */
    private String pwd;
/**
 * 
 * 
 */
    public BL.DataModel.NotificationCenter notificationCenter;
/**
 * 
 * 
 */
    public BL.DataModel.Cart cart;
/**
 * 
 * 
 * 
 * @poseidon-type BL.DataModel.UserRole
 */
    public java.util.Collection userRole = new java.util.TreeSet();
 }
