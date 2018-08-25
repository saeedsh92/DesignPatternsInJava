package facade;

public class Ram {

    private String type;
    private int capacity;

    public Ram(String type, int capacityInGigabyte){
        this.type = type;
        this.capacity = capacityInGigabyte;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }
}
