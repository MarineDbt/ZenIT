package BL.TechnicalClasses;

import java.util.ArrayList;

import BL.TechnicalClasses.*;
import BL.DataClasses.*;

public class RoomManager {
	
	private RoomPersistenceHandler myRoomPersistenceHandler;
	
	/* Constructor */
	public RoomManager (AbstractPersistenceHandlerFactory factory)
	{
		
		myRoomPersistenceHandler = factory.createRoomPersistenceHandler();
	}
	
	/* Creation method */
	public boolean createRoom(String numero, String superficy)
	{
		boolean result = myRoomPersistenceHandler.insertRoom(numero,superficy);
		
		return result;
	}

	public boolean addAccessory(Room room, Accessory accessory, String quantite){
		
		boolean result = myRoomPersistenceHandler.insertAccessoryRoom(room, accessory, quantite);
		
		return result;
	}
	
	public boolean createAccessory(String libelle){
		
		boolean result = myRoomPersistenceHandler.insertAccessory(libelle);
		
		return result;
	}
	
	public boolean modifyRoom(Room room, String number) {        
	       
    	/* Passing method call to myRoomPersistenceHandler */
    	
        return myRoomPersistenceHandler.updateRoom(room, number);
        
    } 
	
	public boolean modifyAccessory(Accessory accessory, String label) {        
    	/* Passing method call to myRoomPersistenceHandler */
    	
        return myRoomPersistenceHandler.updateAccessory(accessory, label);

    } 
	
	   public boolean modifyAccessoryRoom(Accessory accessory, Room room, String quantity) {        
       	
		   /* Passing method call to myRoomPersistenceHandler */
       	
           return myRoomPersistenceHandler.updateAccessoryRoom(accessory, room, quantity);

       } 
	   
	public boolean removeRoom(Room room) {        
	    	/* Passing method call to myRoomPersistenceHandler */
	    	
	        return myRoomPersistenceHandler.deleteRoom(room);
	}

	public boolean removeAccessory(Accessory accessory) {        
	    	/* Passing method call to myRoomPersistenceHandler */
	    	
	        return myRoomPersistenceHandler.deleteAccessory(accessory);
	    } 
	
	public boolean removeAccessoryRoom(Room room,Accessory accessory) {        
    	/* Passing method call to myRoomPersistenceHandler */
    	
        return myRoomPersistenceHandler.deleteAccessoryRoom(room,accessory);
    } 

	public ArrayList<Accessory> getAllAccessories()
	{
		/* Passing method call to myRoomPersistenceHandler */
    	
        return myRoomPersistenceHandler.selectAllAccessories();
	}
	
	public ArrayList<Room> getAllRooms()
	{
		/* Passing method call to myRoomPersistenceHandler */
    	
        return myRoomPersistenceHandler.selectAllRooms();
	}

	public ArrayList<ContainsAcc> getAllContainsAcc(Room myRoom) {

		return myRoomPersistenceHandler.selectAllContainsAcc(myRoom);
	}

}



