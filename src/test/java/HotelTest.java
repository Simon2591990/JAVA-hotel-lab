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
        guest1 = new Guest("Jeff");
    }

    @Test
    public void bedroomListStartsEmpty() {
        assertEquals(0, hotel.getBedrooms().size());
    }

    @Test
    public void conferenceRoomListStarsEmpty() {
        assertEquals(0, hotel.getConferenceRooms().size());
    }

    @Test
    public void canAddBedroom() {
        hotel.addBedroom(bedroom1);
        assertEquals(1, hotel.getBedrooms().size());
    }

    @Test
    public void canAddConferenceRoom() {
        hotel.addConferenceRoom(conferenceRoom1);
        assertEquals(1, hotel.getConferenceRooms().size());
    }

    @Test
    public void canAddGuestToRoom() {
        hotel.addBedroom(bedroom1);
        hotel.addBedroom(bedroom2);
        hotel.addBedroom(bedroom3);
        hotel.addGuestToBedroom(2,guest1);
        assertEquals(0, bedroom1.getGuests().size());
        assertEquals(1, bedroom2.getGuests().size());
        assertEquals(0, bedroom3.getGuests().size());
    }

    @Test
    public void canAddGuestToConferenceRoom() {
        hotel.addConferenceRoom(conferenceRoom1);
        hotel.addConferenceRoom(conferenceRoom2);
        hotel.addGuestToConferenceRoom("Lion", guest1);
        assertEquals(0, conferenceRoom1.getGuests().size());
        assertEquals(1, conferenceRoom2.getGuests().size());
    }

    @Test
    public void canRemoveGuestFromBedroom() {
        hotel.addBedroom(bedroom1);
        hotel.addGuestToBedroom(1,guest1);
        hotel.removeGuestFromBedroom(1, guest1);
        assertEquals(0, bedroom1.getGuests().size());
    }

    @Test
    public void canRemoveGuestFromConference() {
        hotel.addConferenceRoom(conferenceRoom1);
        hotel.addGuestToConferenceRoom("Eagle", guest1);
        hotel.removeGuestFromConferenceRoom("Eagle", guest1);
        assertEquals(0, conferenceRoom1.getGuests().size());
    }
}
