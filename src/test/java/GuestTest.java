import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before

    public void before() {
        guest = new Guest("Jeff");
    }

    @Test
    public void canGetName() {
        assertEquals("Jeff", guest.getName());
    }

    @Test
    public void canChangeName() {
        guest.setName("Geoff");
        assertEquals("Geoff", guest.getName());
    }

}
