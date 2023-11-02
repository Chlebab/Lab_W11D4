import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(10, "David Attenborough");
    }

    @Test
    public void hasName(){
        assertEquals("David Attenborough", conferenceRoom.getName());
    }

    @Test
    public void hasCapacity(){
        assertEquals(10, conferenceRoom.getCapacity());
    }

}
