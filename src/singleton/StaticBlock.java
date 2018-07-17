package singleton;

public class StaticBlock {
    private static StaticBlock instance;

    //private constructor to avoid client applications to use constructor
    private StaticBlock() {
    }

    static {
        try {
            instance = new StaticBlock();
        } catch (Exception e) {
            System.out.print(e.toString());
        }
    }

    public static StaticBlock getInstance() {
        return instance;
    }


}
