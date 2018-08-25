package Factory;

public class CarFactory {

    public static Car create(String type) {
        switch (type) {
            case "sport":
                return new Bmw();
            case "classic":
                return new Benz();
            default:
                throw new IllegalArgumentException("Type isn't valid");
        }
    }
}
