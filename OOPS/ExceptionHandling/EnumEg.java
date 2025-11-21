package OOPS.ExceptionHandling;

public class EnumEg {


    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
    }

    enum Week {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

        Week() {
            System.out.println("Constructor called for : " + this);
        }
    }
}
