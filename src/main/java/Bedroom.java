import java.util.ArrayList;

public class Bedroom extends Room {

    private BedroomType bedroomType;
    private int roomNumber;

    public Bedroom(int roomNumber, BedroomType bedroomType) {
        super(bedroomType.getCapacity());
        this.roomNumber = roomNumber;
        this.bedroomType = bedroomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public BedroomType getBedroomType(){
        return bedroomType;
    }

}

