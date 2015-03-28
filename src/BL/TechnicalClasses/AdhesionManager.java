
package BL.TechnicalClasses;

import BL.DataClasses.User;

/**
 * 
 * 
 * @poseidon-object-id [Im619706dm14c21d41ce6mm75d9]
 */
public class AdhesionManager {

	private AdhesionPersistenceHandler myAdhesionPersistenceHandler;
	
	public AdhesionManager(AbstractPersistenceHandlerFactory factory, User currentUser) {
		myAdhesionPersistenceHandler = factory.createAdhesionPersistenceHandler();
	}

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im619706dm14c21d41ce6mm75c0]
 * @param User 
 * @return 
 */
    public boolean adhesionValidation(User currentUser) {       
        // your code here
        return this.myAdhesionPersistenceHandler.adhesionValidation(currentUser);
    } 
 }
