import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;

    @Before
    public void before() {
        bedroom = new Bedroom(RoomType.DOUBLE, 21);
        guest = new Guest("Jeff");
    }
    @Test
    public void hasRoomType(){
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void canChangeRoomType() {
        bedroom.setRoomType(RoomType.SINGLE);
        assertEquals(RoomType.SINGLE, bedroom.getRoomType());
    }

    @Test
    public void hasCapacity() {
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void guestListStartsEmpty() {
        assertEquals(0, bedroom.guests.size());
    }

    @Test
    public void canAddGuests() {
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.guests.size());
    }

    @Test
    public void canRemoveGuest() {
        bedroom.addGuest(guest);
        bedroom.removeGuest(guest);
        assertEquals(0, bedroom.guests.size());
    }

    @Test
    public void canRemoveAllGuestsFromRoom() {
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        bedroom.emptyRoom();
        assertEquals(0, bedroom.guests.size());
    }

    @Test
    public void hasRoomNumber() {
        assertEquals(21, bedroom.getRoomNumber());
    }

    @Test
    public void canChangeRoomNumber() {
        bedroom.setRoomNumber(31);
        assertEquals(31, bedroom.getRoomNumber());
    }
}
