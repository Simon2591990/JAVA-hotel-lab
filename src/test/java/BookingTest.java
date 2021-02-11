import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(RoomType.SINGLE, 10);
        booking = new Booking(bedroom, 3);
    }

    @Test
    public void hasNights() {
        assertEquals(3, booking.getNights());
    }

    @Test
    public void hasBedroom() {
        assertEquals(10, booking.getBedroom().getRoomNumber());
    }
}
