package singleton;

public class Eager {
    private static Eager instance = new Eager();

    //private constructor to avoid client applications to use constructor
    private Eager(){

    }

    public static Eager getInstance() {
        return instance;
    }



}
