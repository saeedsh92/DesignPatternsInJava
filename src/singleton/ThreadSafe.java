package singleton;

public class ThreadSafe {
    private static ThreadSafe instance;

    private ThreadSafe() {

    }

    public static synchronized ThreadSafe getInstance() {
        if (instance == null)
            instance = new ThreadSafe();

        return instance;
    }
}
