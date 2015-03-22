
package BL.TechnicalClasses;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import BL.DataClasses.Accessory;
import BL.DataClasses.Room;
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
	
	
	/* Constructors */
	
	public RoomQueryHandler()
	{
		super();
		myRoomFactory = new RoomFactory();
	}
	
	
    public boolean insertRoom(String numero, String superficy) {        
        
    	/* Declarations and initializations */
    	int result = 0;

    	/* Query execution delegated to ConnectionToMySQL */
    	result = ConnectionToMySQL.requestInsertQuery( "insert into Room (id_room,superficy) values('"+numero+"','"+superficy+"');");
    	
    	/* Return value */
    	
    	return (result == 1);
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
    public boolean insertAccessoryRoom(Room room, Accessory accessory, String quantite) {        
        
    	/* Declarations and initializations */
    	int result = 0;

    	/* Query execution delegated to ConnectionToMySQL */
    	result = ConnectionToMySQL.requestInsertQuery( "insert into RoomAccessory (id_room,accessory_name,numberOfAccessory) values('"+room.getId()+"','"+accessory.getName()+"','"+quantite+"');");
        	
    	/* return value */
    	
    	return (result == 1);
    } 

 public boolean insertAccessory(String libelle) {        
        
    	/* Declarations and initializations */
    	int result = 0;

    	/* Query execution delegated to ConnectionToMySQL */
    	result = ConnectionToMySQL.requestInsertQuery( "insert into Accessory (accessory_name) values('"+libelle+"');");
    	
    	/* Return value */
    	
    	return (result == 1);
 
    } 
    
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm4668]
 * @param room 
 * @param number 
 * @return 
 */
    public boolean updateRoom(Room room, String number) {        
    	 
    	/* Declarations and initializations */
    	int result = 0;

    	/* Query execution delegated to ConnectionToMySQL */
    	result = ConnectionToMySQL.requestInsertQuery( "update Room set id_room = '"+number+"' where id_room = '"+room.getId()+"';");
    	
    	/* Return value */
    	
    	return (result == 1);
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
    public boolean updateAccessory(Accessory accessory, String label) {        
    	/* Declarations and initializations */
    	int result = 0;

    	/* Query execution delegated to ConnectionToMySQL */
    	result = ConnectionToMySQL.requestInsertQuery( "update Accessory set accessory_name = '"+label+"' where accessory_name = '"+accessory.getName()+"';");
    	
    	/* Return value */
    	
    	return (result == 1);
    	
    } 

    
    public boolean updateAccessoryRoom(Accessory accessory, Room room, String quantity)
    {
    	/* Declarations and initializations */
    	int result = 0;

    	/* Query execution delegated to ConnectionToMySQL */
    	result = ConnectionToMySQL.requestInsertQuery( "update RoomAccessory set numberOfAccessory = '"+quantity+"' where accessory_name = '"+accessory.getName()+"' and id_room = '"+room.getId()+"';");
    	
    	/* Return value */
    	
    	return (result == 1);
    }
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm4675]
 * @return 
 */
    public ArrayList<Room> selectAllRooms() {        
       	
    	/* Declarations and initializations */
    	ResultSet result;
    	ArrayList<Room> myRooms = new ArrayList<Room>();

    	/* Query execution delegated to ConnectionToMySQL */
    	result = ConnectionToMySQL.requestSelectQuery("Select * from Room;");
    	
    	
    	try {
			while (result.next()) {
			     String id_room = result.getString(1);
			     float superficy = result.getFloat(2);
			     Room myRoom = new Room(id_room,superficy);
			     myRooms.add(myRoom);
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
        return myRooms;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm4679]
 * @return 
 * @throws SQLException 
 */
    public ArrayList<Accessory> selectAllAccessories() {        
        
    	/* Declarations and initializations */
    	ResultSet result;
    	ArrayList<Accessory> myAccessories = new ArrayList<Accessory>();
    	
    	/* Query execution delegated to ConnectionToMySQL */
    	result = ConnectionToMySQL.requestSelectQuery("Select * from Accessory;");
    	
    	
    	try {
			while (result.next()) {
			     String name = result.getString(1);
			     Accessory myAccessory = new Accessory(name);
			     myAccessories.add(myAccessory);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
        return myAccessories;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm467d]
 * @param room 
 * @return 
 */
    public boolean deleteRoom(Room room) {        
     
    	/* Declarations and initializations */
    	int result = 0;

    	/* Query execution delegated to ConnectionToMySQL */
    	result = ConnectionToMySQL.requestInsertQuery( "delete from Room where id_Room = '"+room.getId()+"';");
    	
    	/* Return value */
    	return (result == 1);

    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I29f51818m14c28f165ddmm4682]
 * @param accessory 
 * @return 
 */
    public boolean deleteAccessory(Accessory accessory) {        
        
    	/* Declarations and initializations */
    	int result = 0;

    	/* Query execution delegated to ConnectionToMySQL */
    	result = ConnectionToMySQL.requestInsertQuery( "delete from Accessory where accessory_name = '"+accessory.getName()+"';");
    	
    	/* Return value */
    	
    	return (result == 1);
      
    }
    
    public boolean deleteAccessoryRoom(Room room,Accessory accessory)
    {
    	/* Declarations and initializations */
    	int result = 0;

    	/* Query execution delegated to ConnectionToMySQL */
    	result = ConnectionToMySQL.requestInsertQuery( "delete from RoomAccessory where accessory_name = '"+accessory.getName()+"' and id_room = '"+room.getId()+"';");
    	
    	/* Return value */
    	
    	return (result == 1);
    }

 }
