
package BL.TechnicalClasses;

import BL.DataClasses.User;
import ConnectionToDB.ConnectionToMySQL;

/**
 * 
 * 
 * @poseidon-object-id [Im619706dm14c21d41ce6mm758e]
 */
public class AdhesionQueryHandler extends AdhesionPersistenceHandler {

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im619706dm14c21d41ce6mm7557]
 * @param User 
 * @return 
 */
    public boolean adhesionValidation(User currentUser) {        
        
    	int result = 0;
    	result = ConnectionToMySQL.requestInsertQuery("insert into Member values ('" + currentUser.getID() + "');");
    	return (result==1);
    } 
 }
