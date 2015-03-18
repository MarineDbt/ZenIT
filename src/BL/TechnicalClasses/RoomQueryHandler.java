
package BL.TechnicalClasses;
import java.util.Collection;

import BL.ModelClasses.Accessory;
import BL.TechnicalClasses.RoomFactory;

/**
 * 
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm465b]
 */
public class RoomQueryHandler implements BL.TechnicalClasses.RoomPersistenceHandler {

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm465c]
 * @param numero 
 * @return 
 */
    public BL.ModelClasses.Room insertRoom(int numero) {        
        // your code here
        return null;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm4661]
 * @param idRoom 
 * @param libelle 
 * @param quantite 
 * @return 
 */
    public BL.ModelClasses.Accessory insertAccessory(int idRoom, String libelle, int quantite) {        
        // your code here
        return null;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm4668]
 * @param room 
 * @param number 
 * @return 
 */
    public boolean updateRoom(BL.ModelClasses.Room room, int number) {        
        // your code here
        return false;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm466e]
 * @param accesory 
 * @param label 
 * @param quantity 
 * @return 
 */
    public boolean updateAccessory(BL.ModelClasses.Accessory accesory, String label, int quantity) {        
        // your code here
        return false;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm4675]
 * @return 
 */
    public Collection<BL.ModelClasses.Room> selectAllRooms() {        
        // your code here
        return null;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm4679]
 * @return 
 */
    public Collection<BL.ModelClasses.Accessory> selectAllAccessories() {        
        // your code here
        return null;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm467d]
 * @param room 
 * @return 
 */
    public boolean deleteRoom(BL.ModelClasses.Room room) {        
        // your code here
        return false;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm4682]
 * @param accessory 
 * @return 
 */
    public boolean deleteAccessory(BL.ModelClasses.Accessory accessory) {        
        // your code here
        return false;
    }

 }
