
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
    private string firstname;

/**
 * <p>Represents ...</p>
 * 
 */
    private string surname;

/**
 * <p>Represents ...</p>
 * 
 */
    private string street;

/**
 * <p>Represents ...</p>
 * 
 */
    private string PC;

/**
 * <p>Represents ...</p>
 * 
 */
    private string city;

/**
 * <p>Represents ...</p>
 * 
 */
    private string phone;

/**
 * <p>Represents ...</p>
 * 
 */
    private string id;

/**
 * <p>Represents ...</p>
 * 
 */
    private string pwd;
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
