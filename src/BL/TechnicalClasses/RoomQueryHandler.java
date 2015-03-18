
package BL.TechnicalClasses;
import java.util.Collection;

import BL.ModelClasses.Accessory;
import BL.ModelClasses.Room;
import BL.TechnicalClasses.RoomFactory;
import ConnectionToDB.ConnectionToMySQL;

/**
 * 
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm465b]
 */
public class RoomQueryHandler extends RoomPersistenceHandler {

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm465c]
 * @param numero 
 * @return 
 * 
 */
	private RoomFactory myRoomFactory;
	
	
	//Constructors
	public RoomQueryHandler()
	{
		super();
		myRoomFactory = new RoomFactory();
	}
	
	
    public Room insertRoom(int numero) {        
        
    	// Declarations and initializations
    	int result = 0;
    	Room myRoom;
    	
    	// Query execution delegated to ConnectionToMySQL
    	result = ConnectionToMySQL.requestInsertQuery(????);
    	
    	// Testing return value
    	
    	// The query went well
    	if (result !=0)
    	{
    		myRoomFactory.createRoom(numero);
    	}
    	
    	// The query went wrong
    	else 
    	{
    		myRoom = null;
    	}
    	
    	// Return value
    	return myRoom;
    	
    	
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
    public Accessory insertAccessory(int idRoom, String libelle, int quantite) {        
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
    public Collection<Room> selectAllRooms() {        
        // your code here
        return null;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm4679]
 * @return 
 */
    public Collection<Accessory> selectAllAccessories() {        
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
    public boolean deleteRoom(Room room) {        
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
    public boolean deleteAccessory(Accessory accessory) {        
        // your code here
        return false;
    }

 }
