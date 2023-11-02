import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    ConferenceRoom conferenceRoom1;
    Guest guest1;
    Guest guest2;
    Guest guest3;



    @Before
    public void before(){
        bedroom1 = new Bedroom(1, BedroomType.FAMILY);
        bedroom2 = new Bedroom(2, BedroomType.DOUBLE);
        bedroom3 = new Bedroom(3, BedroomType.SINGLE);
        conferenceRoom1 = new ConferenceRoom(99, "Krzysztof");
        guest1 = new Guest("Tomasz");
        guest2 = new Guest("Mateusz");
        guest3 = new Guest("Poniedzielnik");

        ArrayList<Bedroom> bedrooms = new ArrayList<>();
        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);
        bedrooms.add(bedroom3);

        ArrayList<ConferenceRoom> conferenceRooms = new ArrayList<>();
        conferenceRooms.add(conferenceRoom1);

        hotel = new Hotel("Skibo Castle", bedrooms, conferenceRooms);
    }

    @Test
    public void hasBedrooms(){
        assertEquals(3, hotel.getBedrooms().size());
        assertEquals(3, hotel.getNumberOfBedrooms());
    }

    @Test
    public void hasConferenceRooms(){
        assertEquals(1, hotel.getConferenceRooms().size());
        assertEquals(1, hotel.getNumberOfConferenceRooms());
    }

    @Test
    public void canCheckInGuest(){
        hotel.checkInGuestToRoom(guest1, bedroom1);
        hotel.checkInGuestToRoom(guest2, bedroom1);
        assertEquals(2, bedroom1.getNumberOfGuests());
    }

    @Test
    public void canCheckOutGuests(){
        hotel.checkInGuestToRoom(guest1, bedroom1);
        hotel.checkInGuestToRoom(guest2, bedroom1);
        hotel.checkoutGuestsFromRoom(guest1, bedroom1);
        assertEquals(1, bedroom1.getNumberOfGuests());
    }

    @Test
    public void isBookingCreated(){
        Booking booking1 = hotel.bookRoom(bedroom1, 3);
        assertEquals(bedroom1, booking1.getBedroom());
        assertEquals(3, booking1.getNumberOfNights());
    }

}
