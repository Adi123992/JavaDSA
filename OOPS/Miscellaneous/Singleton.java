package OOPS.Miscellaneous;

public class Singleton {
    public static Singleton instance;

    //since private we cannot create an object outside this class
    private Singleton() {

    }

    public static Singleton getInstance() {
        //check whether 1 object is created or not
        if (instance == null) {
            instance = new Singleton();

        }
        return instance;
    }
}
