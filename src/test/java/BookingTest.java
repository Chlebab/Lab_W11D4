import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    Bedroom bedroom1;

    @Before
    public void setUp(){
        bedroom1 = new Bedroom(1, BedroomType.FAMILY);
        booking = new Booking(bedroom1, 10);
    }

    @Test
    public void canGetBill(){
        assertEquals(1000, booking.getBill());
    }

}
