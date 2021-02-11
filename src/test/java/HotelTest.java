import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    @Before
    public void before(){
        hotel = new Hotel();
        bedroom1 = new Bedroom(RoomType.SINGLE, 1);
        bedroom2 = new Bedroom(RoomType.DOUBLE, 2);
        bedroom3 = new Bedroom(RoomType.TRIPLE, 3);
        conferenceRoom1 = new ConferenceRoom(RoomType.CONFERENCE, "Eagle");
        conferenceRoom2 = new ConferenceRoom(RoomType.CONFERENCE, "Lion");
    }

    @Test
    public void bedroomListStartsEmpty() {
        assertEquals(0, hotel.bedrooms.size());
    }

    @Test
    public void conferenceRoomListStarsEmpty() {
        assertEquals(0, hotel.conferenceRooms.size());
    }
}
