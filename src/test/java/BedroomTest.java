import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(2,BedroomType.DOUBLE);
    }

    @Test
    public void startsEmpty(){
        assertEquals(0, bedroom.getNumberOfGuests());
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(2, bedroom.getRoomNumber());
    }
    @Test
    public void hasNightlyPrice(){
        assertEquals(20, BedroomType.SINGLE.getNightlyPrice());
        assertEquals(40, bedroom.getBedroomType().getNightlyPrice());
    }


}