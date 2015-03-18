
package BL.Front;

import java.util.Collection;

/**
 * 
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm555c]
 */
public class RoomFacade {

/**
 * <p>Represents ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm555d]
 */
    private BL.TechnicalClasses.RoomManager RoomManager;

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm555e]
 * @param numero 
 * @return 
 */
    public BL.ModelClasses.Room createRoom(int numero) {        
        // your code here
        return null;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm5563]
 * @param idRoom 
 * @param libelle 
 * @param quantite 
 * @return 
 */
    public BL.ModelClasses.Accessory createAccessory(int idRoom, String libelle, int quantite) {        
        // your code here
        return null;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm556a]
 * @param room 
 * @param number 
 * @return 
 */
    public boolean modifyRoom(BL.ModelClasses.Room room, int number) {        
        // your code here
        return false;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm5570]
 * @param accessory 
 * @param label 
 * @param quantity 
 * @return 
 */
    public boolean modifyAccessory(BL.ModelClasses.Accessory accessory, String label, int quantity) {        
        // your code here
        return false;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm5577]
 * @return 
 */
    public Collection<BL.ModelClasses.Room> getAllRooms() {        
        // your code here
        return null;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm557b]
 * @param room 
 * @return 
 */
    public boolean removeRoom(BL.ModelClasses.Room room) {        
        // your code here
        return false;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm5580]
 * @param accessory 
 * @return 
 */
    public boolean removeAccessory(BL.ModelClasses.Accessory accessory) {        
        // your code here
        return false;
    } 
 }
