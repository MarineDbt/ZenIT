
package BL.DataClasses;

/**
 * 
 * @author Elie Gallet
 *
 */
public class User {

    private String firstname;
    private String lastname;
    private String street;
    private String pc;
    private String city;
    private String phone;
    private String email;
    private String id;
    private String pwd;

    public boolean isMember;
    public boolean isContributor;
    public boolean isSupervisor;
    public boolean isAdministrator;
    
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
	public String getId() {
		return id;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public String getStreet() {
		return street;
	}
	public String getPc() {
		return pc;
	}
	public String getCity() {
		return city;
	}
	public String getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}
 }
