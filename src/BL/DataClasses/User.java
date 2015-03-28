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
	/**
	 *
	 *
	 *
	 * @poseidon-type BL.DataModel.UserRole
	 */
	public java.util.Collection userRole = new java.util.TreeSet();
	
	public User(String id, String firstname, String lastname, String street, String PC,
			String city, String phone, String email, String pwd) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.street = street;
		this.PC = PC;
		this.city = city;
		this.phone = phone;
		this.email = email;
		this.pwd = pwd;
	}
	public User(String id) {
		this.id = id;
	}
	
	public String getID() {
		return this.id;
	}
	public String getStreet() {
		return this.street;
	}
	public String getPC() {
		return this.PC;
	}
	public String getCity() {
		return this.city;
	}
	/**
	 * Delete the user account
	 */
	public void deleteAccount(){
		//TODO
	}
}