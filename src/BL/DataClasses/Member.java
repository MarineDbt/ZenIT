
package BL.DataClasses;

/**
 * 
 * 
 */
public class Member extends BL.DataClasses.UserRole {

	private int id_member;
	
	private String id_user;
	
	private int id_supervisor;
	
	private int id_administrator;
	
	public Member(int id_member2, String id_user2) {
		this.id_member = id_member2;
		this.id_user = id_user2;
	}
	
	public Member(int id_member2, String id_user2, int id_supervisor2, int id_administrator2) {
		this.id_member = id_member2;
		this.id_user = id_user2;
		this.id_supervisor = id_supervisor2;
		this.id_administrator = id_administrator2;
	}
	
	public int getID() {
		return this.id_member;
	}
}
