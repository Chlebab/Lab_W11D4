import org.w3c.dom.ls.LSOutput;

public enum BedroomType {
    SINGLE(1, 20),
    DOUBLE(2, 40),
    TRIPLE(3, 60),
    FAMILY(4, 100);

    private final int capacity;
    private final int nightlyPrice;

    BedroomType(int capacity, int nightlyPrice){
        this.capacity = capacity;
        this.nightlyPrice = nightlyPrice;
    }


    public int getCapacity(){
        return this.capacity;
    }

    public int getNightlyPrice(){
        return nightlyPrice;
    }
}
