package OOPS;

public class MainSingleton {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();//1 object is created
        Singleton obj2 = Singleton.getInstance();//the same object of obj1 is returned
        Singleton obj3 = Singleton.getInstance();//the same object of obj1 is returned
    }
}
