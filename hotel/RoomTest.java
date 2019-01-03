//P2.13
package ss.week3.hotel;

import org.junit.Before;
import org.junit.Test;
import ss.week2.hotel.Guest;
import ss.week2.hotel.Room;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class RoomTest {
    private Guest guest;
    private Room room;
    private Safe safe;

    @Before
    public void setUp() {
        guest = new Guest("Jip");
        room = new Room(101);
    }

    @Test
    public void testSetUp() {
        assertEquals(101, room.getNumber());
    }

    @Test
    public void testSetGuest() {
        room.setGuest(guest);
        assertEquals(guest, room.getGuest());
    }
    
    //P 2.13
    @Test
    public void testGetSafe()
    {
       	assertEquals(safe, room.getSafe());
    }
    
    @Test
    public void testSafe()
    {
    	assertNotEquals(null,room.getSafe());
    	assertEquals(false,room.getSafe().isOpen());
    	assertEquals(false,room.getSafe().isActive());
    }

}
