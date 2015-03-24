
package BL.DataClasses;

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
    public BL.DataClasses.NotificationCenter notificationCenter;
	/**
	 * 
	 * 
	 */
    public BL.DataClasses.Cart cart;
    
    public User(String firstname2, String lastname, String street2, String pC2,
		String city2, String phone2, String email, String id2, String pwd2) {

    }
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String string, String string2) {
		this.id=string;
		this.pwd=string2;
	}
	/**
     * Delete the user account
     */
    public void deleteAccount(){
    	//TODO
    }
	public boolean isMember() {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean isContributor() {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean isAdmin() {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean isSupervisor() {
		// TODO Auto-generated method stub
		return false;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
 }
