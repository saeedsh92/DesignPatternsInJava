import Factory.Car;
import Factory.CarFactory;
import builder.User;
import facade.ComputerFacade;

public class Application {

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Testing Builder Pattern...");
        User user = new User.Builder("saeedshahiniit@gmail.com")
                .setFirstName("Saeed")
                .setLastName("Shahini")
                .setPhoneNumber("+989378122153")
                .build();

        System.out.println("User object has been created ");
        System.out.println("First Name: " + user.getFirstName());
        System.out.println("Last Name: " + user.getLastName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Phone Number: " + user.getPhoneNumber());


        System.out.println("Testing Factory Pattern...");
        Car car = CarFactory.create("classic");
        car.startEngine();
        car.turnRight();
        car.turnLeft();
        car.stop();

        System.out.println("Facade Design Pattern Sample...");
        ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.makePowerfulComputer();
        //Or
        computerFacade.makeEconomicComputer();

    }
}
