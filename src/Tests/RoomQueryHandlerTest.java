package Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import BL.TechnicalClasses.RoomQueryHandler;

public class RoomQueryHandlerTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInsertRoom() {
		RoomQueryHandler rqh = new RoomQueryHandler();
		int taille = rqh.selectAllRooms().size();
		rqh.insertRoom("1","50");
		assertEquals("insertion échouée",taille+1,rqh.selectAllRooms().size());
	}

	@Test
	public void testInsertAccessoryRoom() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsertAccessory() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateRoom() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectAllRooms() {
		RoomQueryHandler rqh = new RoomQueryHandler();
	
		assertNotNull("Il n'y a aucune salle sélectionnée",rqh.selectAllRooms());
		
	}

	@Test
	public void testUpdateAccessoryRoom() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateAccessory() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectAllAccessories() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteRoom() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteAccessory() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteAccessoryRoom() {
		fail("Not yet implemented");
	}

	@Test
	public void testRoomQueryHandler() {
		fail("Not yet implemented");
	}

}
