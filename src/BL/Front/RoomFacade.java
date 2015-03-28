
package BL.Front;

import java.util.ArrayList;
import java.util.Collection;

import BL.TechnicalClasses.*;
import BL.DataClasses.*;

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
    private RoomManager RoomManager;

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm555e]
 * @param numero 
 * @return 
 */
   
    /* Constructor */
    
    public RoomFacade (AbstractPersistenceHandlerFactory factory)
    {
    	RoomManager = new RoomManager(factory);
    	
    }
    
    public boolean createRoom(String numero, String superficy) {        
        
    	boolean result = RoomManager.createRoom(numero,superficy);
    	
        return result;
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
    public boolean addAccessory(Room room, Accessory accessory, String quantite) {        
        
    	/* Passing method call to RoomManager */
    	
        return RoomManager.addAccessory(room, accessory, quantite);
    } 

    

    public boolean createAccessory(String libelle) {        
    	
    	/* Passing method call to RoomManager */
    	
        return RoomManager.createAccessory(libelle);
    } 
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm556a]
 * @param room 
 * @param number 
 * @return 
 */
    public boolean modifyRoom(Room room, String number) {        
       
    	/* Passing method call to RoomManager */
    	
        return RoomManager.modifyRoom(room, number);
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
    public boolean modifyAccessory(Accessory accessory, String label) {        
    	/* Passing method call to RoomManager */
    	
        return RoomManager.modifyAccessory(accessory, label);

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
     public boolean modifyAccessoryRoom(Accessory accessory, Room room, String quantity) {        
        	/* Passing method call to RoomManager */
        	
            return RoomManager.modifyAccessoryRoom(accessory, room, quantity);

        } 

 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm557b]
 * @param room 
 * @return 
 */
    public boolean removeRoom(Room room) {        
    	/* Passing method call to RoomManager */
    	
        return RoomManager.removeRoom(room);
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm5580]
 * @param accessory 
 * @return 
 */
    public boolean removeAccessory(Accessory accessory) {        
    	/* Passing method call to RoomManager */
    	
        return RoomManager.removeAccessory(accessory);
    } 
    
    public boolean removeAccessoryRoom(Room room,Accessory accessory) {        
    	/* Passing method call to RoomManager */
    	
        return RoomManager.removeAccessoryRoom(room,accessory);
    } 
  
    /* Selection methods */
    
    /**
     * <p>Does ...</p>
     * 
     * @poseidon-object-id [I29f51818m14c28f165ddmm5577]
     * @return 
     */
        public ArrayList<Accessory> getAllAccessories() {        
        	
        	/* Passing method call to RoomManager */
        	
            return RoomManager.getAllAccessories();       
        }
        
        /**
         * <p>Does ...</p>
         * 
         * @poseidon-object-id [I29f51818m14c28f165ddmm5577]
         * @return 
         */
            public ArrayList<Room> getAllRooms() {        
            	
            	/* Passing method call to RoomManager */
            	
                return RoomManager.getAllRooms();  
            }
            
   public ArrayList<ContainsAcc> getAllContainsAcc(Room myRoom) {        
   
	   /* Passing method call to RoomManager */
            	
       return RoomManager.getAllContainsAcc(myRoom);  
   }          
            
 }
