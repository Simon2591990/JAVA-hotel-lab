import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(RoomType.CONFERENCE, "Eagle");
        guest = new Guest("Jeff");
    }
    @Test
    public void hasRoomType(){
        assertEquals(RoomType.CONFERENCE, conferenceRoom.getRoomType());
    }

    @Test
    public void canChangeRoomType() {
        conferenceRoom.setRoomType(RoomType.SINGLE);
        assertEquals(RoomType.SINGLE, conferenceRoom.getRoomType());
    }

    @Test
    public void hasCapacity() {
        assertEquals(30, conferenceRoom.getCapacity());
    }

    @Test
    public void guestListStartsEmpty() {
        assertEquals(0, conferenceRoom.guests.size());
    }

    @Test
    public void canAddGuests() {
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.guests.size());
    }

    @Test
    public void canRemoveGuest() {
        conferenceRoom.addGuest(guest);
        conferenceRoom.removeGuest(guest);
        assertEquals(0, conferenceRoom.guests.size());
    }

    @Test
    public void canRemoveAllGuestsFromRoom() {
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest);
        conferenceRoom.emptyRoom();
        assertEquals(0, conferenceRoom.guests.size());
    }

    @Test
    public void hasName() {
        assertEquals("Eagle", conferenceRoom.getName());
    }

    @Test
    public void canChangeName() {
        conferenceRoom.setName("Lion");
        assertEquals("Lion", conferenceRoom.getName());

    }
}
