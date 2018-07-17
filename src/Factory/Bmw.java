package Factory;

public class Bmw implements Car {
    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " started");
    }

    @Override
    public void stop() {
        System.out.println(getClass().getSimpleName() + " stopped");
    }

    @Override
    public void turnRight() {
        System.out.println(getClass().getSimpleName() + " is turning to right");
    }

    @Override
    public void turnLeft() {
        System.out.println(getClass().getSimpleName() + " is turning to left");
    }

}
