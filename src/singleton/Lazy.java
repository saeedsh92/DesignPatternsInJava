package singleton;

public class Lazy {
    private static Lazy instance;

    public static Lazy getInstance() {
        if (instance == null)
            instance = new Lazy();
        return instance;
    }

    private Lazy() {

    }
}
