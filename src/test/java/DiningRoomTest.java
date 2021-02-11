import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;

    @Before
    public void before() {
        diningRoom = new DiningRoom(RoomType.DININGROOM, "Bite Site", 50);

    }

    @Test
    public void hasName() {
        assertEquals("Bite Site",diningRoom.getName());
    }

    @Test
    public void hasCapacity() {
        assertEquals(50, diningRoom.getCapacity());
    }

    @Test
    public void canChangeName() {
        diningRoom.setName("Dragon");
        assertEquals("Dragon", diningRoom.getName());
    }

    @Test
    public void canChangeCapacity() {
        diningRoom.setCapacity(45);
        assertEquals(45, diningRoom.getCapacity());
    }
}
