
package BL.TechnicalClasses;

import java.util.ArrayList;
import java.util.Collection;

import BL.DataClasses.*;

/**
 * 
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm462e]
 */
public abstract class RoomPersistenceHandler {
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm462f]
 * @param numero 
 * @return 
 */
    public abstract boolean insertRoom(String numero, String superficy);
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm4634]
 * @param idRoom 
 * @param libelle
 * @param quantite 
 * @return 
 */
    public abstract boolean insertAccessoryRoom(Room room, Accessory accessory, String quantite);
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm463b]
 * @param room 
 * @param number 
 * @return 
 */
    public abstract boolean insertAccessory(String libelle);
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm463b]
 * @param room 
 * @param number 
 * @return 
 */
    
    public abstract boolean updateRoom(Room room, String number);
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm4641]
 * @param accessory 
 * @param label 
 * @param quantity 
 * @return 
 */
    
    public abstract ArrayList<Room> selectAllRooms();
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm464c]
 * @return 
 */
    
    public abstract boolean updateAccessoryRoom(Accessory accessory, Room room, String quantity);
    /**
     * <p>Does ...</p>
     * 
     * @poseidon-object-id [I29f51818m14c28f165ddmm4648]
     * @return 
     */
    
    public abstract boolean updateAccessory(Accessory accessory,String quantity);
    /**
     * <p>Does ...</p>
     * 
     * @poseidon-object-id [I29f51818m14c28f165ddmm4648]
     * @return 
     */
    
    public abstract ArrayList<Accessory> selectAllAccessories();
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm4650]
 * @param room 
 * @return 
 */
    public abstract boolean deleteRoom(Room room);
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm4655]
 * @param accessory 
 * @return 
 */
    public abstract boolean deleteAccessory(Accessory accessory);
    
    public abstract boolean deleteAccessoryRoom(Room room,Accessory accessory);
	
    public abstract ArrayList<ContainsAcc> selectAllContainsAcc(Room room);
}


