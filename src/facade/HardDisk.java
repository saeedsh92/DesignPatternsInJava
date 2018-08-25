package facade;

public class HardDisk {
    private String type;
    private int capacityInGigabyte;

    public HardDisk(String type, int capacityInGigabyte) {
        this.type = type;
        this.capacityInGigabyte = capacityInGigabyte;
    }

    public String getType() {
        return type;
    }

    public int getCapacityInGigabyte() {
        return capacityInGigabyte;
    }
}
