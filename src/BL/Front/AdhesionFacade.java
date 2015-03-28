
package BL.Front;
import BL.DataClasses.User;
import BL.TechnicalClasses.AbstractPersistenceHandlerFactory;
import BL.TechnicalClasses.AdhesionManager;

/**
 * 
 * 
 * @poseidon-object-id [Im619706dm14c21d41ce6mm763c]
 */
public class AdhesionFacade {

	protected AdhesionManager adhesionManager;
	
	public AdhesionFacade(AbstractPersistenceHandlerFactory factory, User currentUser) {
		this.adhesionManager = new AdhesionManager(factory, currentUser);
	}

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im619706dm14c21d41ce6mm7623]
 * @param User 
 * @return 
 */
    public boolean adhesionValidation(User currentUser) {        
        // your code here
        return this.adhesionManager.adhesionValidation(currentUser);
    } 
 }
