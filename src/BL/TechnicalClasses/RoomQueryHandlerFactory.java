package BL.TechnicalClasses;

public class RoomQueryHandlerFactory extends RoomPersistenceHandlerFactory {
	
	//Constructor
	public RoomQueryHandlerFactory()
	{
		super();
	}
	
	public RoomPersistenceHandler createRoomPersistenceHandler()
	{
		return new RoomQueryHandler();
	}

}
