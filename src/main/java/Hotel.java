import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(String name, ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms) {
        this.name = name;
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }

    public int getNumberOfBedrooms(){
        return bedrooms.size();
    }

    public int getNumberOfConferenceRooms(){
        return conferenceRooms.size();
    }

    public void checkInGuestToRoom(Guest guest, Room room){
        room.addGuest(guest);
    }

    public void checkoutGuestsFromRoom(Guest guest, Room room){
        room.removeGuest(guest);
    }

    public Booking bookRoom(Bedroom bedroom, int numberOfNights){
        return new Booking(bedroom, numberOfNights);
    }
    //    Create a bookRoom method in your Hotel.
    //    This should book a given Bedroom for a number of nights.
    //    This should return a new Booking object.

}
