
package BL.TechnicalClasses;

import java.util.Collection;

/**
 * 
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm462e]
 */
public interface RoomPersistenceHandler {
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm462f]
 * @param numero 
 * @return 
 */
    public BL.ModelClasses.Room insertRoom(int numero);
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm4634]
 * @param idRoom 
 * @param libelle 
 * @param quantite 
 * @return 
 */
    public BL.ModelClasses.Accessory insertAccessory(int idRoom, String libelle, int quantite);
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm463b]
 * @param room 
 * @param number 
 * @return 
 */
    public boolean updateRoom(BL.ModelClasses.Room room, int number);
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm4641]
 * @param accessory 
 * @param label 
 * @param quantity 
 * @return 
 */
    public boolean updateAccessory(BL.ModelClasses.Accessory accessory, String label, int quantity);
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm4648]
 * @return 
 */
    public Collection<BL.ModelClasses.Room> selectAllRooms();
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm464c]
 * @return 
 */
    public Collection<BL.ModelClasses.Accessory> selectAllAccessories();
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm4650]
 * @param room 
 * @return 
 */
    public boolean deleteRoom(BL.ModelClasses.Room room);
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm4655]
 * @param accessory 
 * @return 
 */
    public boolean deleteAccessory(BL.ModelClasses.Accessory accessory);
}


