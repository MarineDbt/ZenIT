
package BL.DataClasses;

/**
 * 
 * 
 */
public class Activity {

public Activity(String nameActivity, String shortDescription, String detailledDescription) {
		this.nameActivity = nameActivity;
		this.detailledDescription = detailledDescription;
		this.shortDescription = shortDescription;
	}
public Activity(String name) {
	this.nameActivity = name;
}
public Activity() {
	// TODO Auto-generated constructor stub
}
/**
 * <p>Represents ...</p>
 * 
 */
    private String nameActivity;

/**
 * <p>Represents ...</p>
 * 
 */
    private String shortDescription;

/**
 * <p>Represents ...</p>
 * 
 */
    private String detailledDescription;
/**
 * 
 * 
 * 
 * @poseidon-type BL.DataModel.Event
 */
    public java.util.Collection event = new java.util.TreeSet();
/**
 * 
 * 
 * 
 * @poseidon-type BL.DataModel.Member
 */
    public java.util.Collection member = new java.util.TreeSet();
/**
 * 
 * 
 */
    public BL.DataClasses.Supervisor supervisor;
    
    public String getName(){
    	return this.nameActivity;
    }
 }
