package Factory;

public class CarFactory {

    public static Car create(String companyName) {
        switch (companyName) {
            case "bmw":
                return new Bmw();
            case "benz":
                return new Benz();
            default:
                throw new IllegalArgumentException("Company name isn't valid");
        }
    }
}
