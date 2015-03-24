
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
    public NotificationCenter notificationCenter;
	/**
	 * 
	 * 
	 */
    public Cart cart;
    
	/**
	 * 
	 *
	 */
    
    private Contributor contributor;
    
    private Member member;
    
    
    public java.util.Collection userRole = new java.util.TreeSet();
    
    /* Constructors */
    
    public User(String firstname2, String lastname, String street2, String pC2,
		String city2, String phone2, String email, String id2, String pwd2) {
	// TODO Auto-generated constructor stub
    }
    
    public User(String id, Contributor myContributor)
    {
    	this.id = id;
    	this.contributor = myContributor;
    }
    
    public User(String id_user, String firstname2, String lastname,
			Contributor myContributor) {
		id = id_user;
		firstname = firstname2;
		surname = lastname;
		contributor = myContributor;
	}

	public User(String id_user, String firstname2, String lastname, Member myMember) {
		id = id_user;
		firstname = firstname2;
		surname = lastname;
		member = myMember;
	}

	public User(String string) {
		id = string;
	}

	/* Getters */
    public String getId()
    {
    	return id;
    }
    
    /* Setters */
    public void setContributor(Contributor myContributor)
    {
    	contributor = myContributor;
    }
    
    public void setMember(Member myMember)
    {
    	member = myMember;
    }
	/**
     * Delete the user account
     */
    public void deleteAccount(){
    	//TODO
    }
 }
