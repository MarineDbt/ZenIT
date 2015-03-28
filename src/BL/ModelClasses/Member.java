
package BL.ModelClasses;

/**
 * 
 * 
 */
public class Member {
/**
 * 
 * 
 * 
 * @poseidon-type BL.DataModel.Activity
 */
    public java.util.Collection activity = new java.util.TreeSet();
/**
 * 
 * 
 * 
 * @poseidon-type BL.DataModel.Sells
 */
    public java.util.Collection sells = new java.util.TreeSet();
/**
 * 
 * 
 * 
 * @poseidon-type BL.DataModel.Cart
 */
    public java.util.Collection cart = new java.util.TreeSet();
/**
 * 
 * 
 * 
 * @poseidon-type BL.DataModel.MemberRole
 */
   private Supervisor supervisor;
   
   /* Constructors */
   
   public Member(Supervisor mySupervisor)
   {
	   supervisor = mySupervisor;
   }
 }
