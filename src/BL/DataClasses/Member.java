package BL.DataClasses;
/**
 *
 *
 */
public class Member extends BL.DataClasses.UserRole {
	private String id;
	public Member(String id) {
		this.id = id;
	}
	public String getID() {
		return this.id;
	}
}