
package BL.Front;

import java.util.HashMap;

import BL.ApplicationClasses.ConnectionToDB;
import BL.ApplicationClasses.UserService;
import BL.DataClasses.*;

/**
 * 
 * 
 */
public class UserFacade {
	
	/*
	 * To be able to login and register
	 */
	protected UserService userService;
	
	/*
	 * Dictionnary of Products
	 */
	protected HashMap<Product,String> products;
	
	/*
	 * Dictionnary of Categories
	 */
	protected HashMap<Category,String> categories;
	
	/*
	 * subDictionnary of Categories
	 */
	protected HashMap<SubCategory, String> subCategories;
	
	//MemberFacade memberFacade= null;
	//ContributorFacade contributorFacade = null;
	
	
	/*un utilisateur peut voir la liste des produits*/
	protected HashMap<UserRole,String> userRoles;
	
	/*
	 * currentUser, on pourra donc aussi accéder aux objets associés
	 */
	
	protected User currentUser;
	 
	
	public UserFacade(){
		userService = new UserService();
		currentUser=null;
		products=null;
		categories=null;
		subCategories=null;
	}
	
	public User register(String firstname, String lastname, String street, String PC, String city, String phone, String email, String id, String psw){
		return this.userService.register(firstname, lastname, street, PC, city, phone, email, id, psw);
	}
	
	 /*load persistance relative to user*/
	 public void loadData(){
		 //TODO
	 }
 }
