
package BL.TechnicalClasses;

import java.util.Collection;

import BL.ModelClasses.*;

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
    public abstract Room insertRoom(int numero);
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm4634]
 * @param idRoom 
 * @param libelle 
 * @param quantite 
 * @return 
 */
    public abstract Accessory insertAccessory(int idRoom, String libelle, int quantite);
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm463b]
 * @param room 
 * @param number 
 * @return 
 */
    public abstract boolean updateRoom(Room room, int number);
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm4641]
 * @param accessory 
 * @param label 
 * @param quantity 
 * @return 
 */
    public abstract boolean updateAccessory(Accessory accessory, String label, int quantity);
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm4648]
 * @return 
 */
    public abstract Collection<Room> selectAllRooms();
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm464c]
 * @return 
 */
    public abstract Collection<Accessory> selectAllAccessories();
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
}


