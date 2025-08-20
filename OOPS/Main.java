package OOPS;

public class Main {
    public static void main(String[] args) {
        Human aditya = new Human(20, "Aditya", 25000, false);
        Human tejas = new Human(21, "Tejas", 27000, false);


        System.out.println(Human.population);
        System.out.println(Human.population);
    }
}
//Instance Variable
//
//An instance variable is a variable that belongs to an object (instance) of a class.
//
//It is declared inside a class, but outside methods/constructors (like your age, name, salary, married in Human).
//
//Each object gets its own copy of these variables.