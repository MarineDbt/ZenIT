package BL.TechnicalClasses;

import BL.TechnicalClasses.*;
import BL.ModelClasses.*;

public class RoomManager {
	
	private RoomPersistenceHandler myRoomPersistenceHandler;
	
	//Constructor
	public RoomManager ()
	{
		myRoomPersistenceHandler = 
	}
	
	//Creation method
	public Room createRoom(int numero)
	{
		Room myRoom = myRoomPersistenceHandler.insertRoom(numero);
		
		return myRoom;
	}

}
