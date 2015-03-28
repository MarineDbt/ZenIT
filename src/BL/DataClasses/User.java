
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
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String id_user, String firstname2, String lastname,
			String street2, String pc2, String city2, String phone2) {
		this.city = city2;
		this.firstname = firstname2;
		this.id = id_user;
		this.surname = lastname;
		this.street = street2;
		this.PC = pc2;
		this.phone = phone2;
		
	}
	public User(String id_user, String firstname2, String lastname2) {
		this.id = id_user;
		this.firstname = firstname2;
		this.surname = lastname2;
	}
	/**
     * Delete the user account
     */
    public void deleteAccount(){
    	//TODO
    }
    
    public String getID() {
    return this.id;	
    }
    
    public String getLastname() {
    	return this.surname;
    }
    
    public String getFirstname() {
    	return this.firstname;
    }
    
	public boolean isMember() {
		// TODO Auto-generated method stub
		return true;
	}
	public boolean isContributor() {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean isSupervisor() {
		// TODO Auto-generated method stub
		return true;
	}
	public boolean isAdmin() {
		// TODO Auto-generated method stub
		return false;
	}
 }
