
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
	UserService userService;
	
	/*
	 * Dictionnary of Products
	 */
	HashMap<Product,String> products;
	
	/*
	 * Dictionnary of Categories
	 */
	HashMap<Category,String> categories;
	
	/*
	 * subDictionnary of Categories
	 */
	HashMap<SubCategory, String> subCategories;
	
	//MemberFacade memberFacade= null;
	//ContributorFacade contributorFacade = null;
	
	
	/*un utilisateur peut voir la liste des produits*/
	HashMap<UserRole,String> userRoles;
	
	/*
	 * currentUser, on pourra donc aussi accéder aux objets associés
	 */
	
	User currentUser;
	 
	
	public UserFacade(){
		userService = new UserService();
		currentUser=null;
		products=null;
		categories=null;
		subCategories=null;
	}
	 /*charge la persistance nécessaire à userFacade*/
	 public void loadData(){
		 //TODO
	 }
 }
