
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
    private String lastname;

	/**
	 * <p>Represents ...</p>
	 * 
	 */
    private String street;

	/**
	 * <p>Represents ...</p>
	 * 
	 */
    private String pc;

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
    
    private String email;
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
    
    public User(String firstname, String lastname, String street, String pc,
		String city, String phone, String email, String id, String pwd) {
    	this.firstname=firstname;
    	this.lastname=lastname;
    	this.street=street;
    	this.pc=pc;
    	this.city=city;
    	this.phone=phone;
    	this.email=email;
    	this.id=id;
    	this.pwd=pwd;

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
