
package BL.ModelClasses;

/**
 * 
 * @author Elie Gallet
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
    public BL.ModelClasses.NotificationCenter notificationCenter;
	/**
	 * 
	 * 
	 */
    public BL.ModelClasses.Cart cart;
    
	/**
	 * 
	 * 
	 * 
	 * @poseidon-type BL.DataModel.UserRole
	 */
    public java.util.Collection userRole = new java.util.TreeSet();
    public User(String firstname2, String lastname, String street2, String pC2,
		String city2, String phone2, String email, String id2, String pwd2) {
	// TODO Auto-generated constructor stub
    }
	/**
     * Delete the user account
     */
    public void deleteAccount(){
    	//TODO
    }
 }
